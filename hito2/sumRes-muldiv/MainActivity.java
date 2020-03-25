package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String n1, n2;
    private Integer respuesta;
    private EditText et1, et2;
    private TextView tv1, tvRes;
    private Button btSumar, btRestar, btMulti, btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }

    public void initializeVariables() {
        et1 = findViewById(R.id.etNumber1);
        et2 = findViewById(R.id.etNum2);
        tv1 = findViewById(R.id.viewtv1);
        tv1.setText("Calculadora basica");
        tvRes = findViewById(R.id.viewtv2);
        btSumar = findViewById(R.id.btn1);
        btRestar = findViewById(R.id.btn2);
        btMulti = findViewById(R.id.btn3);
        btDiv=findViewById(R.id.btn4);
        btSumar.setOnClickListener(this);
        btRestar.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();
                respuesta = Integer.parseInt(n1) + Integer.parseInt(n2);
                tvRes.setText("" + respuesta);
                break;
            case R.id.btn2:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();
                respuesta = Integer.parseInt(n1) - Integer.parseInt(n2);
                tvRes.setText("" + respuesta);
                break;
            case R.id.btn3:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();
                respuesta = Integer.parseInt(n1) * Integer.parseInt(n2);
                tvRes.setText("" + respuesta);
                break;
            case R.id.btn4:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();
                respuesta = Integer.parseInt(n1) / Integer.parseInt(n2);
                tvRes.setText("" + respuesta);
                break;

        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
