package com.ulpdroid.turismo.ui.lugares;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.ulpdroid.turismo.R;
import com.ulpdroid.turismo.modelo.Lugar;

public class LugaresItemFragment extends Fragment {

    private ImageView imageView;
    private TextView textViewNombre;
    private TextView textViewDescripcion;


    public LugaresItemFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lugares_item, container, false);

        imageView = view.findViewById(R.id.ivItemDetalle);
        textViewNombre = view.findViewById(R.id.tvItemDetalle);
        textViewDescripcion = view.findViewById(R.id.etDescripcion);

        Bundle args = getArguments();

        if (args != null) {
            Lugar lugar = (Lugar) args.getSerializable("lugar");

            textViewNombre.setText(lugar.getNombre());
            imageView.setImageResource(lugar.getItemFotoA());
            textViewDescripcion.setText(lugar.getDescripcion());
        }
        return view;
    }
}