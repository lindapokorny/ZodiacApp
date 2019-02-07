package com.pursuit.zodiacapp.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pursuit.zodiacapp.R;
import com.pursuit.zodiacapp.model.Zodiac;
import com.pursuit.zodiacapp.model.ZodiacModel;

import java.util.List;

public class ZodiacAdapter extends RecyclerView.Adapter<MyZodiacViewHolder> {

    private List<ZodiacModel> zodiac;

    public ZodiacAdapter(List<ZodiacModel> zodiac){
        this.zodiac = zodiac;
    }
    @NonNull
    @Override
    public MyZodiacViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zodiac_item_view, viewGroup, false);
        return new MyZodiacViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyZodiacViewHolder myZodiacViewHolder, int i) {
    myZodiacViewHolder.onBind(zodiac.get(i));

    }

    @Override
    public int getItemCount() {
        return zodiac.size();
    }
}
