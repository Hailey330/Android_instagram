package com.cos.instagramui;

public class Story {
    private String id;
    private int imageResource;

    public Story(String id, int imageResource) {
        this.id = id;
        this.imageResource = imageResource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
