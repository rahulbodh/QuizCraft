package com.example.quizcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.java);
        final LinearLayout python = findViewById(R.id.python);
        final LinearLayout html = findViewById(R.id.html);
        final LinearLayout android = findViewById(R.id.android);

        final Button startBtn  = findViewById(R.id.startquiz);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Java";

                java.setBackgroundResource(R.drawable.round_stock);
                python.setBackgroundResource(R.drawable.round_black_white);
                android.setBackgroundResource(R.drawable.round_black_white);
                html.setBackgroundResource(R.drawable.round_black_white);
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "python";

                python.setBackgroundResource(R.drawable.round_stock);
                java.setBackgroundResource(R.drawable.round_black_white);
                android.setBackgroundResource(R.drawable.round_black_white);
                html.setBackgroundResource(R.drawable.round_black_white);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "android";

                android.setBackgroundResource(R.drawable.round_stock);
                python.setBackgroundResource(R.drawable.round_black_white);
                java.setBackgroundResource(R.drawable.round_black_white);
                html.setBackgroundResource(R.drawable.round_black_white);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.round_stock);
                python.setBackgroundResource(R.drawable.round_black_white);
                android.setBackgroundResource(R.drawable.round_black_white);
                java.setBackgroundResource(R.drawable.round_black_white);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(
                            MainActivity.this,
                            "Please Select any topic",
                            Toast.LENGTH_SHORT)
                            .show();
                }else{
                    Intent intent =  new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopicName", selectedTopicName);
                    startActivity(intent);
                }
            }
        });


    }
}