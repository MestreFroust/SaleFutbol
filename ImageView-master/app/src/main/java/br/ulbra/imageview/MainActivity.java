package br.ulbra.imageview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView imgFoto;
        Button btfoto1, btfoto2;
        TextView txtInformacao;

        imgFoto= findViewById(R.id.imgFoto);

        btfoto1 = findViewById(R.id.btfoto1);

        btfoto2 = findViewById(R.id.btfoto2);

        txtInformacao = findViewById(R.id.txtInformacao);

        btfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgFoto.setImageResource(R.drawable.mago);

                txtInformacao.setText("MAGO");
            }
        });

        btfoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgFoto.setImageResource(R.drawable.souzones);

                txtInformacao.setText("SOUZONES");
            }
        });




    }
}}