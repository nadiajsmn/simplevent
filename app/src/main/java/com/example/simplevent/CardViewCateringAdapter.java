package com.example.simplevent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewCateringAdapter extends RecyclerView.Adapter<CardViewCateringAdapter.CardViewViewHolder>{
    private ArrayList<Catering> listCatering;

    public CardViewCateringAdapter(ArrayList<Catering> list) {
        this.listCatering = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_cardview_catering, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        Catering catering = listCatering.get(position);

        Glide.with(holder.itemView.getContext())
                .load(catering.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(catering.getName());
        holder.tvDetail.setText(catering.getDetail());

        holder.btnProfile.setOnClickListener(v -> Toast.makeText(holder.itemView.getContext(), " Profile" +
                listCatering.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show());

        holder.btnFavorite.setOnClickListener(v -> Toast.makeText(holder.itemView.getContext(), "Favorite" +
                 listCatering.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show());
    }
    @Override
    public int getItemCount() {
        return listCatering.size();
    }
    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnProfile, btnFavorite;

        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnProfile = itemView.findViewById(R.id.btn_profile);
            btnFavorite = itemView.findViewById(R.id.btn_favorite);
        }
    }
}
