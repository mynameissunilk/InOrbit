package app.inorbit.Models.Twitter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Entities__ {
/*
    @SerializedName("hashtags")
    @Expose
    private List<Hashtag_> hashtags = new ArrayList<Hashtag_>();
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = new ArrayList<Object>();
    @SerializedName("user_mentions")
    @Expose
    private List<UserMention_> userMentions = new ArrayList<UserMention_>();*/
    @SerializedName("urls")
    @Expose
    private List<Url__> urls = new ArrayList<Url__>();
    private List<Media_> media_urls = new ArrayList<>();

    /**
     *
     * @return
     * The hashtags
     */
    /*public List<Hashtag_> getHashtags() {
        return hashtags;
    }

    *//**
     *
     * @param hashtags
     * The hashtags
     *//*
    public void setHashtags(List<Hashtag_> hashtags) {
        this.hashtags = hashtags;
    }

    *//**
     *
     * @return
     * The symbols
     *//*
    public List<Object> getSymbols() {
        return symbols;
    }

    *//**
     *
     * @param symbols
     * The symbols
     *//*
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    *//**
     *
     * @return
     * The userMentions
     *//*
    public List<UserMention_> getUserMentions() {
        return userMentions;
    }

    *//**
     *
     * @param userMentions
     * The user_mentions
     *//*
    public void setUserMentions(List<UserMention_> userMentions) {
        this.userMentions = userMentions;
    }
*/
    /**
     *
     * @return
     * The urls
     */
    public List<Url__> getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     * The urls
     */
    public void setUrls(List<Url__> urls) {
        this.urls = urls;
    }
    /**
     *
     * @return
     * The media_urls
     */
    public List<Media_> getMedia() {
        return media_urls;
    }

    /**
     *
     * @param urls
     * The media_urls
     */
    public void setMedia(List<Media_> urls) {
        this.media_urls = urls;
    }

}