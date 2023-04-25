package edu.birzit.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    TextView l;
    Button b;

    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.lbl1);
        b=(Button) findViewById(R.id.btn1);
        spin=findViewById(R.id.spinner);

    }

    public void ShowMag(View view) {
        String [] datalist={"Male","Female","soso"};

        ArrayAdapter<String> ad = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,datalist);

        spin.setAdapter(ad);


        String gender= spin.getSelectedItem().toString();
        l.setText(gender);
    }
}