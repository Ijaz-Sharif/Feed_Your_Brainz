package com.example.quizapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import com.example.quizapp.R;

public class ScienceQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_question);
    }
    public void openPhysicsQuestion(View view){
         startActivity(new Intent(this,RuleActivity.class)
                 .putExtra("type","physics"));
    }
    public void openSolarQuestion(View view){
        startActivity(new Intent(this,RuleActivity.class)
                .putExtra("type","Solar"));

    }
    public void openQuiz(View view){
        startActivity(new Intent(this,RuleActivity.class)
                .putExtra("type","english"));

    }
}