package labs.lab21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

                final Button gameButton = new Button(this);
                gameButton.setText("Hello, I'm the button");
                setContentView(gameButton);

                gameButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view)
                    {
                        count++;
                        gameButton.setText("button pressed "+count);
                    }
                });
            }
        }

