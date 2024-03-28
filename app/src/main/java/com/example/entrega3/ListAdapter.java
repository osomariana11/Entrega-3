package com.example.entrega3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter <Pagina>{

    private List<Pagina> mList;
    private Context mContext;
    private int resourcesLayout;



    public ListAdapter(@NonNull Context context, int resource, List<Pagina> objects) {
        super(context, resource, objects);
        this.mList = objects;
        this.mContext = context;
        this.resourcesLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;


        if (view == null)
            view = LayoutInflater.from(mContext).inflate(R.layout.item_row, null);


        Pagina pagina = mList.get(position);

        ImageView imagen = view.findViewById(R.id.imageView);
        imagen.setImageResource(pagina.getImage());

        TextView textoNombre = view.findViewById(R.id.txtNombre);
        textoNombre.setText(pagina.getNombre());

        TextView textoMensaje = view.findViewById(R.id.txtMensaje);
        textoMensaje.setText(pagina.getMensaje());

        TextView textoEdad = view.findViewById(R.id.txtViewEdad);
        textoEdad.setText(pagina.getEdad());





        return view;
    }
}
