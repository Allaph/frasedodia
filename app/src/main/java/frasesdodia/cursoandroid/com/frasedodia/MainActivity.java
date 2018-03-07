package frasesdodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Não desista. Geralmente é a última chave no chaveiro que abre a porta.",
            "Insista, persista e não desista!",
            "Persista e insista, mas nunca desista, pois um dia você conquista.",
            "E quando sentir que nada está dando certo, apenas persista.",
            "AS COISAS TÊM O VALOR QUE VOCÊ DÁ A ELAS",
            "Nunca desista dos seus ideais, pois se desistir a luta acaba e algum dia esta vitória irá lhe fazer falta.",
            "Dia após dia, semana após semana, nunca desista. Morra tentando!",
            "Continue se levantando até a vida cansar de te derrubar.",
            "Nunca desista por ser difícil. Dizem que tudo aquilo que é difícil de conseguir, é mais difícil ainda de perder.",
            "Sempre vai existir uma chance se você acreditar."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt( frases.length );

                textoNovaFrase.setText(frases[ numeroAleatorio ] );
            }
        });

    }
}
