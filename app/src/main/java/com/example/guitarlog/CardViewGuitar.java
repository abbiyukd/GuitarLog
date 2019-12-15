package com.example.guitarlog;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static com.example.guitarlog.Spesifikasi.EXTRA_FINISH;
import static com.example.guitarlog.Spesifikasi.EXTRA_MATERIAL;
import static com.example.guitarlog.Spesifikasi.EXTRA_DETAIL;
import static com.example.guitarlog.Spesifikasi.EXTRA_TYPE;
import static com.example.guitarlog.Spesifikasi.EXTRA_SCALE;
import static com.example.guitarlog.Spesifikasi.EXTRA_IMAGES;
import static com.example.guitarlog.Spesifikasi.EXTRA_NAME;
import static com.example.guitarlog.Spesifikasi.EXTRA_PICKUP;
import static com.example.guitarlog.Spesifikasi.EXTRA_SHAPE;

public class CardViewGuitar extends RecyclerView.Adapter<CardViewGuitar.CardViewViewHolder> {
    private ArrayList<Guitar> listGuitar;
    private Context mContext;

    CardViewGuitar(Context context, ArrayList<Guitar> list) {
        this.mContext = context;
        this.listGuitar = list;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_guitar, viewGroup, false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        Guitar guitar = listGuitar.get(position);

        Glide.with(mContext)
                .load(guitar.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(guitar.getName());
        holder.tvDetail.setText(guitar.getDetail());
        holder.tvType.setText(guitar.getType());
        holder.tvShape.setText(guitar.getShape());
        holder.tvMaterial.setText(guitar.getMaterial());
        holder.tvScale.setText(guitar.getScale());
        holder.tvPickup.setText(guitar.getPickup());
        holder.tvFinish.setText(guitar.getFinish());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Guitar clickedDataItem = listGuitar.get(holder.getAdapterPosition());
                Toast.makeText(mContext, clickedDataItem.getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, Spesifikasi.class);
                intent.putExtra(EXTRA_NAME, clickedDataItem.getName());
                intent.putExtra(EXTRA_DETAIL, clickedDataItem.getDetail());
                intent.putExtra(EXTRA_TYPE, clickedDataItem.getType());
                intent.putExtra(EXTRA_SHAPE, clickedDataItem.getShape());
                intent.putExtra(EXTRA_MATERIAL, clickedDataItem.getMaterial());
                intent.putExtra(EXTRA_SCALE, clickedDataItem.getScale());
                intent.putExtra(EXTRA_PICKUP, clickedDataItem.getPickup());
                intent.putExtra(EXTRA_FINISH, clickedDataItem.getFinish());
                intent.putExtra(EXTRA_IMAGES, clickedDataItem.getPhoto());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGuitar.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvType, tvShape, tvMaterial, tvScale, tvPickup, tvFinish;
        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvType = itemView.findViewById(R.id.tv_item_type);
            tvShape = itemView.findViewById(R.id.tv_item_shape);
            tvMaterial = itemView.findViewById(R.id.tv_item_material);
            tvScale = itemView.findViewById(R.id.tv_item_scale);
            tvPickup = itemView.findViewById(R.id.tv_item_pickup);
            tvFinish = itemView.findViewById(R.id.tv_item_finish);
        }
    }
}
