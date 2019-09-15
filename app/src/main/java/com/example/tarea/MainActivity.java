package com.example.tarea;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Switch sw = findViewById(R.id.boton);
        final Button bt = findViewById(R.id.copiartexto);
        final EditText et = findViewById(R.id.editText);
        final TextView tv = findViewById(R.id.hola);
        final SeekBar sk = findViewById(R.id.seekBar);



        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //bt.setEnabled(false);

                if (sw.isChecked()) {
                    bt.setEnabled(true);


                }else {
                    bt.setEnabled(false);

                }



            }
        });

        final EditText finalEt = et;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = finalEt.getText().toString();
                tv.setText(texto);
            }
        });












    }
}
