package com.cos.instagramui;

public class Post {
    private String id;
    private String postId;
    private int imageResource;
    private int imageProfile;
    private String content;
    private String tagContent;


    public Post(String id, String postId, int imageResource, int imageProfile, String content) {
        this.id = id;
        this.postId = postId;
        this.imageResource = imageResource;
        this.imageProfile = imageProfile;
        this.content = content;
    }

    public Post(String id, String postId, int imageResource, int imageProfile, String content, String tagContent) {
        this.id = id;
        this.postId = postId;
        this.imageResource = imageResource;
        this.imageProfile = imageProfile;
        this.content = content;
        this.tagContent = tagContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent;
    }
}
