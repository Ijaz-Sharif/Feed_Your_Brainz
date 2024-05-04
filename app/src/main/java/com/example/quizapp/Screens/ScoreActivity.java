package com.example.quizapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quizapp.MainActivity;
import com.example.quizapp.R;

public class ScoreActivity extends AppCompatActivity {
      TextView score_text;
      int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
score=getIntent().getIntExtra("score",-1);
        score_text=findViewById(R.id.score_text);


    }

    @Override
    protected void onStart() {
        score_text.setText(score+"/5");
        super.onStart();
    }
    public void finish(View view){
        startActivity(new Intent(this, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }
}