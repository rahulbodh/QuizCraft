package com.example.quizcraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions ;
    private  TextView question;

    private AppCompatButton option1,option2, option3, option4;
    private AppCompatButton nextBtn;

    private Timer  quizTimer;
    private int totaltimeInMins = 1;
    private int seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopicName");
        final ImageView backBtn  = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.topicName);

        questions = findViewById(R.id.questions);
        question =findViewById(R.id.question);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        nextBtn = findViewById(R.id.nextBtn);

        selectedTopicName.setText(getSelectedTopicName);


    }

    private  void startTimer(TextView timerTextView){
        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (seconds == 0){
                    totaltimeInMins--;
                    seconds = 59;
                }else if (seconds == 0 && totaltimeInMins == 0){
                    quizTimer.purge();
                    quizTimer.cancel();

                    Toast.makeText(QuizActivity.this,"Time Over", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this,ResultActivity.class);
                }

            }
        },1000,1000);
    }


}