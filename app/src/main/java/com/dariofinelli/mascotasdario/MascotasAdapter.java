package com.dariofinelli.mascotasdario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MascotasAdapter extends RecyclerView.Adapter<com.dariofinelli.mascotasdario.MascotasAdapter.ViewHolder> {
    private final List<Mascota> mascotas;

    public MascotasAdapter(List<Mascota> mascotas){
        this.mascotas=mascotas;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mascota mascota = mascotas.get(position);
        holder.tvNombre.setText(mascota.getNombre());
        holder.tvLikes.setText(String.valueOf(mascota.getNumlikes()));
        holder.imgFoto.setImageResource(mascota.getFoto());

    }

    @Override
    public int getItemCount() {
        return this.mascotas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvNombre;
        private final ImageView imgFoto;
        private final TextView tvLikes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto=(ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre=(TextView) itemView.findViewById(R.id.tvNombre);
            tvLikes=(TextView) itemView.findViewById(R.id.tvLikes);
        }
    }
}
