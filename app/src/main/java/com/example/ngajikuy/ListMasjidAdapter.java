package com.example.ngajikuy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMasjidAdapter extends RecyclerView.Adapter<ListMasjidAdapter.ListViewHolder> {
    private ArrayList<Masjid> listMasjid;
    private Context context;

    public ListMasjidAdapter(Context context, ArrayList<Masjid> list){
        this.listMasjid = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.daftar_masjid, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int posisi) {
        Masjid masjid = listMasjid.get(posisi);

        Glide.with(context)
                .load(masjid.getGambar())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.imgGambar);

        holder.tvNama.setText(masjid.getMasjid());
        holder.tvAlamat.setText(masjid.getAlamat());
    }

    @Override
    public int getItemCount() {
        return listMasjid.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvNama, tvAlamat;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.foto_masjid);
            tvNama = itemView.findViewById(R.id.tv_nama_masjid);
            tvAlamat = itemView.findViewById(R.id.tv_alamat_masjid);

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent activityDetail = new Intent(context, DetailActivity.class);

                    activityDetail.putExtra(DetailActivity.EXTRA_GAMBAR, listMasjid.get(getAdapterPosition()).getGambar());
                    activityDetail.putExtra(DetailActivity.EXTRA_NAMA, listMasjid.get(getAdapterPosition()).getMasjid());
                    activityDetail.putExtra(DetailActivity.EXTRA_ALAMAT, listMasjid.get(getAdapterPosition()).getAlamat());
                    activityDetail.putExtra(DetailActivity.EXTRA_MATERI, listMasjid.get(getAdapterPosition()).getMateri());
                    activityDetail.putExtra(DetailActivity.EXTRA_PEMATERI, listMasjid.get(getAdapterPosition()).getPemateri());
                    activityDetail.putExtra(DetailActivity.EXTRA_WAKTU, listMasjid.get(getAdapterPosition()).getWaktu());
                    context.startActivity(activityDetail);
                }
            });
        }
    }
}
