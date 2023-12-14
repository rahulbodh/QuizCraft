package com.example.quizcraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView congratulationText;
    private TextView rightCount;
    private TextView wrongCount;
    private ImageView congratulationImage;
    public ImageView back;
   private AppCompatButton startNewQuiz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        congratulationImage = findViewById(R.id.congratulationImage);
        congratulationText = findViewById(R.id.congTextView);
        rightCount = findViewById(R.id.correctAnswer);
        wrongCount = findViewById(R.id.wrongAnswer);
        startNewQuiz = findViewById(R.id.startNewQuiz);
       ImageView  back = findViewById(R.id.backBtn2);

        final int getCorrectAnswers = getIntent().getIntExtra("correct",0);
        final int getInCorrectAnswers = getIntent().getIntExtra("incorrect",0);

        rightCount.setText("Correct : "+String.valueOf(getCorrectAnswers));
        wrongCount.setText("Incorrect : "+String.valueOf(getInCorrectAnswers));



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onbackclick();
            }

            private void onbackclick() {
                startActivity(new Intent(ResultActivity.this,MainActivity.class));
                finish();
            }
        });

        startNewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        });


    }


}