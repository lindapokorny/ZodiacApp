package com.pursuit.zodiacapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.pursuit.zodiacapp.controller.ZodiacAdapter;
import com.pursuit.zodiacapp.model.Zodiac;
import com.pursuit.zodiacapp.network.RetrofitSingleton;
import com.pursuit.zodiacapp.network.ZodiacService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = findViewById(R.id.recycler_view);

        Retrofit retrofit = RetrofitSingleton.getInstance();
        Call<Zodiac> call = retrofit.create(ZodiacService.class).getZodiac();
        call.enqueue(new Callback<Zodiac>() {
            @Override
            public void onResponse(Call<Zodiac> call, Response<Zodiac> response) {
                Log.d(TAG, "THIS RETROFIT CALL WAORKS");
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.setAdapter(new ZodiacAdapter(response.body().getZodiac()));
            }

            @Override
            public void onFailure(Call<Zodiac> call, Throwable t) {

            }
        });
    }
}
