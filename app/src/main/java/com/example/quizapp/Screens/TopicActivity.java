package com.example.quizapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizapp.R;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
    }
    public void openScienceQuestionList(View view){
        startActivity(new Intent(this,ScienceQuestionActivity.class));
    }
    public void openEnglishQuestionList(View view){
        startActivity(new Intent(this,EngilshQuestionActivity.class));

    }
}