package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText clienteText;
    EditText pedidoText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enviar = findViewById(R.id.enviarButton);
        clienteText = findViewById(R.id.clienteText);
        pedidoText = findViewById(R.id.pedidoEditText);
        enviar.setOnClickListener(this);

    }
//função para chamar outra activity
    @Override
    public void onClick(View view) {

               Intent intent = new Intent(this, PedidoAtivoActivity2.class);

               //elementos para serem enviados para a próxima activity
               intent.putExtra("nome", clienteText.getText().toString());
               intent.putExtra("pedido", pedidoText.getText().toString());







        }
}