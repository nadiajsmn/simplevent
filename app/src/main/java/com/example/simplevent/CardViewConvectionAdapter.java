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

public class CardViewConvectionAdapter extends RecyclerView.Adapter<CardViewConvectionAdapter.CardViewViewHolder>{
    private ArrayList<Convection> listConvection;

    public CardViewConvectionAdapter(ArrayList<Convection> list) {
        this.listConvection = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_cardview_convection, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        Convection convection = listConvection.get(position);

        Glide.with(holder.itemView.getContext())
                .load(convection.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(convection.getName());
        holder.tvDetail.setText(convection.getDetail());

        holder.btnProfile.setOnClickListener(v -> Toast.makeText(holder.itemView.getContext(), " Profile" +
                listConvection.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show());

        holder.btnFavorite.setOnClickListener(v -> Toast.makeText(holder.itemView.getContext(), "Favorite" +
                 listConvection.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show());
    }
    @Override
    public int getItemCount() {
        return listConvection.size();
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
