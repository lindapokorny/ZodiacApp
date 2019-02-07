package com.pursuit.zodiacapp.network;

import com.pursuit.zodiacapp.model.Zodiac;
import com.pursuit.zodiacapp.model.ZodiacModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ZodiacService {
    @GET("JDVila/storybook/master/zodiac.json")
    Call<Zodiac>getZodiac();
}
