package com.edilo.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.cliqueme);
        TextView txt = (TextView) findViewById(R.id.helloWorld);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt.setText("Edilo Sousa da Silva");
                Toast.makeText(MainActivity.this, "click no botao", Toast.LENGTH_SHORT).show();
            }
        });
    }
}