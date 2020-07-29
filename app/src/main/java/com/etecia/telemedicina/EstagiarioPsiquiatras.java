package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class EstagiarioPsiquiatras extends AppCompatActivity {
    String[] nomePsiquiatras = {"Dra. Beatriz Araújo", "Dr. Felipe Santos", "Dr. Paulo Muller", "Dra. Maria Pagano", "Dra. Giovanna Barreto", "Dr. Danilo Andrade"};
    int[] imgPsquiatras = {R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente};

    GridView ListaPsiquiatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estagiario_psiquiatras_layout);

        ListaPsiquiatras = findViewById(R.id.ListaPsiquiatras);
        MeuAdapator adapator = new MeuAdapator();
        ListaPsiquiatras.setAdapter(adapator);
    }
    public class MeuAdapator extends BaseAdapter{

        @Override
        public int getCount() {
            return imgPsquiatras.length;
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
        public View getView(int position, View view, ViewGroup viewGroup) {
            TextView nomePsi;
            ImageView img;
            View view1 = getLayoutInflater().inflate(R.layout.modelo_psiquiatras, null);
            nomePsi = view1.findViewById(R.id.txtNomePsiquiatra);
            img = view1.findViewById(R.id.imgPsiquiatra);

            nomePsi.setText(nomePsiquiatras[position]);
            img.setImageResource(imgPsquiatras[position]);

            return view1;
        }
    }
    //Fim
}