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

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//Menu de Informações
public class MainActivity extends AppCompatActivity {
    //Estagiario
    String avalicao = "Avaliação";
    String psiquiatras = "Psiquiatras";
    MaterialToolbar navInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Barra de informações
        navInfo = findViewById(R.id.navInfo);

        //Inicializando e declarando a variável
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_E);

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
                        String txtusuario = "Usuário: Estagiário";

                        TextView email = (TextView) findViewById(R.id.email);
                        String txtemail = "E-mail: estagiario@etecia.com.br";

                        TextView senha = (TextView) findViewById(R.id.senha);
                        String txtsenha = "Senha: estagiario";

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
    //Fim do Menu

    public void AbreAvaliacao(View view) {
        Intent intent = new Intent(getApplicationContext(), TelaAvaliacao.class);
        startActivity(intent);
    }

    public void AbrePsiquiatras(View view) {
        Intent intent = new Intent(getApplicationContext(), EstagiarioPsiquiatras.class);
        startActivity(intent);
    }

    public void AbreHorarios(View view) {
        Intent intent = new Intent(getApplicationContext(), HorariosEstagiario.class);
        startActivity(intent);
    }

    public void AbreSobre(View view) {
        Intent intent = new Intent(getApplicationContext(), TelaSobre.class);
        startActivity(intent);
    }
}