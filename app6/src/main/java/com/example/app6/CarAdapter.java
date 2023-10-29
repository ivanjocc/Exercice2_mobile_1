package com.example.app6;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {
    private ArrayList<CarItem> carItems;

    public static class CarViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public EditText itemPrice;
        public EditText itemBrand;
        public EditText itemYear;

        public CarViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemBrand = itemView.findViewById(R.id.itemBrand);
            itemYear = itemView.findViewById(R.id.itemYear);
        }
    }

    public CarAdapter(ArrayList<CarItem> items) {
        carItems = items;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        CarItem currentItem = carItems.get(position);

        holder.itemImage.setImageResource(currentItem.getImageResource());
        holder.itemPrice.setText(currentItem.getPrice());
        holder.itemBrand.setText(currentItem.getBrand());
        holder.itemYear.setText(currentItem.getYear());
    }

    @Override
    public int getItemCount() {
        return carItems.size();
    }
}

