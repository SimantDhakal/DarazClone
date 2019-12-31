package com.simant.darazclone.modal;

public class ProductModal {

    private String product_id;
    private String product_name;
    private String product_price;
    private String product_image;

    public String getProduct_id() {
        return product_id;
    }
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getProduct_price() {
        return product_price;
    }
    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }
    public String getProduct_image() {
        return product_image;
    }
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    @Override
    public String toString() {
        return "tbl_product [product_id = "+product_id+", product_name = "+product_name+"," +
                " product_price = "+product_price+",  product_image = "+product_image+"]";
    }
}