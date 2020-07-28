package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

public class TelaPsiquiatra extends AppCompatActivity {
    //Psiquiatra
    String pacientes = "Pacientes";
    String metodos = "Métodos Avaliativos";

    GridView MenuInfoP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_psiquiatra_layout);
        MenuInfoP = findViewById(R.id.MenuInfoP);
        AdaptadorMenu adapter = new AdaptadorMenu();
        MenuInfoP.setAdapter(adapter);
    }
    public class AdaptadorMenu extends BaseAdapter{

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
            item1.setText(metodos);
            item2.setText(pacientes);

            return view1;
        }
    }
    //Fim Menu Psiquiatra
}