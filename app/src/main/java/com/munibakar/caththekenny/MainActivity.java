package com.munibakar.caththekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView[] imageArray;

    Handler handler;
    Runnable runnable;
    int number = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);



        imageArray = new ImageView[] {imageView,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8};



        imageHide();


        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Time: " +millisUntilFinished / 1000);
                imageView.isEnabled();


            }

            @Override
            public void onFinish() {
                handler.removeCallbacks(runnable);


                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Restart?");
                alert.setMessage("Are you sure to restart game?");

                alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Game Restarted!",Toast.LENGTH_LONG).show();
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);


                    }
                });

                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("Game Over!");
                        alert.setMessage("Skor: " + number);
                        alert.show();
                        for (ImageView image : imageArray){
                            image.setVisibility(View.INVISIBLE);




                        }

                    }
                });
                alert.show();
            }
        }.start();

    }

    public void imageHide(){
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                for (ImageView image : imageArray){
                    image.setVisibility(View.INVISIBLE);

                }

                Random r= new Random();
                int i=r.nextInt(9);
                imageArray[i].setVisibility(View.VISIBLE);

                handler.postDelayed(this,400);
            }
        };

        handler.post(runnable);


    }

    public void click1(View view){
        number++;
        textView2.setText("Skor: " + number );


    }
    public void click2(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click3(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click4(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click5(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click6(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click7(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click8(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
    public void click9(View view){
        number++;
        textView2.setText("Skor: " + number );

    }
}