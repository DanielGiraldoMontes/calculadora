package edu.sanmateo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculadora extends AppCompatActivity implements View.OnClickListener {
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnPunto,
            btnIgual, btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar, btnBorrar;
    EditText etProceso, etProcesoInicial;
    double numero1, numero2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnBorrar = findViewById(R.id.btnBorrar);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        btnPunto = findViewById(R.id.btnPunto);
        btnIgual = findViewById(R.id.btnIgual);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        etProceso = findViewById(R.id.etProceso);
        etProcesoInicial = findViewById(R.id.etProcesoInicial);

        btnCero.setOnClickListener(this);
        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnLimpiar.setOnClickListener(this);
        btnBorrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBorrar:
                etProceso.setText(deleteLastCharacter(etProceso.getText().toString()));
                break;
            case R.id.btnLimpiar:
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
                etProcesoInicial.setText("");
                break;
            case R.id.btnCero:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "0"));
                break;
            case R.id.btnUno:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "1"));
                break;
            case R.id.btnDos:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "2"));
                break;
            case R.id.btnTres:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "3"));
                break;
            case R.id.btnCuatro:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "4"));
                break;
            case R.id.btnCinco:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "5"));
                break;
            case R.id.btnSeis:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "6"));
                break;
            case R.id.btnSiete:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "7"));
                break;
            case R.id.btnOcho:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "8"));
                break;
            case R.id.btnNueve:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "9"));
                break;
            case R.id.btnPunto:
                etProceso.setText(String.format("%s%s", etProceso.getText().toString(), "."));
                break;
            case R.id.btnIgual:
                numero2 = Double.parseDouble(etProceso.getText().toString());
                if (operador.equals("+"))
                    resultado = numero1 + numero2;

                if (operador.equals("-"))
                    resultado = numero1 - numero2;

                if (operador.equals("*"))
                    resultado = numero1 * numero2;

                if (operador.equals("/")) {
                    if (numero2 != 0)
                        resultado = numero1 / numero2;
                    else
                        etProceso.setText(getText(R.string.text_infinite));
                }
                etProceso.setText(String.valueOf(resultado));
                etProcesoInicial.setText("");
                break;
            case R.id.btnSuma:
                operador = "+";
                numero1 = Double.parseDouble(etProceso.getText().toString());
                etProcesoInicial.setText(etProceso.getText().toString());
                etProceso.setText("");
                break;
            case R.id.btnResta:
                operador = "-";
                numero1 = Double.parseDouble(etProceso.getText().toString());
                etProcesoInicial.setText(etProceso.getText().toString());
                etProceso.setText("");
                break;
            case R.id.btnMulti:
                operador = "*";
                numero1 = Double.parseDouble(etProceso.getText().toString());
                etProcesoInicial.setText(etProceso.getText().toString());
                etProceso.setText("");
                break;
            case R.id.btnDiv:
                operador = "/";
                numero1 = Double.parseDouble(etProceso.getText().toString());
                etProcesoInicial.setText(etProceso.getText().toString());
                etProceso.setText("");
                break;
        }
    }

    /**
     * @param chain Recibe la cadena a la cual quiere borrar el ultimo caracter.
     * @return Retorna la cadena eliminando el ultimo caracter.
     */
    private String deleteLastCharacter(String chain) {
        if (chain.length() == 0)
            return chain;

        return chain.substring(chain.length() - 1);
    }
}
