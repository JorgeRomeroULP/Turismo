package com.ulpdroid.turismo.ui.lugares;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.ulpdroid.turismo.R;
import com.ulpdroid.turismo.databinding.ActivityMainBinding;
import com.ulpdroid.turismo.databinding.FragmentLugaresBinding;
import com.ulpdroid.turismo.modelo.Lugar;

import java.util.List;

public class LugaresAdapter extends RecyclerView.Adapter<LugaresAdapter.LugaresViewHolder> {

    private List<Lugar> listaLugares;
    private Context context;
    private LayoutInflater layoutInflater;


    public LugaresAdapter(List<Lugar> listaLugares, Context context, LayoutInflater layoutInflater) {
        this.listaLugares = listaLugares;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public LugaresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new LugaresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LugaresViewHolder holder, int position) {
        Lugar lugar = listaLugares.get(position);
        holder.nombre.setText(lugar.getNombre());
        holder.foto.setImageResource(lugar.getRvFoto());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                args.putSerializable("lugar", lugar);

                Navigation.findNavController((Activity) context, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.nav_lugares_item, args);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaLugares.size();
    }

    public static class LugaresViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView foto;

        public LugaresViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvItemTitulo);
            foto = itemView.findViewById(R.id.ivItemFoto);
        }
    }
}











