package sg.edu.np.WhackAMole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Whack A Mole";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Finished Pre-Initialisation!");


    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Starting GUI!");
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final int[] points = {0};
        setNewMole(button1,button2,button3);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.v(TAG, "Left Button Clicked!");
                if (button1.getText() == "*") {
                    points[0] += 1;
                    String temp = null;
                    temp = Integer.toString(points[0]);
                    TextView text = findViewById(R.id.textView3);
                    text.setText(temp);
                    setNewMole(button1,button2,button3);
                    Log.v(TAG, "Hit, score added!");

                } else {
                    points[0] -= 1;
                    String temp = null;
                    temp = Integer.toString(points[0]);
                    TextView text = findViewById(R.id.textView3);
                    text.setText(temp);
                    setNewMole(button1,button2,button3);
                    Log.v(TAG, "Missed, score deducted!");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Middle Button Clicked!");
                if (button2.getText() == "*") {
                    points[0] += 1;
                    String temp = null;
                    temp = Integer.toString(points[0]);
                    TextView text = findViewById(R.id.textView3);
                    text.setText(temp);
                    setNewMole(button1,button2,button3);
                    Log.v(TAG, "Hit, score added!");

                } else {
                    points[0] -= 1;
                    String temp = null;
                    temp = Integer.toString(points[0]);
                    TextView text = findViewById(R.id.textView3);
                    text.setText(temp);
                    setNewMole(button1,button2,button3);
                    Log.v(TAG, "Missed, score deducted!");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Right Button Clicked!");
                if (button3.getText() == "*") {
                    points[0] += 1;
                    String temp = null;
                    temp = Integer.toString(points[0]);
                    TextView text = findViewById(R.id.textView3);
                    text.setText(temp);
                    setNewMole(button1,button2,button3);
                    Log.v(TAG, "Hit, score added!");

                } else {
                    points[0] -= 1;
                    String temp = null;
                    temp = Integer.toString(points[0]);
                    TextView text = findViewById(R.id.textView3);
                    text.setText(temp);
                    setNewMole(button1,button2,button3);
                    Log.v(TAG, "Missed, score deducted!");
                }
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroying App");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stopping App");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pausing App");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resuming App");
    }



    public void setNewMole(Button button1,Button button2,Button button3) {



            button1.setText("0");
            button2.setText("0");
            button3.setText("0");

            Random[] ran = {new Random()};
            int randomLocation = ran[0].nextInt(3);
            Button mole;
            if (randomLocation == 1) {
                mole = findViewById(R.id.button1);

            } else if (randomLocation == 2) {
                mole = findViewById(R.id.button2);

            } else {
                mole = findViewById(R.id.button3);

            }
            mole.setText("*");



        }

    }
