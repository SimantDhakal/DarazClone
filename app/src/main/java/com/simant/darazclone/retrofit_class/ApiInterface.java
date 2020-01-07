package com.simant.darazclone.retrofit_class;

import com.simant.darazclone.modal.CollectionModal;
import com.simant.darazclone.modal.ProductModal;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    // Node API for products
    @GET("daraz_products")
    Call<List<ProductModal>> getProduct();

    // Node API for collections
    @GET("daraz_collections")
    Call<List<CollectionModal>> getCollection();

}