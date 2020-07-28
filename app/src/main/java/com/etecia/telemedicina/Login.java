package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    ImageView RecebeImgLogin;
    TextInputEditText txtEmail;
    TextInputEditText txtSenha;

    String LoginEstagiario = "estagiario@etecia.com.br";
    String SenhaEstagiario = "estagiario";

    String LoginPsiquiatra = "psiquiatra@etecia.com.br";
    String SenhaPsiquiatra = "psiquiatra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        RecebeImgLogin = findViewById(R.id.imgPaciente);

        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

    }

    public void Entrar(View view) {
        if (LoginEstagiario.equals(txtEmail.getText().toString()) && SenhaEstagiario.equals(txtSenha.getText().toString())) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }

        if (LoginPsiquiatra.equals(txtEmail.getText().toString()) && SenhaPsiquiatra.equals(txtSenha.getText().toString())) {
            Intent intent = new Intent(getApplicationContext(), TelaPsiquiatra.class);
            startActivity(intent);
        }
    }
}