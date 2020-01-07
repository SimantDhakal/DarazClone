package com.simant.darazclone.retrofit_class;

import com.simant.darazclone.modal.CollectionModal;
import com.simant.darazclone.modal.ProductModal;
import com.simant.darazclone.modal.TableCollectionModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    // api from SimantDB to retrieve data from collection table
//    @GET("daraz_collection_api.php")
//    Call<TableCollectionModel> getCollection();

    // api from SimantDB to retrieve data from product table
//    @GET("daraz_product_api.php")
//    Call<List<ProductModal>> getProduct();


    // Node API for products
    @GET("daraz_products")
    Call<List<ProductModal>> getProduct();

    // Node API for collections
    @GET("daraz_collections")
    Call<TableCollectionModel> getCollection();

}