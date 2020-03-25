package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button but1;
private TextView txt;
private EditText etx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVarianbles();
    }
    public void initializeVarianbles(){
        but1=findViewById(R.id.button1);
        but1.setText("Ingresar");
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String contenido=etx.getText().toString();
                etx.setText(contenido.toString());
            }
        });
        txt.findViewById(R.id.texto);
        txt.setText("DIEGO");
        etx.findViewById(R.id.caja);
    }
}
