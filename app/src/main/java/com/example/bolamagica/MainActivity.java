package com.example.bolamagica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn1;
    private TextView label1, bienvenida2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.btn1); //Se enlaza el botón con el de la vista
        label1 = (TextView) findViewById(R.id.bienvenida); //Enlaza el label con la vista
        bienvenida2 = (TextView) findViewById(R.id.bienvenida2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFortuna();
            }
        });

    }
    private void getFortuna(){
//        Toast.makeText(getApplicationContext(), "Ok", Toast.LENGTH_LONG).show();
        Random r = new Random();
        int i = r.nextInt(10);
        String[] frases = {"¡Te va a ir muy bien hoy!",
                "Tu suerte será especialemente buena hoy",
                "Prueba mañana, hoy quédate en casa",
                "Aléjate de los perros desconocidos hoy",
                "Tu día está en tus manos",
                "Los espíritus estarán en tu contra hoy",
                "¡Rain check! El día dependerá de tu actitud",
                "Uff, no quiero darte las malas noticias...",
                "Hoy es TU día, bro B)",
                "Hoy... No será tu día, lo siento"};
        label1.setText("" + frases[i]);
    }
}