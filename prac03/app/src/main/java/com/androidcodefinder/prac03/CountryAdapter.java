package com.androidcodefinder.prac03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private List<country> countryList;
    private Context context;

    public CountryAdapter(List<country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(itemView);
    }


    public void onBindViewHolder(@NonNull CountryAdapter holder, int position) {

    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        country country = countryList.get(position);
        holder.countryName.setText(country.getCountryName());
        holder.Flag.setImageResource(country.getFlag());

        holder.itemView.setOnClickListener(v -> {

        });
    }

    @NonNull



    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView Flag;
        TextView countryName;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            Flag = itemView.findViewById(R.id.Flag);
            countryName = itemView.findViewById(R.id.txtCountryName);
        }
    }
}
