package com.example.quizcraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions ;  // no. of quetions
    private  TextView question; // question show in quiz

    // Questions's options
    private AppCompatButton option1,option2, option3, option4;
    private AppCompatButton nextBtn;

    // activity Timer
    private Timer  quizTimer;
    private int totaltimeInMins = 1;
    private int seconds = 0;

    private   List<QuestionsList> questionsLists = new ArrayList<>();
    private int currentQuestionPosotion = 0;

    private  String selectedOptionByUser = "";


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

        // Set click listener
        setTopicSelectionListener();
        setNextButtonListerner();


        selectedTopicName.setText(getSelectedTopicName); //title of the page
        questionsLists = QuestionsBank.getQuestions(getSelectedTopicName); // get questions from questios bank
        questions.setText((currentQuestionPosotion + 1)+ "/" + questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());


        startTimer(timer);

        option1.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {

            if (selectedOptionByUser.isEmpty()){

                selectedOptionByUser = option1.getText().toString();
                option1.setBackgroundResource(R.drawable.round_back_red);
                option1.setTextColor(Color.WHITE);

                revealAnswer();

                questionsLists.get(currentQuestionPosotion).setUserSelectedAnswer(selectedOptionByUser);
            }

        }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red);
                    option2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosotion).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red);
                    option3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosotion).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red);
                    option4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosotion).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeNextQuestion();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onbackclick();
        }
        });
    }

    private void setNextButtonListerner() {
    }

    private void setTopicSelectionListener() {




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
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrect", getIncorrectAnswers());
                    startActivity(intent);

                    finish();
                } else{
                    seconds--;

                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes = String.valueOf(totaltimeInMins);
                        String finalSeconds =String.valueOf(seconds);

                        if (finalMinutes.length()==1){
                            finalMinutes = "0" + finalMinutes;
                        }

                        if (finalSeconds.length()==1){
                            finalSeconds = "0" + finalSeconds;
                        }

                        timerTextView.setText(finalMinutes + ":" + finalSeconds);
                    }
                });

            }
        },1000,1000);
    }

    private int getCorrectAnswers(){

        int correctAnswers = 0;
        for (int i = 0; i < questionsLists.size(); i++){
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }

        return  correctAnswers;
    }

    private int getIncorrectAnswers(){

        int incorrectAnswers = 0;
        for (int i = 0; i < questionsLists.size(); i++){
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)){
                incorrectAnswers++;
            }
        }

        return  incorrectAnswers;
    }

    public void onbackclick(){
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this,MainActivity.class));
        finish();
    }

    private void revealAnswer(){

        final String getAnswer = questionsLists.get(currentQuestionPosotion).getAnswer();

        if (option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green);
            option1.setTextColor(Color.parseColor("#FFFFFF"));

        } else  if (option2.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green);
            option1.setTextColor(Color.parseColor("#FFFFFF"));

        } else  if (option3.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green);
            option1.setTextColor(Color.parseColor("#FFFFFF"));

        }else {
            option1.setBackgroundResource(R.drawable.round_back_green);
            option1.setTextColor(Color.parseColor("#FFFFFF"));

        }
    }


    private void changeNextQuestion(){

        currentQuestionPosotion++;
        if ((currentQuestionPosotion + 1) == questionsLists.size()){
            nextBtn.setText("Submit Quiz");
        }

        if (currentQuestionPosotion < questionsLists.size()){

            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.round_back_white_strock);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_strock);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_strock);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_strock);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPosotion + 1)+ "/" + questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPosotion).getQuestion());
            option1.setText(questionsLists.get(currentQuestionPosotion).getOption1());
            option2.setText(questionsLists.get(currentQuestionPosotion).getOption2());
            option3.setText(questionsLists.get(currentQuestionPosotion).getOption3());
            option4.setText(questionsLists.get(currentQuestionPosotion).getOption4());
        } else  {
            Intent intent = new Intent(QuizActivity.this,ResultActivity.class);
            intent.putExtra("correct",getCorrectAnswers());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);

            finish();
        }
    }


}