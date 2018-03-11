package com.insta2apps.ibrahim.mfoodmenuapplication.data.source.network;

import com.insta2apps.ibrahim.mfoodmenuapplication.data.source.BaseModel;
import com.insta2apps.ibrahim.mfoodmenuapplication.data.source.Item;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface API {
    @GET("bins/kvdzh")
    Observable<List<Item>> getFoodMenuList();
}
