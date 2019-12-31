package com.simant.darazclone.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TableCollectionModel {
    @SerializedName("tbl_collection")
    @Expose
    List<CollectionModal> collectionModalList;

    public List<CollectionModal> getCollectionModalList() {
        return collectionModalList;
    }

    public void setCollectionModalList(List<CollectionModal> collectionModalList) {
        this.collectionModalList = collectionModalList;
    }

    @Override
    public String toString() {
        return "TableCollectionModel{" +
                "collectionModalList=" + collectionModalList +
                '}';
    }

}