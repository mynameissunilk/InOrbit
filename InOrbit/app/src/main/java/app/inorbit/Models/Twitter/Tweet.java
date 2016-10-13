package app.inorbit.Models.Twitter;

/**
 * Created by owlslubic on 10/13/16.
 */

public class Tweet {//extends MasterObject or however we wanna do that
    String id;
    String text;
    String created_at;
    String statusUrl;
    String mediaUrl;
    User user;
    User_ user_;
    //user object, or should i just get all the necessary attributes and put them here


    public Tweet(String id, String text, String created_at, String statusUrl, String mediaUrl, User user,User_ user_) {
        this.id = id;
        this.text = text;
        this.created_at = created_at;
        this.statusUrl = statusUrl;
        this.mediaUrl = mediaUrl;
        this.user = user;
        this.user_ = user_;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getStatusUrl() {
        return statusUrl;
    }

    public void getStatusUrl(String url) {
        this.statusUrl = url;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User_ getUser_() {
        return user_;
    }

    public void setUser_(User_ user_) {
        this.user_ = user_;
    }
}
