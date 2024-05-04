package com.example.quizapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizapp.R;

public class RuleActivity extends AppCompatActivity {
       String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
        type=getIntent().getStringExtra("type");
    }
    public void openQuizScreen(View view){
        if(type.equals("physics")){
            startActivity(new Intent(this,PhysicsQuestionActivity.class));
        }else if(type.equals("Solar")){
            startActivity(new Intent(this,SolarQuestionActivity.class));
        }else if(type.equals("english")){
            startActivity(new Intent(this, HumanPartsQuestionActivity.class));
        }else if(type.equals("Literature")){
            startActivity(new Intent(this, LiteratureQuestionActivity.class));
        }else if(type.equals("Spelling")){
            startActivity(new Intent(this, SpellingQuestionActivity.class));
        }else if(type.equals("Grammar")){
            startActivity(new Intent(this, GrammerQuestionActivity.class));
        }
    }

}