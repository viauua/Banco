package br.ifsc.edu.br.banco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    EditText editTextPergunta, editTextResposta;
    Button buttonEnviar;

    DatabaseReference databaseCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        databaseCategoria = FirebaseDatabase.getInstance().getReference("Categoria");

        editTextPergunta = findViewById(R.id.editTextPergunta);
        editTextResposta = findViewById(R.id.editTextResposta);
        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });
    }
    private void enviar(){
        String pergunta = editTextPergunta.getText().toString().trim();
        String resposta = editTextResposta.getText().toString().trim();

        if(!TextUtils.isEmpty(pergunta) || !TextUtils.isEmpty(resposta)){

            String id = databaseCategoria.push().getKey();

            Enviado perguntaTitulo = new Enviado(id, pergunta, resposta);

            databaseCategoria.child(id).setValue(perguntaTitulo);

            Toast.makeText(this, "Pergunta submetida", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Não deixe este campo em branco", Toast.LENGTH_LONG).show();
        }

    }
}
