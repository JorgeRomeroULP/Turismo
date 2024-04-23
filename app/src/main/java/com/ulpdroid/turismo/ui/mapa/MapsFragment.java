package com.ulpdroid.turismo.ui.mapa;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ulpdroid.turismo.R;

public class MapsFragment extends Fragment {

    private MapsViewModel mvm;

    private final OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(@NonNull GoogleMap googleMap) {
            mvm.getMyLocation().observe(getViewLifecycleOwner(), new Observer<Location>() {
                @Override
                public void onChanged(Location location) {
                    LatLng myLocation = new LatLng(location.getLatitude(), location.getLongitude());
                    LatLng quijadas = new LatLng(-32.54151329428837, -67.02155882785965);
                    LatLng saltomoneda = new LatLng(-33.20050552037033, -66.23011241884244);
                    LatLng museo = new LatLng(-33.29792681044269, -66.3387526955022);
                    LatLng minacondores = new LatLng(-32.55572551486014, -65.23887491952355);

                    googleMap.addMarker(new MarkerOptions().position(myLocation).title("Estoy aqui"));
                    googleMap.addMarker(new MarkerOptions().position(quijadas).title("Sierra de las Quijadas"));
                    googleMap.addMarker(new MarkerOptions().position(saltomoneda).title("Salto de la Moneda"));
                    googleMap.addMarker(new MarkerOptions().position(museo).title("Museo San Luis"));
                    googleMap.addMarker(new MarkerOptions().position(minacondores).title("Mina de los Condores"));

                    CameraPosition camPos = new CameraPosition.Builder().target(myLocation).zoom(10).bearing(90).tilt(50).build();
                    CameraUpdate camUpdICT = CameraUpdateFactory.newCameraPosition(camPos);
                    googleMap.animateCamera(camUpdICT);
                }
            });
            mvm.obtenerUbicacion();
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mvm = new ViewModelProvider(this).get(MapsViewModel.class);
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}