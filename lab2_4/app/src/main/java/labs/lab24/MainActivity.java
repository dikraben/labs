package labs.lab24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    Button english, suomi , sverige , surprise;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =(EditText) findViewById(R.id.editText);
        english =(Button) findViewById(R.id.english);
        suomi =(Button) findViewById(R.id.suomi);
        sverige =(Button) findViewById(R.id.sverige);
        surprise =(Button) findViewById(R.id.surprise);
        result = (TextView) findViewById(R.id.result);

        english.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                result.setText("Hello " + text);
            }
        });

        suomi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                result.setText("Terve " + text);
            }
        });

        sverige.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                result.setText("Hejjsan " + text);
            }
        });

        surprise.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                result.setText("Hola " + text);
            }
        });
    }


}
