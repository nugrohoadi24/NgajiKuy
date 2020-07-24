package com.example.ngajikuy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity{
    public static final String EXTRA_GAMBAR = "gambar";
    public static final String EXTRA_NAMA = "nama";
    public static final String EXTRA_ALAMAT = "alamat";
    public static final String EXTRA_MATERI = "materi";
    public static final String EXTRA_PEMATERI = "pemateri";
    public static final String EXTRA_WAKTU = "waktu";

    private ImageView imgGambar;
    private TextView tvNama, tvAlamat, tvMateri, tvPemateri, tvWaktu;
    private String gambar, nama, alamat, materi, pemateri, waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgGambar = findViewById(R.id.foto_masjid);
        tvNama = findViewById(R.id.tv_nama_masjid);
        tvAlamat = findViewById(R.id.tv_alamat_masjid);
        tvMateri = findViewById(R.id.tv_materi);
        tvPemateri = findViewById(R.id.tv_pemateri);
        tvWaktu = findViewById(R.id.tv_waktu);

        if (getIntent().getExtras() != null){
            gambar = getIntent().getStringExtra(EXTRA_GAMBAR);
            nama = getIntent().getStringExtra(EXTRA_NAMA);
            alamat = getIntent().getStringExtra(EXTRA_ALAMAT);
            materi = getIntent().getStringExtra(EXTRA_MATERI);
            pemateri = getIntent().getStringExtra(EXTRA_PEMATERI);
            waktu = getIntent().getStringExtra(EXTRA_WAKTU);

            Glide.with(this)
                    .load(gambar)
                    .into(imgGambar);

            tvNama.setText(nama);
            tvAlamat.setText(alamat);
            tvMateri.setText(materi);
            tvPemateri.setText(pemateri);
            tvWaktu.setText(waktu);
        }

    }
}
