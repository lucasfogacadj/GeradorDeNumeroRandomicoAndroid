package br.com.lucasfogaca.aulaoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edtxt;
    TextView txt;
    EditText vMax;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.xBtt);
        edtxt = (EditText) findViewById(R.id.xEtxt);
        txt =  (TextView) findViewById(R.id.xTxt);
        vMax = (EditText) findViewById(R.id.vMax);

        txt.setText("Gerador de Numero Aleatorio");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            /*
            public boolean validaTxt(EditText editText, EditText vMax){
                if((edtxt.getText().toString().isEmpty())||(vMax.getText().toString())){
                    Toast.makeText(MainActivity.this, "Campo Invalido", Toast.LENGTH_SHORT);
                    return false;
                }else {
                    return true;
                }
            }
            */

            public void onClick(View v) {

               

                Integer min = Integer.valueOf(edtxt.getText().toString());
                Integer max = Integer.valueOf(vMax.getText().toString());

                Random gerador = new Random();

                String aleatorio =  String.valueOf(gerador.nextInt(max)+min);

                Toast.makeText(MainActivity.this, aleatorio, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
