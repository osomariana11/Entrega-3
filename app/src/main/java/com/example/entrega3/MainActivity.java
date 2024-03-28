package com.example.entrega3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private List<Pagina> mLista = new ArrayList<>();
    ListAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listView);
        mListView.setOnItemClickListener(this);

        mLista.add(new Pagina("Andres", "10:25 am",
                "Confirmacion cita de odontologia", R.drawable.persona1));
        mLista.add(new Pagina("Marta", "7:45 am",
                "Recordatorio: Reunión de Equipo Mañana a las 10 AM",R.drawable.persona2));
        mLista.add(new Pagina("Miguel", "11:30 am",
                "¡Oferta Especial! Descuento Exclusivo para Clientes", R.drawable.persona3));
        mLista.add(new Pagina("Carlos", "3:25 am",
                "Agradecimiento por tu Participación en la Encuesta",R.drawable.persona4));
        mLista.add(new Pagina("Juliana", "14:20 pm",
                "Felicitaciones: ¡Has Ganado un Premio!",R.drawable.persona5));
        mLista.add(new Pagina("Carolina", "22:40 pm",
                "Actualización de Estado: Entrega de Pedido Pendiente", R.drawable.persona6));
        mLista.add(new Pagina("Steven", "19:35 pm",
                "Anuncio Importante: Cambio de Horario de Oficina", R.drawable.persona7));
        mLista.add(new Pagina("Camila", "05:35 am",
                "Confirmación de Reserva: Cena en Restaurante ABC", R.drawable.persona8));
        mAdapter = new ListAdapter(MainActivity.this,R.layout.item_row,mLista);
        mListView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "El mensaje leido fue el número: "+position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("nombre", mAdapter.getItem(position).getNombre());
        intent.putExtra("edad", mAdapter.getItem(position).getEdad());
        intent.putExtra("mensaje", mAdapter.getItem(position).getMensaje());
        intent.putExtra("imagen", mAdapter.getItem(position).getImage());
        startActivity(intent);
    }
}