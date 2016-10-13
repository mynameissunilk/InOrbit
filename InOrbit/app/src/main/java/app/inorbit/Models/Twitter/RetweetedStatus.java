package app.inorbit.Models.Twitter;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RetweetedStatus {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("truncated")
    @Expose
    private boolean truncated;
    @SerializedName("entities")
    @Expose
    private Entities__ entities;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("contributors")
    @Expose
    private Object contributors;
    @SerializedName("is_quote_status")
    @Expose
    private boolean isQuoteStatus;
    @SerializedName("retweet_count")
    @Expose
    private int retweetCount;
    @SerializedName("favorite_count")
    @Expose
    private int favoriteCount;
    @SerializedName("favorited")
    @Expose
    private boolean favorited;
    @SerializedName("retweeted")
    @Expose
    private boolean retweeted;
    @SerializedName("possibly_sensitive")
    @Expose
    private boolean possiblySensitive;
    @SerializedName("lang")
    @Expose
    private String lang;

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The id
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The idStr
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     *
     * @param idStr
     * The id_str
     */
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The truncated
     */
    public boolean isTruncated() {
        return truncated;
    }

    /**
     *
     * @param truncated
     * The truncated
     */
    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    /**
     *
     * @return
     * The entities
     */
    public Entities__ getEntities() {
        return entities;
    }

    /**
     *
     * @param entities
     * The entities
     */
//    public void setEntities(Entities__ entities) {
//        this.entities = entities;
//    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The inReplyToStatusId
     */
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     *
     * @param inReplyToStatusId
     * The in_reply_to_status_id
     */
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     *
     * @return
     * The inReplyToStatusIdStr
     */
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     *
     * @param inReplyToStatusIdStr
     * The in_reply_to_status_id_str
     */
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    /**
     *
     * @return
     * The inReplyToUserId
     */
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     *
     * @param inReplyToUserId
     * The in_reply_to_user_id
     */
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     *
     * @return
     * The inReplyToUserIdStr
     */
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     *
     * @param inReplyToUserIdStr
     * The in_reply_to_user_id_str
     */
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    /**
     *
     * @return
     * The inReplyToScreenName
     */
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     *
     * @param inReplyToScreenName
     * The in_reply_to_screen_name
     */
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     *
     * @return
     * The user
     */
    public User_ getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User_ user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The geo
     */
    public Object getGeo() {
        return geo;
    }

    /**
     *
     * @param geo
     * The geo
     */
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     *
     * @return
     * The coordinates
     */
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     *
     * @param coordinates
     * The coordinates
     */
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     *
     * @return
     * The place
     */
    public Object getPlace() {
        return place;
    }

    /**
     *
     * @param place
     * The place
     */
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     *
     * @return
     * The contributors
     */
    public Object getContributors() {
        return contributors;
    }

    /**
     *
     * @param contributors
     * The contributors
     */
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     *
     * @return
     * The isQuoteStatus
     */
    public boolean isIsQuoteStatus() {
        return isQuoteStatus;
    }

    /**
     *
     * @param isQuoteStatus
     * The is_quote_status
     */
    public void setIsQuoteStatus(boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    /**
     *
     * @return
     * The retweetCount
     */
    public int getRetweetCount() {
        return retweetCount;
    }

    /**
     *
     * @param retweetCount
     * The retweet_count
     */
    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     *
     * @return
     * The favoriteCount
     */
    public int getFavoriteCount() {
        return favoriteCount;
    }

    /**
     *
     * @param favoriteCount
     * The favorite_count
     */
    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    /**
     *
     * @return
     * The favorited
     */
    public boolean isFavorited() {
        return favorited;
    }

    /**
     *
     * @param favorited
     * The favorited
     */
    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    /**
     *
     * @return
     * The retweeted
     */
    public boolean isRetweeted() {
        return retweeted;
    }

    /**
     *
     * @param retweeted
     * The retweeted
     */
    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     *
     * @return
     * The possiblySensitive
     */
    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    /**
     *
     * @param possiblySensitive
     * The possibly_sensitive
     */
    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    /**
     *
     * @return
     * The lang
     */
    public String getLang() {
        return lang;
    }

    /**
     *
     * @param lang
     * The lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

}