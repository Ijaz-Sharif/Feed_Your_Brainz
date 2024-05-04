package com.example.quizapp.Model;

import java.util.ArrayList;

public class Question {

  public   String question;
  public   ArrayList<Option> optionArrayList;



    public Question(String question, ArrayList<Option> optionArrayList) {
        this.question = question;
        this.optionArrayList = optionArrayList;
    }

}
