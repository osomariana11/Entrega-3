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

        mLista.add(new Pagina("Andres", "21", R.drawable.persona1));
        mLista.add(new Pagina("Marta", "45", R.drawable.persona2));
        mLista.add(new Pagina("Miguel", "30", R.drawable.persona3));
        mLista.add(new Pagina("Carlos", "25", R.drawable.persona4));
        mLista.add(new Pagina("Juliana", "20", R.drawable.persona5));
        mLista.add(new Pagina("Carolina", "40", R.drawable.persona6));
        mLista.add(new Pagina("Steven", "35", R.drawable.persona7));
        mAdapter = new ListAdapter(MainActivity.this,R.layout.item_row,mLista);
        mListView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Elemento ciclado: "+position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("nombre", mAdapter.getItem(position).getNombre());
        intent.putExtra("edad", mAdapter.getItem(position).getEdad());
        startActivity(intent);
    }
}