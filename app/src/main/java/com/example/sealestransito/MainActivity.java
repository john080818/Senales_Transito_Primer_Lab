package com.example.sealestransito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTipoSeñalizacion(View view){

        try {



            Spinner tipoSeñalizacion = findViewById(R.id.tipoSeñalizacion);
            TextView listaSeñalizacion = findViewById(R.id.listaSeñalizacion);
            TextView seleccionado = findViewById(R.id.seleccionado);

            String[] arrayInformacion = getResources().getStringArray(R.array.Informacion);
            String[] arrayPeligro = getResources().getStringArray(R.array.Peligro);
            String[] arrayAdvertencia = getResources().getStringArray(R.array.Advertencia);
            String[] arrayRegulacion = getResources().getStringArray(R.array.Regulacion);



            String tipo = String.valueOf(tipoSeñalizacion.getSelectedItem());

            listaSeñalizacion.setText("");

            switch (tipo){
                case "Informacion":

                    seleccionado.setText("Has seleccionado " + tipo);
                    for (String informacion : arrayInformacion) {
                        listaSeñalizacion.append( informacion + "\n");

                    }

                    break;

                case "Peligro":
                    seleccionado.setText("Has seleccionado " + tipo);

                    for (String peligro : arrayPeligro) {
                        listaSeñalizacion.append( peligro + "\n");
                    }

                    break;

                case "Advertencia":
                    seleccionado.setText("Has seleccionado " + tipo);

                    for (String advertencia : arrayAdvertencia) {
                        listaSeñalizacion.append( advertencia + "\n");
                    }

                    break;

                case "Regulacion":
                    seleccionado.setText("Has seleccionado " + tipo);

                    for (String regulacion : arrayRegulacion) {
                        listaSeñalizacion.append( regulacion + "\n");
                    }

                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}