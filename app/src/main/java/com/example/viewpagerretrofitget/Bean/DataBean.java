package com.example.viewpagerretrofitget.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataBean {


    @SerializedName("imageDescription")
    @Expose
    private String imageDescription;
    @SerializedName("imageURL")
    @Expose
    private String imageURL;
    @SerializedName("imageStatus")
    @Expose
    private String imageStatus;
    @SerializedName("imageId")
    @Expose
    private Integer imageId;

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}

