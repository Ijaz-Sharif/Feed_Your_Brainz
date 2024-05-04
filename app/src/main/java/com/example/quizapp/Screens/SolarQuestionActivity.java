package com.example.quizapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizapp.Model.QuestionList;
import com.example.quizapp.R;

public class SolarQuestionActivity extends AppCompatActivity {
    TextView question_text,question_9br;
    Button btn_option2,btn_option1,btn_option3,btn_option4;

    int questionNUmber=0;
    int correctAnswer=0;
    Animation shake;
    TextView counter_text;
    private CountDownTimer countDownTimer;
    private boolean timerRunning;
    private long timeLeftInMillis = 10000; // 10 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solar_question);
        QuestionList.getInstance().addSolarSystemQuestion(this);
        question_text=findViewById(R.id.question_text);
        btn_option2=findViewById(R.id.btn_option2);
        btn_option1=findViewById(R.id.btn_option1);
        btn_option3=findViewById(R.id.btn_option3);
        btn_option4=findViewById(R.id.btn_option4);
        question_9br=findViewById(R.id.question_9br);
        shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        counter_text=findViewById(R.id.counter_text);
    }

    @Override
    protected void onStart() {

        questionNUmber=0;
        correctAnswer=0;
        updateQuestion();
        super.onStart();
    }

    public void btnOneClicked(View view){

        boolean option=QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(0).status;
        pauseTimer();
        btn_option1.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option1.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(SolarQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {

            btn_option1.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(SolarQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }

        setDelay();

    }
    public void btnTwoClicked(View view){
        pauseTimer();
        boolean option=QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(1).status;
        btn_option2.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option2.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(SolarQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {

            btn_option2.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(SolarQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }
        setDelay();

    }
    public void btnThreeClicked(View view){
        pauseTimer();
        boolean option=QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(2).status;
        btn_option3.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option3.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(SolarQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {

            btn_option3.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(SolarQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();


        }
        setDelay();

    }
    public void btnFourClicked(View view){
        pauseTimer();
        boolean option=QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(3).status;
        btn_option4.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option4.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(SolarQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();
        }
        else {

            btn_option4.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(SolarQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }
        setDelay();
    }
    public void setDelay(){
        questionNUmber++;
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(questionNUmber==5){
                    pauseTimer();
                    startActivity(new Intent(SolarQuestionActivity.this,
                            ScoreActivity.class)
                            .putExtra("score",correctAnswer));

                }else {
                    updateQuestion();
                }

            }
        }, 3000);
    }


    public void updateQuestion(){
        String q_text="Question";
        int question=questionNUmber;
        question=question+1;
        question_9br.setText(q_text+" "+question+"/5");
        btn_option1.setBackgroundColor(getResources().getColor(R.color.yellow));
        btn_option2.setBackgroundColor(getResources().getColor(R.color.yellow));
        btn_option3.setBackgroundColor(getResources().getColor(R.color.yellow));
        btn_option4.setBackgroundColor(getResources().getColor(R.color.yellow));
        question_text.setText(QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).question);
        btn_option1.setText(QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(0).option);
        btn_option2.setText(QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(1).option);
        btn_option3.setText(QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(2).option);
        btn_option4.setText(QuestionList.getInstance().solarSystemQuestionList.get(questionNUmber).optionArrayList.get(3).option);
        resetTimer();
        startTimer();
    }
    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();

            }

            @Override
            public void onFinish() {
                timerRunning = false;
            }
        }.start();

        timerRunning = true;
    }

    private void pauseTimer() {
        countDownTimer.cancel();
        timerRunning = false;
    }

    private void resetTimer() {
        timeLeftInMillis = 10000; // Reset to 10 seconds
        updateCountDownText();
    }

    private void updateCountDownText() {
        int seconds = (int) (timeLeftInMillis / 1000);
        String timeLeftFormatted = String.format("%02d", seconds);
        counter_text.setText(timeLeftFormatted);
        if(timeLeftFormatted.equals("01")){
            questionNUmber++;
            if(questionNUmber==5){
                pauseTimer();
                startActivity(new Intent(SolarQuestionActivity.this,
                        ScoreActivity.class)
                        .putExtra("score",correctAnswer));

            }else {
                updateQuestion();
            }
        }
    }
}