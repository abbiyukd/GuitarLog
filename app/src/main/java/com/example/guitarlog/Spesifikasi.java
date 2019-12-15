package com.example.guitarlog;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Spesifikasi extends AppCompatActivity {

    public static final String EXTRA_NAME = "Name";
    public static final String EXTRA_DETAIL = "Detail";
    public static final String EXTRA_TYPE = "Type";
    public static final String EXTRA_SHAPE = "Shape";
    public static final String EXTRA_MATERIAL = "Materia;";
    public static final String EXTRA_SCALE = "Scale";
    public static final String EXTRA_PICKUP = "Pickup";
    public static final String EXTRA_FINISH = "Finish";
    public static final String EXTRA_IMAGES = "Images";

    ImageView imgPhoto;
    TextView name, detail, type, shape, material, scale, pickup, finish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi);

        imgPhoto = findViewById(R.id.img_photo);
        name = findViewById(R.id.tv_item_name);
        detail = findViewById(R.id.tv_item_detail);
        type = findViewById(R.id.tv_item_type);
        shape = findViewById(R.id.tv_item_shape);
        material = findViewById(R.id.tv_item_material);
        scale = findViewById(R.id.tv_item_scale);
        pickup = findViewById(R.id.tv_item_pickup);
        finish = findViewById(R.id.tv_item_finish);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra(EXTRA_NAME)) {

            String extName = getIntent().getStringExtra(EXTRA_NAME);
            String extDetail = getIntent().getStringExtra(EXTRA_DETAIL);
            String extType = getIntent().getStringExtra(EXTRA_TYPE);
            String extShape = getIntent().getStringExtra(EXTRA_SHAPE);
            String extMaterial = getIntent().getStringExtra(EXTRA_MATERIAL);
            String extScale = getIntent().getStringExtra(EXTRA_SCALE);
            String extPickup = getIntent().getStringExtra(EXTRA_PICKUP);
            String extFinish = getIntent().getStringExtra(EXTRA_FINISH);
            String extImage = getIntent().getStringExtra(EXTRA_IMAGES);

            name.setText(extName);
            detail.setText(extDetail);
            type.setText(extType);
            shape.setText(extShape);
            material.setText(extMaterial);
            scale.setText(extScale);
            pickup.setText(extPickup);
            finish.setText(extFinish);

            Glide.with(this)
                    .load(extImage)
                    .apply(new RequestOptions())
                    .into(imgPhoto);

            Spesifikasi.this.setTitle(extName);
        } else {
            Toast.makeText(this, "No API Data", Toast.LENGTH_SHORT).show();
        }
    }
}
