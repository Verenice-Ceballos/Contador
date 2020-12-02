package com.vereniceceballos.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mConteoTextView;
    Button mContarButton;
    Button mReiniciarButton;
    int mConteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConteo=0;
        mConteoTextView=findViewById(R.id.conteo_text_view);
        mContarButton = findViewById(R.id.contar_button);
        mReiniciarButton = findViewById(R.id.reiniciar_button);

        mContarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mConteo++;
                mConteoTextView.setText(Integer.toString(mConteo));
            }
        });

        mReiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConteo=0;
                mConteoTextView.setText(Integer.toString(mConteo));
            }
        });
    }
}