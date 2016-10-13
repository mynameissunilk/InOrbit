package app.inorbit.Models.Twitter;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User_ {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private String url;
//    @SerializedName("entities")
//    @Expose
//    private Entities___ entities;
    @SerializedName("protected")
    @Expose
    private boolean _protected;
    @SerializedName("followers_count")
    @Expose
    private int followersCount;
    @SerializedName("friends_count")
    @Expose
    private int friendsCount;
    @SerializedName("listed_count")
    @Expose
    private int listedCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("favourites_count")
    @Expose
    private int favouritesCount;
    @SerializedName("utc_offset")
    @Expose
    private int utcOffset;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("geo_enabled")
    @Expose
    private boolean geoEnabled;
    @SerializedName("verified")
    @Expose
    private boolean verified;
    @SerializedName("statuses_count")
    @Expose
    private int statusesCount;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("contributors_enabled")
    @Expose
    private boolean contributorsEnabled;
    @SerializedName("is_translator")
    @Expose
    private boolean isTranslator;
    @SerializedName("is_translation_enabled")
    @Expose
    private boolean isTranslationEnabled;
    @SerializedName("profile_background_color")
    @Expose
    private String profileBackgroundColor;
    @SerializedName("profile_background_image_url")
    @Expose
    private String profileBackgroundImageUrl;
    @SerializedName("profile_background_image_url_https")
    @Expose
    private String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_tile")
    @Expose
    private boolean profileBackgroundTile;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("profile_banner_url")
    @Expose
    private String profileBannerUrl;
    @SerializedName("profile_link_color")
    @Expose
    private String profileLinkColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    private String profileSidebarBorderColor;
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    private String profileSidebarFillColor;
    @SerializedName("profile_text_color")
    @Expose
    private String profileTextColor;
    @SerializedName("profile_use_background_image")
    @Expose
    private boolean profileUseBackgroundImage;
    @SerializedName("has_extended_profile")
    @Expose
    private boolean hasExtendedProfile;
    @SerializedName("default_profile")
    @Expose
    private boolean defaultProfile;
    @SerializedName("default_profile_image")
    @Expose
    private boolean defaultProfileImage;
    @SerializedName("following")
    @Expose
    private Object following;
    @SerializedName("follow_request_sent")
    @Expose
    private Object followRequestSent;
    @SerializedName("notifications")
    @Expose
    private Object notifications;

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
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     *
     * @param screenName
     * The screen_name
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The entities
     */
//    public Entities___ getEntities() {
//        return entities;
//    }

    /**
     *
     * @param entities
     * The entities
     */
//    public void setEntities(Entities___ entities) {
//        this.entities = entities;
//    }

    /**
     *
     * @return
     * The _protected
     */
    public boolean isProtected() {
        return _protected;
    }

    /**
     *
     * @param _protected
     * The protected
     */
    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    /**
     *
     * @return
     * The followersCount
     */
    public int getFollowersCount() {
        return followersCount;
    }

    /**
     *
     * @param followersCount
     * The followers_count
     */
    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    /**
     *
     * @return
     * The friendsCount
     */
    public int getFriendsCount() {
        return friendsCount;
    }

    /**
     *
     * @param friendsCount
     * The friends_count
     */
    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    /**
     *
     * @return
     * The listedCount
     */
    public int getListedCount() {
        return listedCount;
    }

    /**
     *
     * @param listedCount
     * The listed_count
     */
    public void setListedCount(int listedCount) {
        this.listedCount = listedCount;
    }

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
     * The favouritesCount
     */
    public int getFavouritesCount() {
        return favouritesCount;
    }

    /**
     *
     * @param favouritesCount
     * The favourites_count
     */
    public void setFavouritesCount(int favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     *
     * @return
     * The utcOffset
     */
    public int getUtcOffset() {
        return utcOffset;
    }

    /**
     *
     * @param utcOffset
     * The utc_offset
     */
    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     *
     * @return
     * The timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     *
     * @param timeZone
     * The time_zone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     *
     * @return
     * The geoEnabled
     */
    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    /**
     *
     * @param geoEnabled
     * The geo_enabled
     */
    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    /**
     *
     * @return
     * The verified
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     *
     * @param verified
     * The verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     *
     * @return
     * The statusesCount
     */
    public int getStatusesCount() {
        return statusesCount;
    }

    /**
     *
     * @param statusesCount
     * The statuses_count
     */
    public void setStatusesCount(int statusesCount) {
        this.statusesCount = statusesCount;
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

    /**
     *
     * @return
     * The contributorsEnabled
     */
    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    /**
     *
     * @param contributorsEnabled
     * The contributors_enabled
     */
    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    /**
     *
     * @return
     * The isTranslator
     */
    public boolean isIsTranslator() {
        return isTranslator;
    }

    /**
     *
     * @param isTranslator
     * The is_translator
     */
    public void setIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    /**
     *
     * @return
     * The isTranslationEnabled
     */
    public boolean isIsTranslationEnabled() {
        return isTranslationEnabled;
    }

    /**
     *
     * @param isTranslationEnabled
     * The is_translation_enabled
     */
    public void setIsTranslationEnabled(boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
    }

    /**
     *
     * @return
     * The profileBackgroundColor
     */
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    /**
     *
     * @param profileBackgroundColor
     * The profile_background_color
     */
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    /**
     *
     * @return
     * The profileBackgroundImageUrl
     */
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    /**
     *
     * @param profileBackgroundImageUrl
     * The profile_background_image_url
     */
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    /**
     *
     * @return
     * The profileBackgroundImageUrlHttps
     */
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    /**
     *
     * @param profileBackgroundImageUrlHttps
     * The profile_background_image_url_https
     */
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    /**
     *
     * @return
     * The profileBackgroundTile
     */
    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    /**
     *
     * @param profileBackgroundTile
     * The profile_background_tile
     */
    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    /**
     *
     * @return
     * The profileImageUrl
     */
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     *
     * @param profileImageUrl
     * The profile_image_url
     */
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    /**
     *
     * @return
     * The profileImageUrlHttps
     */
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     *
     * @param profileImageUrlHttps
     * The profile_image_url_https
     */
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    /**
     *
     * @return
     * The profileBannerUrl
     */
    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    /**
     *
     * @param profileBannerUrl
     * The profile_banner_url
     */
    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    /**
     *
     * @return
     * The profileLinkColor
     */
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    /**
     *
     * @param profileLinkColor
     * The profile_link_color
     */
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    /**
     *
     * @return
     * The profileSidebarBorderColor
     */
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    /**
     *
     * @param profileSidebarBorderColor
     * The profile_sidebar_border_color
     */
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    /**
     *
     * @return
     * The profileSidebarFillColor
     */
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    /**
     *
     * @param profileSidebarFillColor
     * The profile_sidebar_fill_color
     */
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    /**
     *
     * @return
     * The profileTextColor
     */
    public String getProfileTextColor() {
        return profileTextColor;
    }

    /**
     *
     * @param profileTextColor
     * The profile_text_color
     */
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    /**
     *
     * @return
     * The profileUseBackgroundImage
     */
    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    /**
     *
     * @param profileUseBackgroundImage
     * The profile_use_background_image
     */
    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    /**
     *
     * @return
     * The hasExtendedProfile
     */
    public boolean isHasExtendedProfile() {
        return hasExtendedProfile;
    }

    /**
     *
     * @param hasExtendedProfile
     * The has_extended_profile
     */
    public void setHasExtendedProfile(boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
    }

    /**
     *
     * @return
     * The defaultProfile
     */
    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    /**
     *
     * @param defaultProfile
     * The default_profile
     */
    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    /**
     *
     * @return
     * The defaultProfileImage
     */
    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    /**
     *
     * @param defaultProfileImage
     * The default_profile_image
     */
    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    /**
     *
     * @return
     * The following
     */
    public Object getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     * The following
     */
    public void setFollowing(Object following) {
        this.following = following;
    }

    /**
     *
     * @return
     * The followRequestSent
     */
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    /**
     *
     * @param followRequestSent
     * The follow_request_sent
     */
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    /**
     *
     * @return
     * The notifications
     */
    public Object getNotifications() {
        return notifications;
    }

    /**
     *
     * @param notifications
     * The notifications
     */
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

}