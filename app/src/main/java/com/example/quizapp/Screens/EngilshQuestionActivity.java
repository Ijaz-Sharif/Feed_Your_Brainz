package com.example.quizapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizapp.R;

public class EngilshQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engilsh_question);
    }
    public void openLiteratureQuiz(View view){
        startActivity(new Intent(this, RuleActivity.class)
                .putExtra("type","Literature"));
    }
    public void openSpellingQuiz(View view){
        startActivity(new Intent(this, RuleActivity.class)
                .putExtra("type","Spelling"));
    }
    public void openGrammarQuiz(View view){
        startActivity(new Intent(this, RuleActivity.class)
                .putExtra("type","Grammar"));
    }
}