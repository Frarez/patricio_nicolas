package cl.isisur.patricio_nicolas;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout paltaLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia al ConstraintLayout id_palta
        paltaLayout = findViewById(R.id.id_palta);

        // Obtener referencia a los botones
        Button buttonTomate = findViewById(R.id.button4);
        Button buttonPepino = findViewById(R.id.button5);

        // Configurar OnClickListener para el botón 4
        buttonTomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar el color de fondo del ConstraintLayout id_palta al color del tomate
                paltaLayout.setBackgroundColor(Color.RED);
            }
        });

        // Configurar OnClickListener para el botón 5
        buttonPepino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar el color de fondo del ConstraintLayout id_palta al color del pepino
                paltaLayout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
