package com.example.suryadeep.examtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1=MediaPlayer.create(this,R.raw.three);

        final TextView mnumber=findViewById(R.id.mnumber);
        final TextView done=findViewById(R.id.done);

        new CountDownTimer(30000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                mnumber.setText("Time : "+String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                done.setText("Done !!!");
                m1.start();
            }
        }.start();
    }
}
