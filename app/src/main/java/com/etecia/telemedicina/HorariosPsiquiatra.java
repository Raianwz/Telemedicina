package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HorariosPsiquiatra extends AppCompatActivity {

    //COMEÇO HORÁRIOS PSIQUIATRA
    String[] nomeEstagiarios = {"Célsio Flores", "Antônio Britto", "Ana Pedrosa", "Sérgio Pereira", "Bruna Ferreira", "João Pedro"};
    String[] horarioPsiquiatras = {"10:00-12:00", "12:00-14:00", "14:00-16:00", "16:00-18:00", "18:00-20:00", "20:00-22:00"};
    int[] iconeSeta = {R.drawable.ic_seta_horario, R.drawable.ic_seta_horario, R.drawable.ic_seta_horario, R.drawable.ic_seta_horario,
            R.drawable.ic_seta_horario, R.drawable.ic_seta_horario};

    //Declarar a variável global da Lista
    ListView ListaHorariosPsiquiatra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horarios_psiquiatra_layout);

        ListaHorariosPsiquiatra = findViewById(R.id.ListaHorariosPsiquiatra);
        MeuAdapatador adapter = new MeuAdapatador();
        ListaHorariosPsiquiatra.setAdapter(adapter);
    }
    public class MeuAdapatador extends BaseAdapter{

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
            TextView horarioPsiquiatra;
            TextView txtEstagiario;
            //Criando o layout no adaptador para ser inflado (instanciado)
            View view1 = getLayoutInflater().inflate(R.layout.modelo_horarios, null);

            imgSeta = view1.findViewById(R.id.iconeSeta);
            horarioPsiquiatra = view1.findViewById(R.id.txtHorario);
            txtEstagiario =  view1.findViewById(R.id.txtNomeEstagiario);

            imgSeta.setImageResource(iconeSeta[position]);
            horarioPsiquiatra.setText(horarioPsiquiatras[position]);
            txtEstagiario.setText(nomeEstagiarios[position]);

            return view1;
        }
    }
    //FIM HORÁRIOS PSIQUIATRA
}