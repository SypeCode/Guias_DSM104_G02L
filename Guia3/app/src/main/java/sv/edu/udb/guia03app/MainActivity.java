package sv.edu.udb.guia03app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyLifeCycleObserver());
        setContentView(R.layout.activity_main);

        cont = (TextView) findViewById(R.id.cont);
    }

    public void sumar(View view) {
        String valorActual = cont.getText().toString();
        int actual = Integer.parseInt(valorActual);
        int sum = 0;
        String resu;

        if(actual == 9) {
            resu = String.valueOf(sum);
        } else {
            sum = actual + 1;
            resu = String.valueOf(sum);
        }

        cont.setText(resu);
    }
}