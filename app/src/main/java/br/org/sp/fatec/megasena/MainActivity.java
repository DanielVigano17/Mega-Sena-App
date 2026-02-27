package br.org.sp.fatec.megasena;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void SortearNumeros(View view)
    {
        int[] ids = {
                R.id.numero1,
                R.id.numero2,
                R.id.numero3,
                R.id.numero4,
                R.id.numero5,
                R.id.numero6
        };

        for (int id : ids) {
            TextView textView = findViewById(id);
            textView.setText(String.valueOf(sortearNumero()));
        }
    }

    public void limparNumeros(View view) {

        int[] ids = {
                R.id.numero1,
                R.id.numero2,
                R.id.numero3,
                R.id.numero4,
                R.id.numero5,
                R.id.numero6
        };

        for (int id : ids) {
            TextView textView = findViewById(id);
            textView.setText("");
        }
    }

    public static int sortearNumero() {
        Random random = new Random();
        return random.nextInt(60) + 1; // 0–59 + 1 = 1–60
    }
}