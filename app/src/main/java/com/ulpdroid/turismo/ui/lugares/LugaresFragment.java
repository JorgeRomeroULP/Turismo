package com.ulpdroid.turismo.ui.lugares;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ulpdroid.turismo.databinding.FragmentLugaresBinding;
import com.ulpdroid.turismo.modelo.Lugar;

import java.util.List;

public class LugaresFragment extends Fragment {
    private FragmentLugaresBinding binding;
    private LugaresViewModel lugaresViewModel;
    private Context context;
    private final int spanCount = 1;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLugaresBinding.inflate(inflater, container, false);
        lugaresViewModel = new ViewModelProvider(this).get(LugaresViewModel.class);
        context = getContext();

        lugaresViewModel.getListaLugaresMutable().observe(getViewLifecycleOwner(), new Observer<List<Lugar>>() {
            @Override
            public void onChanged(List<Lugar> lugares) {
                LugaresAdapter lugaresAdapter = new LugaresAdapter(lugares, context, inflater);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, spanCount);
                RecyclerView reciclerView = binding.reciclerView;
                reciclerView.setLayoutManager(gridLayoutManager);
                reciclerView.setAdapter(lugaresAdapter);
            }
        });

        lugaresViewModel.crearLista();

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}