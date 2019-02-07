package com.pursuit.zodiacapp.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.pursuit.zodiacapp.R;
import com.pursuit.zodiacapp.model.Zodiac;
import com.pursuit.zodiacapp.model.ZodiacModel;

public class MyZodiacViewHolder extends RecyclerView.ViewHolder{
    private final String TAG = "ZodiacViewHolder";
    private TextView nameTextView;
    private TextView dateTextView;

    public MyZodiacViewHolder(@NonNull View itemView){
        super(itemView);
        nameTextView = itemView.findViewById(R.id.zodiac_name_text_view);
        dateTextView = itemView.findViewById(R.id.zodiac_date_text_view);
    }
    public void onBind(final ZodiacModel zodiacModel){
        nameTextView.setText(zodiacModel.getName());
        dateTextView.setText(zodiacModel.getNumber());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
