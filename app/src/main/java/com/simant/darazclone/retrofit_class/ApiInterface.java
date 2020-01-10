package com.simant.darazclone.retrofit_class;

import com.simant.darazclone.modal.CollectionModal;
import com.simant.darazclone.modal.ProductModal;
import com.simant.darazclone.modal.UserModal;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    // Node API for products
    @GET("daraz_products")
    Call<List<ProductModal>> getProduct();

    // Node API for collections
    @GET("daraz_collections")
    Call<List<CollectionModal>> getCollection();

    // user api
    @GET("daraz_users/{phoneNo}")
    Call<List<UserModal>> getUser(@Path("phoneNo") String phoneNo);
}