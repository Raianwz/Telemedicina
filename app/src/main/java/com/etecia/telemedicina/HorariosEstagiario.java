package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HorariosEstagiario extends AppCompatActivity {
    //COMEÇO HORÁRIOS ESTAGIÁRIO
    String[] nomePsiquiatras = {"Dra. Beatriz Araújo", "Dr. Felipe Santos", "Dr. Paulo Muller", "Dra. Maria Pagano", "Dra. Giovanna Barreto", "Dr. Danilo Andrade"};
    String[] horarioEstagiarios = {"10:00-12:00", "12:00-14:00", "14:00-16:00", "16:00-18:00", "18:00-20:00", "20:00-22:00"};
    int[] iconeSeta = {R.drawable.ic_seta_horario, R.drawable.ic_seta_horario, R.drawable.ic_seta_horario,
            R.drawable.ic_seta_horario, R.drawable.ic_seta_horario, R.drawable.ic_seta_horario};

    //Declarar a variável global da Lista
    ListView ListaHorariosEstagiario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horario_estagiario_layout);

        ListaHorariosEstagiario = findViewById(R.id.ListaHorariosEstagiario);
        MeuAdaptador adaptador = new MeuAdaptador();
        ListaHorariosEstagiario.setAdapter(adaptador);
    }
    public class MeuAdaptador extends BaseAdapter{

        @Override
        public int getCount() {
            return iconeSeta.length;
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
            ImageView imgSeta;
            TextView horarioEstagiario;
            TextView txtPsiquiatra;

            //Criando o layout no adaptador para ser inflado (instanciado)
            View view1 = getLayoutInflater().inflate(R.layout.modelo_horarios, null);

            imgSeta = view1.findViewById(R.id.iconeSeta);
            horarioEstagiario = view1.findViewById(R.id.txtHorario);
            txtPsiquiatra = view1.findViewById(R.id.txtNomeEstagiario);

            imgSeta.setImageResource(iconeSeta[position]);
            horarioEstagiario.setText(horarioEstagiarios[position]);
            txtPsiquiatra.setText(nomePsiquiatras[position]);

            return view1;
        }
    }
    //FIM HORÁRIOS ESTAGIÁRIO
}
