package com.etecia.telemedicina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class PacientesPsiquiatra extends AppCompatActivity {
    //Começo dos Pacientes
    String[] nomePaciente = {"Claudio Silva", "Gustavo Alves", "Francisco Lima", "Andressa de Oliveira", "Fernanda Vitoria", "Clara Oswald"};
    String[] idadePaciente = {"Idade: 30 anos", "Idade: 24 anos", "Idade: 28 anos", "Idade: 23 anos", "Idade: 25 anos", "Idade: 27 anos",};
    String[] areaPaciente = {"Área: Nutrição ", "Área: Administração ", "Área: Quimica ", "Área: Desenvolvimento", "Área: Física", "Área: Engenharia"};
    int[] imgPaciente = {R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente, R.drawable.ic_paciente};

    //Variavel Global.
    GridView ListaPacientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pacientes_psiquiatra_layout);

        ListaPacientes = findViewById(R.id.ListaPacientes);
        MeuAdapatador adapatador = new MeuAdapatador();
        ListaPacientes.setAdapter(adapatador);
    }

    public class MeuAdapatador extends BaseAdapter {

        @Override
        public int getCount() {
            return imgPaciente.length;
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
            ImageView img;
            TextView nome;
            TextView idade;
            TextView area;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_pacientes, null);

            img = view1.findViewById(R.id.imgPaciente);
            nome = view1.findViewById(R.id.txtNomePaciente);
            idade = view1.findViewById(R.id.txtIdadePaciente);
            area = view1.findViewById(R.id.txtAreaPaciente);

            img.setImageResource(imgPaciente[position]);
            nome.setText(nomePaciente[position]);
            idade.setText(idadePaciente[position]);
            area.setText(areaPaciente[position]);

            return view1;
        }
    }
    //Fim dos Pacientes.
}