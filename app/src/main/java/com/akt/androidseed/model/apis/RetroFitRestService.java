package com.akt.androidseed.model.apis;


import com.akt.androidseed.datamodels.StateListResponse;
import com.akt.androidseed.utils.CommonUtils;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface RetroFitRestService {
    //api for fetchng states based on passd "text"
    @GET(CommonUtils.URL_STATELIST)
    Observable<StateListResponse> getStateList(@Query("text") String searchText);

    /*//api for fetching location based on passed "ipaddress"
    @GET(CommonUtils.URL_IP_TO_LOCATION)
    Observable<LocationModel> getLocationFromIP(@Path("ipaddress") String ipAddress);*/
}
