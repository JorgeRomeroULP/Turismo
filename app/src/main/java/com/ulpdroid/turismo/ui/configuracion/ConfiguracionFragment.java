package com.ulpdroid.turismo.ui.configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ulpdroid.turismo.R;
import com.ulpdroid.turismo.ui.mapa.MapsViewModel;

public class ConfiguracionFragment extends Fragment {

    private MapsViewModel mvf;
    private Switch sw;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_configuracion, container, false);
        mvf = new ViewModelProvider(this).get(MapsViewModel.class);
        sw = view.findViewById(R.id.swTipoDeMapa);
        sw.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        }));

        return view;
    }


}