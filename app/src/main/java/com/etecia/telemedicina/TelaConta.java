package com.etecia.telemedicina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TelaConta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_conta_layout);

        final String Psiquiatra = "Usuário: Psiquiatra";

        final TextView usuario = (TextView) findViewById(R.id.usuario);
        final TextView email = (TextView) findViewById(R.id.email);
        TextView senha = (TextView) findViewById(R.id.senha);

        Intent intentRecebedora = getIntent();

        Bundle parametros = intentRecebedora.getExtras();

        if(parametros != null){
            String txtusuario = parametros.getString("chave_usuario");
            String txtemail = parametros.getString("chave_email");
            String txtsenha = parametros.getString("chave_senha");

            usuario.setText(txtusuario);
            email.setText(txtemail);
            senha.setText(txtsenha);
        }

        //Inicializando e declarando a variável
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        //Setando o icone conta como ativado
        bottomNavigationView.setSelectedItemId(R.id.mnConta);

        //Ajustando para onde cada evento de clicar nos itens do BottomNavigationView nos leva
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mnSair:
                        Intent intentSair = new Intent(getApplicationContext(), Login.class);
                        startActivity(intentSair);
                        break;

                    case R.id.mnHome:
                        if(Psiquiatra.equals(usuario.getText().toString())){
                            Intent intentHome = new Intent(getApplicationContext(), TelaPsiquiatra.class);
                            startActivity(intentHome);
                        }else{
                            Intent intentHome = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intentHome);
                        }
                }

                return false;

            }
        });



    }
}