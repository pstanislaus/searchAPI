package com.apple.itunes;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class ITunesSearchTestCase {
	ObjectMapper mapper = new ObjectMapper();

	public ITunesSearchTestCase() {
		RestAssured.baseURI = "https://itunes.apple.com/";
	}

	@Test
	public void doSearchWithAllParameters() throws Exception {
		Response andReturn = given().param("term", "jack+johnson").param("country", "US").param("media", "movie").param("limit", "200").contentType("application/json").accept("application/json").get("search").andReturn();
		System.out.println(andReturn.getBody().asString());
		SearchResponse searchResponse = mapper.readValue(andReturn.getBody().asString(), SearchResponse.class);
		assertThat(searchResponse.getResultCount(), is(greaterThan(1)));
		assertThat(searchResponse.getResults().get(0).getKind(), is(equalTo("feature-movie")));
	}

	@Test
	public void doSearchByCountry() throws Exception {
		Response andReturn = given().param("term", "johnson").param("country", "US").param("media", "movie").param("limit", "200").contentType("application/json").get("search").andReturn();
		System.out.println(andReturn.getBody().asString());
		SearchResponse searchResponse = mapper.readValue(andReturn.getBody().asString(), SearchResponse.class);
		assertThat(searchResponse.getResultCount(), is(greaterThan(1)));

	}

	@Test
	public void doSearchWithNoParams() throws Exception {
		Response andReturn = given().get("search").andReturn();
		System.out.println(andReturn.getBody().asString());
		SearchResponse searchResponse = mapper.readValue(andReturn.getBody().asString(), SearchResponse.class);
		assertThat(searchResponse.getResultCount(), is(equalTo(0)));
		assertThat(searchResponse.getResults().size(), is(equalTo(0)));
	}

	@Test
	public void doSearchWithAllMediaTypes() throws Exception {
		Response andReturn = given().param("term", "johnson").param("country", "US").param("media", "all").param("limit", "2").contentType("application/json").get("search").andReturn();
		System.out.println(andReturn.getBody().asString());
		SearchResponse searchResponse = mapper.readValue(andReturn.getBody().asString(), SearchResponse.class);
		assertThat(searchResponse.getResultCount(), is(equalTo(2)));
		assertThat(searchResponse.getResults().get(0).getCountry(), is(equalTo("USA")));
	}

	@Test
	public void doSearchWithOtherCountries() throws Exception {
		Response andReturn = given().param("term", "johnson").param("country", "IN").param("media", "all").param("limit", "2").contentType("application/json").get("search").andReturn();
		System.out.println(andReturn.getBody().asString());
		SearchResponse searchResponse = mapper.readValue(andReturn.getBody().asString(), SearchResponse.class);
		assertThat(searchResponse.getResultCount(), is(equalTo(2)));
		assertThat(searchResponse.getResults().get(0).getCountry(), is(equalTo("IND")));
	}

	@Test
	public void searchResultsShouldNotExceedMoreThanSpecifiedLimit() throws Exception {
		Response andReturn = given().param("term", "johnson").param("country", "IN").param("media", "all").param("limit", "10").contentType("application/json").get("search").andReturn();
		System.out.println(andReturn.getBody().asString());
		SearchResponse searchResponse = mapper.readValue(andReturn.getBody().asString(), SearchResponse.class);
		assertThat(searchResponse.getResultCount(), is(equalTo(10)));
		assertThat(searchResponse.getResults().get(0).getCountry(), is(equalTo("IND")));
	}

}
