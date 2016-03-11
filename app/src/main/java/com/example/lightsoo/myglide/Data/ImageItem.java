package com.example.lightsoo.myglide.Data;

import java.io.Serializable;

public class ImageItem implements Serializable {
    String title;
    String image;

    public ImageItem(){}

    public void setTitle(String title){
        this.title = title;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getTitle(){
        return title;
    }

    public String getImage(){
        return image;
    }
}
