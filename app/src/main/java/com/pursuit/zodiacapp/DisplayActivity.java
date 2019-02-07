package com.pursuit.zodiacapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {
    private ImageView image;
    private TextView sign;
    private TextView dateRange;
    private Button button;
    private static final String ADDRESS = "https://www.astrology.com/horoscope/daily/aries.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        final Intent intent = getIntent();

        image = findViewById(R.id.zodiac_image_view);
        sign = findViewById(R.id.zodiac_name_text_view);
        dateRange = findViewById(R.id.zodiac_date_text_view);
        button = findViewById(R.id.zodiac_button);

        String imageURl= intent.getStringExtra("image");
        final String zodiacName = intent.getStringExtra("name");
        String dates = intent.getStringExtra("date");

        sign.setText(zodiacName);
        dateRange.setText(dates);
        Picasso.get()
                .load(imageURl)
                .into(image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(ADDRESS + zodiacName + ".html");
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent1);
            }
        });
    }
}
