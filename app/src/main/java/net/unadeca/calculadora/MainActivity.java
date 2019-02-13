package net.unadeca.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity {

    private String mostrar;
    private String op;
    private String reserva;

    float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button cero = findViewById(R.id.cero);
        final Button uno = findViewById(R.id.uno);
        final Button dos = findViewById(R.id.dos);
        final Button tres = findViewById(R.id.tres);
        final Button cuatro = findViewById(R.id.cuatro);
        final Button cinco = findViewById(R.id.cinco);
        final Button seis = findViewById(R.id.seis);
        final Button siete = findViewById(R.id.siete);
        final Button ocho = findViewById(R.id.ocho);
        final Button nueve = findViewById(R.id.nueve);
        final Button C = findViewById(R.id.C);
        final Button suma = findViewById(R.id.suma);
        final Button resta = findViewById(R.id.resta);
        final Button multiplicacion = findViewById(R.id.multi);
        final Button division = findViewById(R.id.division);
        final Button igual = findViewById(R.id.igual);
        final Button borrar = findViewById(R.id.borrar);
        final TextView Resultado = findViewById(R.id.resultado);
        final Button punto = findViewById(R.id.punto);

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                op = "+";
                Resultado.setText("");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                op = "-";
                Resultado.setText("");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                op = "*";
                Resultado.setText("");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                op = "/";
                Resultado.setText("");
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                op = "";
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";

                switch (op){
                    case "+":
                        resultado = Float.parseFloat(reserva) + Float.parseFloat(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    break;
                    case "-":
                        resultado = Float.parseFloat(reserva) - Float.parseFloat(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado = Float.parseFloat(reserva) / Float.parseFloat(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = Float.parseFloat(reserva) * Float.parseFloat(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                        break;
                }

            }
        });
    }

}
