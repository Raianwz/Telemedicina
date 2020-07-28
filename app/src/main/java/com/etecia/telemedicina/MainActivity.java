package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.google.android.material.appbar.MaterialToolbar;

//Menu de Informações
public class MainActivity extends AppCompatActivity {
    //Estagiario
    String avalicao = "Avaliação";
    String psiquiatras = "Psiquiatras";
    //Psiquiatra
    String pacientes = "Pacientes";
    String metodos = "Métodos Avaliativos";
    MaterialToolbar navInfo;

    GridView MenuInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Grid View Menu informações
        MenuInfo = findViewById(R.id.MenuInfo);
        AdapatorMenu adapatorMenu = new AdapatorMenu();
        MenuInfo.setAdapter(adapatorMenu);

        //Barra de informações
        navInfo = findViewById(R.id.navInfo);

        //navInfo.setLogo(R.drawable.ic_hospital);

        //Intent que receberá os dados da ourta activity
        Intent intent = getIntent();

        String loginE = intent.getStringExtra("loginE");
        String loginP = intent.getStringExtra("loginP");

    }
    public class AdapatorMenu extends BaseAdapter {

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Button item1;
            Button item2;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_info, null);

            item1 = view1.findViewById(R.id.btnAvaliacao);
            item2 = view1.findViewById(R.id.btnPsiPac);
            item1.setText(avalicao);
            item2.setText(psiquiatras);

            return view1;
        }
    }
    //Fim do Menu
}