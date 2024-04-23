package com.ulpdroid.turismo.ui.lugares;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.ulpdroid.turismo.R;
import com.ulpdroid.turismo.modelo.Lugar;

import java.util.ArrayList;
import java.util.List;

public class LugaresViewModel extends AndroidViewModel {

    private MutableLiveData<List<Lugar>> listaLugaresMutable;

    public LugaresViewModel(@NonNull Application application) {
        super(application);
    }
    // TODO: Implement the ViewModel
    public MutableLiveData<List<Lugar>> getListaLugaresMutable() {
        if (listaLugaresMutable == null) {
            listaLugaresMutable = new MutableLiveData<>();
        }
        return listaLugaresMutable;
    }

    public void crearLista() {
        ArrayList<Lugar> lista = new ArrayList<>();
        lista.add(new Lugar("Sierra de las Quijadas",
                R.string.horario01,
                R.string.des_quijadas,
                R.drawable.foto_quijadas_rvfoto,
                R.drawable.foto_quijadas_itemfoto001,
                R.drawable.foto_quijadas_itemfoto002,
                R.drawable.foto_quijadas_itemfoto003));
        lista.add(new Lugar("Salto de la Moneda",
                R.string.horario01,
                R.string.des_saltomoneda,
                R.drawable.foto_saltomoneda_rvfoto,
                R.drawable.foto_saltomoneda_itemfoto001,
                R.drawable.foto_saltomoneda_itemfoto002,
                R.drawable.foto_saltomoneda_itemfoto003));
        lista.add(new Lugar("Museo Historico de San Luis",
                R.string.horario01,
                R.string.des_museosanluis,
                R.drawable.foto_museosanluis_rvfoto,
                R.drawable.foto_museosanluis_itemfoto001,
                R.drawable.foto_museosanluis_itemfoto002,
                R.drawable.foto_minacondores_itemfoto003));
        lista.add(new Lugar("Minas los Condores",
                R.string.horario01,
                R.string.des_minacondores,
                R.drawable.foto_minacondores_rvfoto,
                R.drawable.foto_minacondores_itemfoto001,
                R.drawable.foto_minacondores_itemfoto002,
                R.drawable.foto_minacondores_itemfoto003));
        lista.add(new Lugar("Chorro de San Ignacio",
                R.string.horario01,
                R.string.des_sanignacio,
                R.drawable.foto_sanignacio_rvfoto,
                R.drawable.foto_sanignacio_itemfoto001,
                R.drawable.foto_sanignacio_itemfoto002,
                R.drawable.foto_sanignacio_itemfoto003));
        lista.add(new Lugar("Ruta del Macizo Central",
                R.string.horario01,
                R.string.des_rutamacizo,
                R.drawable.foto_rutamacizo_rvfoto,
                R.drawable.foto_rutamacizo_itemfoto001,
                R.drawable.foto_rutamacizo_itemfoto002,
                R.drawable.foto_rutamacizo_itemfoto003));
        lista.add(new Lugar("Monumento al Pueblo Puntano",
                R.string.horario01,
                R.string.des_pueblopuntano,
                R.drawable.foto_pueblopuntano_rvfoto,
                R.drawable.foto_pueblopuntano_itemfoto001,
                R.drawable.foto_pueblopuntano_itemfoto002,
                R.drawable.foto_pueblopuntano_itemfoto003));
        lista.add(new Lugar("Terrazas del Portezuelo",
                R.string.horario01,
                R.string.des_terrazas,
                R.drawable.foto_terrazas_rvfoto,
                R.drawable.foto_terrazas_itemfoto001,
                R.drawable.foto_terrazas_itemfoto002,
                R.drawable.foto_terrazas_itemfoto003));
        lista.add(new Lugar("Monasterio Monjas Benedictinas",
                R.string.horario01,
                R.string.des_monasterio,
                R.drawable.foto_monasterio_rvfoto,
                R.drawable.foto_monasterio_itemfoto001,
                R.drawable.foto_monasterio_itemfoto002,
                R.drawable.foto_monasterio_itemfoto003));
        lista.add(new Lugar("Iglesia Catedral",
                R.string.horario01,
                R.string.des_catedral,
                R.drawable.foto_catedral_rvfoto,
                R.drawable.foto_catedral_itemfoto001,
                R.drawable.foto_catedral_itemfoto002,
                R.drawable.foto_catedral_itemfoto003));
        lista.add(new Lugar("Balneario la Hoya",
                R.string.horario01,
                R.string.des_lahoya,
                R.drawable.foto_lahoya_rvfoto,
                R.drawable.foto_lahoya_itemfoto001,
                R.drawable.foto_lahoya_itemfoto002,
                R.drawable.foto_lahoya_itemfoto003));
        lista.add(new Lugar("Dique Embalse Nogoli",
                R.string.horario01,
                R.string.des_nogoli,
                R.drawable.foto_nogoli_rvfoto,
                R.drawable.foto_nogoli_itemfoto001,
                R.drawable.foto_nogoli_itemfoto002,
                R.drawable.foto_nogoli_itemfoto003));
        lista.add(new Lugar("Salinas del Bebedero",
                R.string.horario01,
                R.string.des_salinas,
                R.drawable.foto_salinas_rvfoto,
                R.drawable.foto_salinas_itemfoto001,
                R.drawable.foto_salinas_itemfoto002,
                R.drawable.foto_salinas_itemfoto003));
        lista.add(new Lugar("Hito del Bicentenario",
                R.string.horario01,
                R.string.des_hito,
                R.drawable.foto_hito_rvfoto,
                R.drawable.foto_hito_itemfoto001,
                R.drawable.foto_hito_itemfoto002,
                R.drawable.foto_hito_itemfoto003));
        lista.add(new Lugar("Embalse la Florida",
                R.string.horario01,
                R.string.des_laflorida,
                R.drawable.foto_laflorida_rvfoto,
                R.drawable.foto_laflorida_itemfoto001,
                R.drawable.foto_laflorida_itemfoto002,
                R.drawable.foto_laflorida_itemfoto003));
        lista.add(new Lugar("Bajo de Veliz",
                R.string.horario01,
                R.string.des_bajoveliz,
                R.drawable.foto_bajoveliz_rvfoto,
                R.drawable.foto_bajoveliz_itemfoto001,
                R.drawable.foto_bajoveliz_itemfoto002,
                R.drawable.foto_bajoveliz_itemfoto003));
        lista.add(new Lugar("Dique las Huertitas",
                R.string.horario01,
                R.string.des_lashuertitas,
                R.drawable.foto_lashuertitas_rvfoto,
                R.drawable.foto_lashuertitas_itemfoto001,
                R.drawable.foto_lashuertitas_itemfoto002,
                R.drawable.foto_lashuertitas_itemfoto003));
        listaLugaresMutable.setValue(lista);
    }
}