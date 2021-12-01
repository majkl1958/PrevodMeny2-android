package com.example.prevodmeny2;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.DoubleSummaryStatistics;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText koruny;
    Spinner  sp;
    String[] pole = {"Dolary","Eura","Zlotý","Forinty"};
    ArrayAdapter adapter;
    String vysledek;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        koruny = (EditText) findViewById(R.id.castka);
        sp = (Spinner) findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,pole);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

}

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

      if(i==0) {
          String  kS = koruny.getText().toString();
          double kD;
          try{kD = Double.parseDouble(kS);
            double v = kD/22.0;
              vysledek = String.valueOf(v);
              Toast.makeText(this,vysledek,Toast.LENGTH_LONG).show();
          } catch (Exception e){

          }


      }
        if(i==1) {
            String  kS = koruny.getText().toString();
            double kD;
            try{kD = Double.parseDouble(kS);
                double v = kD/25.0;
                vysledek = String.valueOf(v);
                Toast.makeText(this,vysledek,Toast.LENGTH_LONG).show();
            } catch (Exception e){

            }


        }if(i==2) {
            String  kS = koruny.getText().toString();
            double kD;
            try{kD = Double.parseDouble(kS);
                double v = kD/6.0;
                vysledek = String.valueOf(v);
                Toast.makeText(this,vysledek,Toast.LENGTH_LONG).show();
            } catch (Exception e){

            }


        }if(i==3) {
            String  kS = koruny.getText().toString();
            double kD;
            try{kD = Double.parseDouble(kS);
                double v = kD/0.07;
                vysledek = String.valueOf(v);
                Toast.makeText(this,vysledek,Toast.LENGTH_LONG).show();
            } catch (Exception e){

            }


        }

        /**/


  }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}