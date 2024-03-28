package com.example.entrega3;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.txtViewNombre);
        textView.setText(getIntent().getStringExtra("nombre"));
        TextView textView1 = findViewById(R.id.txtViewEdad);
        textView1.setText(getIntent().getStringExtra("edad"));
        TextView textView2 = findViewById(R.id.txtMensaje);
        textView2.setText(getIntent().getStringExtra("mensaje"));
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(getIntent().getIntExtra("imagen",R.drawable.persona1));


    }
}