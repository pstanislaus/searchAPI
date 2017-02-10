
package com.apple.itunes;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wrapperType",
    "kind",
    "artistId",
    "trackId",
    "artistName",
    "trackName",
    "trackCensoredName",
    "artistViewUrl",
    "trackViewUrl",
    "previewUrl",
    "artworkUrl30",
    "artworkUrl60",
    "artworkUrl100",
    "collectionPrice",
    "trackPrice",
    "releaseDate",
    "collectionExplicitness",
    "trackExplicitness",
    "trackTimeMillis",
    "country",
    "currency",
    "primaryGenreName",
    "contentAdvisoryRating",
    "longDescription",
    "trackRentalPrice",
    "collectionHdPrice",
    "trackHdPrice",
    "trackHdRentalPrice",
    "shortDescription",
    "collectionId",
    "collectionName"
})
public class Result {

    @JsonProperty("wrapperType")
    private String wrapperType;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("artistId")
    private Integer artistId;
    @JsonProperty("trackId")
    private Integer trackId;
    @JsonProperty("artistName")
    private String artistName;
    @JsonProperty("trackName")
    private String trackName;
    @JsonProperty("trackCensoredName")
    private String trackCensoredName;
    @JsonProperty("artistViewUrl")
    private String artistViewUrl;
    @JsonProperty("trackViewUrl")
    private String trackViewUrl;
    @JsonProperty("previewUrl")
    private String previewUrl;
    @JsonProperty("artworkUrl30")
    private String artworkUrl30;
    @JsonProperty("artworkUrl60")
    private String artworkUrl60;
    @JsonProperty("artworkUrl100")
    private String artworkUrl100;
    @JsonProperty("collectionPrice")
    private Double collectionPrice;
    @JsonProperty("trackPrice")
    private Double trackPrice;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonProperty("collectionExplicitness")
    private String collectionExplicitness;
    @JsonProperty("trackExplicitness")
    private String trackExplicitness;
    @JsonProperty("trackTimeMillis")
    private Integer trackTimeMillis;
    @JsonProperty("country")
    private String country;
    @JsonProperty("collectionId")
    private String collectionId;
    @JsonProperty("currency")
    private String currency;
	@JsonProperty("primaryGenreName")
    private String primaryGenreName;
    @JsonProperty("contentAdvisoryRating")
    private String contentAdvisoryRating;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("trackRentalPrice")
    private Double trackRentalPrice;
    @JsonProperty("collectionHdPrice")
    private Double collectionHdPrice;
    @JsonProperty("trackHdPrice")
    private Double trackHdPrice;
    @JsonProperty("trackHdRentalPrice")
    private Double trackHdRentalPrice;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    @JsonProperty("isStreamable")
    private Boolean isStreamable;
    

    @JsonProperty("isStreamable")
    public Boolean getIsStreamable() {
        return isStreamable;
    }

    @JsonProperty("isStreamable")
    public void setIsStreamable(Boolean isStreamable) {
        this.isStreamable = isStreamable;
    }
    
	@JsonProperty("collectionCensoredName")
    private String collectionCensoredName;
    
    @JsonProperty("collectionArtistId")
    private String collectionArtistId;
    
    @JsonProperty("collectionViewUrl")
    private String collectionViewUrl;
    
    @JsonProperty("discCount")
    private double discCount;
    
    @JsonProperty("discNumber")
    private int discNumber;
    
    @JsonProperty("trackCount")
    private int trackCount;
    
    @JsonProperty("trackNumber")
    private int trackNumber;
    
    public String getCollectionArtistName() {
		return collectionArtistName;
	}
	public void setCollectionArtistName(String collectionArtistName) {
		this.collectionArtistName = collectionArtistName;
	}
	@JsonProperty("collectionArtistName")
    private String collectionArtistName;
    
    public int getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	public int getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}
	public int getDiscNumber() {
		return discNumber;
	}
	public void setDiscNumber(int discNumber) {
		this.discNumber = discNumber;
	}
	public double getDiscCount() {
		return discCount;
	}
	public void setDiscCount(double discCount) {
		this.discCount = discCount;
	}
	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}
	public void setCollectionViewUrl(String collectionViewUrl) {
		this.collectionViewUrl = collectionViewUrl;
	}
	@JsonProperty("collectionArtistId")
    public String getCollectionArtistId() {
		return collectionArtistId;
	}
    @JsonProperty("collectionArtistId")
	public void setCollectionArtistId(String collectionArtistId) {
		this.collectionArtistId = collectionArtistId;
	}
	@JsonProperty("collectionCensoredName")
    public String getCollectionCensoredName() {
		return collectionCensoredName;
	}
    @JsonProperty("collectionCensoredName")
	public void setCollectionCensoredName(String collectionCensoredName) {
		this.collectionCensoredName = collectionCensoredName;
	}
	@JsonProperty("collectionName")
    private String collectionName;
    
    @JsonProperty("collectionName")
    public String getCollectionName() {
		return collectionName;
	}
    @JsonProperty("collectionName")
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	@JsonProperty("wrapperType")
    public String getWrapperType() {
        return wrapperType;
    }

    @JsonProperty("wrapperType")
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("artistId")
    public Integer getArtistId() {
        return artistId;
    }

    @JsonProperty("artistId")
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @JsonProperty("trackId")
    public Integer getTrackId() {
        return trackId;
    }

    @JsonProperty("trackId")
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("artistName")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @JsonProperty("trackName")
    public String getTrackName() {
        return trackName;
    }

    @JsonProperty("trackName")
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @JsonProperty("trackCensoredName")
    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    @JsonProperty("trackCensoredName")
    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    @JsonProperty("artistViewUrl")
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    @JsonProperty("artistViewUrl")
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    @JsonProperty("trackViewUrl")
    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    @JsonProperty("trackViewUrl")
    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    @JsonProperty("previewUrl")
    public String getPreviewUrl() {
        return previewUrl;
    }

    @JsonProperty("previewUrl")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    @JsonProperty("artworkUrl30")
    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    @JsonProperty("artworkUrl30")
    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    @JsonProperty("artworkUrl60")
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    @JsonProperty("artworkUrl60")
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    @JsonProperty("artworkUrl100")
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    @JsonProperty("artworkUrl100")
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    @JsonProperty("collectionPrice")
    public Double getCollectionPrice() {
        return collectionPrice;
    }

    @JsonProperty("collectionPrice")
    public void setCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    @JsonProperty("trackPrice")
    public Double getTrackPrice() {
        return trackPrice;
    }

    @JsonProperty("trackPrice")
    public void setTrackPrice(Double trackPrice) {
        this.trackPrice = trackPrice;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("collectionExplicitness")
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    @JsonProperty("collectionExplicitness")
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    @JsonProperty("trackExplicitness")
    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    @JsonProperty("trackExplicitness")
    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    @JsonProperty("trackTimeMillis")
    public Integer getTrackTimeMillis() {
        return trackTimeMillis;
    }

    @JsonProperty("trackTimeMillis")
    public void setTrackTimeMillis(Integer trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("primaryGenreName")
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    @JsonProperty("primaryGenreName")
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    @JsonProperty("contentAdvisoryRating")
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    @JsonProperty("contentAdvisoryRating")
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("trackRentalPrice")
    public Double getTrackRentalPrice() {
        return trackRentalPrice;
    }

    @JsonProperty("trackRentalPrice")
    public void setTrackRentalPrice(Double trackRentalPrice) {
        this.trackRentalPrice = trackRentalPrice;
    }

    @JsonProperty("collectionHdPrice")
    public Double getCollectionHdPrice() {
        return collectionHdPrice;
    }

    @JsonProperty("collectionHdPrice")
    public void setCollectionHdPrice(Double collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
    }

    @JsonProperty("trackHdPrice")
    public Double getTrackHdPrice() {
        return trackHdPrice;
    }

    @JsonProperty("trackHdPrice")
    public void setTrackHdPrice(Double trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
    }

    @JsonProperty("trackHdRentalPrice")
    public Double getTrackHdRentalPrice() {
        return trackHdRentalPrice;
    }

    @JsonProperty("trackHdRentalPrice")
    public void setTrackHdRentalPrice(Double trackHdRentalPrice) {
        this.trackHdRentalPrice = trackHdRentalPrice;
    }

    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @JsonProperty("collectionId")
    public String getCollectionId() {
		return collectionId;
	}
    @JsonProperty("collectionId")
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	
}
