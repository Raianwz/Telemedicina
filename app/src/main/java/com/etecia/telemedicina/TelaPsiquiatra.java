package com.etecia.telemedicina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TelaPsiquiatra extends AppCompatActivity {
    //Psiquiatra
    String pacientes = "Pacientes";
    String metodos = "Métodos Avaliativos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_psiquiatra_layout);

        //Inicializando e declarando a variável
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_P);

        //Setando o icone home como ativado
        bottomNavigationView.setSelectedItemId(R.id.mnHome);

        //Ajustando para onde cada evento de clicar nos itens do BottomNavigationView nos leva
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mnSair:
                        Intent intentSair = new Intent(getApplicationContext(), Login.class);
                        startActivity(intentSair);
                        break;

                    case R.id.mnConta:
                        TextView usuario = (TextView) findViewById(R.id.usuario);
                        String txtusuario = "Usuário: Psiquiatra";

                        TextView email = (TextView) findViewById(R.id.email);
                        String txtemail = "E-mail: psiquiatra@etecia.com.br";

                        TextView senha = (TextView) findViewById(R.id.senha);
                        String txtsenha = "Senha: psiquiatra";

                        Intent intentConta = new Intent(getApplicationContext(), TelaConta.class);
                        Bundle parametros = new Bundle();

                        parametros.putString("chave_usuario", txtusuario);
                        parametros.putString("chave_email", txtemail);
                        parametros.putString("chave_senha", txtsenha);

                        intentConta.putExtras(parametros);

                        startActivity(intentConta);

                        break;

                }

                return false;

            }
        });
    }
    //Fim Menu Psiquiatra

    public void AbreMetodosAvaliativos(View view) {
        Intent intent = new Intent(getApplicationContext(), TelaMetodosAvaliativos.class);
        startActivity(intent);
    }

    public void AbrePsiquiatras(View view) {
        Intent intent = new Intent(getApplicationContext(), PacientesPsiquiatra.class);
        startActivity(intent);
    }

    public void AbreHorarios(View view) {
        Intent intent = new Intent(getApplicationContext(), HorariosPsiquiatra.class);
        startActivity(intent);
    }

    public void AbreSobre(View view) {
        Intent intent = new Intent(getApplicationContext(), TelaSobre.class);
        startActivity(intent);
    }
}