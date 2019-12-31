package com.simant.darazclone.modal;

public class CollectionModal {

    private String collection_id;
    private String c_title;
    private String c_intro;
    private String image;
    private String background;

    public String getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(String collection_id) {
        this.collection_id = collection_id;
    }

    public String getC_title() {
        return c_title;
    }

    public void setC_title(String c_title) {
        this.c_title = c_title;
    }

    public String getC_intro() {
        return c_intro;
    }

    public void setC_intro(String c_intro) {
        this.c_intro = c_intro;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public String toString()
    {
        return "tbl_collection [collection_id = "+collection_id+", c_title = "+c_title+"," +
                " c_intro = "+c_intro+", image = "+image+", background = "+background+"]";
    }

}