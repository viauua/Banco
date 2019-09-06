package br.ifsc.edu.br.banco;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaPergunta extends ArrayAdapter<Enviado> {

    private Activity context;
    private List<Enviado> listaPergunta;

    public ListaPergunta(Activity context, List<Enviado> listaPergunta){
        super(context, R.layout.activity_main3, listaPergunta);
        this.context = context;
        this.listaPergunta = listaPergunta;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.activity_main3, null, true);

        TextView textViewPergunta = (TextView) listViewItem.findViewById(R.id.textViewPergunta);
        TextView textViewResposta = (TextView) listViewItem.findViewById(R.id.textViewResposta);

        Enviado enviado = listaPergunta.get(position);

        textViewPergunta.setText(enviado.getPerguntaID());
        textViewResposta.setText(enviado.getRespostaID());

        return listViewItem;
    }
}
