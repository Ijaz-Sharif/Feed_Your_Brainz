package com.example.quizapp.Model;



import android.content.Context;


import java.util.ArrayList;

public class QuestionList {
    private static final QuestionList instance = new QuestionList();
    public static QuestionList getInstance() {
        return instance;
    }
   public ArrayList<Question> PartOfBodyQuestionList=new ArrayList<Question>();

    public ArrayList<Question> solarSystemQuestionList=new ArrayList<Question>();

    public ArrayList<Question> physicsQuestionList=new ArrayList<Question>();

    public ArrayList<Question> spellingQuestionList=new ArrayList<Question>();
    public ArrayList<Question> grammerQuestionList=new ArrayList<Question>();
    public ArrayList<Question> literatureQuestionList=new ArrayList<Question>();

    public void addPartOfBodyQuestion(Context context){
        PartOfBodyQuestionList.clear();
            ArrayList<Option> optionArrayList=new ArrayList<>();
            optionArrayList.add(new Option("Digestion",false));
            optionArrayList.add(new Option("Pumping blood",true));
            optionArrayList.add(new Option("Producing hormones",false));
            optionArrayList.add(new Option("Filtering waste",false));

            ArrayList<Option> optionArrayList1=new ArrayList<>();
            optionArrayList1.add(new Option("Liver",false));
            optionArrayList1.add(new Option("Lungs",false));
        optionArrayList1.add(new Option("Kidneys",true));
            optionArrayList1.add(new Option("Stomach",false));

            ArrayList<Option> optionArrayList2=new ArrayList<>();
            optionArrayList2.add(new Option("Pumping blood",false));
            optionArrayList2.add(new Option("Producing insulin",false));
            optionArrayList2.add(new Option("Breathing and gas exchange",true));
            optionArrayList2.add(new Option("Digesting food",false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("Heart",false));
        optionArrayList3.add(new Option("Brain",true));
        optionArrayList3.add(new Option("Stomach",false));
        optionArrayList3.add(new Option("Liver",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("Movement",true));
        optionArrayList4.add(new Option("Digestion",false));
        optionArrayList4.add(new Option("Pumping blood",false));
        optionArrayList4.add(new Option("Producing hormones",false));


        PartOfBodyQuestionList.add(new Question("What is the main function of the heart?",optionArrayList));

        PartOfBodyQuestionList.add(new Question("Which organ is responsible for filtering waste from the blood?",optionArrayList1));

        PartOfBodyQuestionList.add(new Question("What is the primary function of the lungs?",optionArrayList2));

        PartOfBodyQuestionList.add(new Question("Which organ is part of the central nervous system?",optionArrayList3));

        PartOfBodyQuestionList.add(new Question("What is the purpose of the skeletal system?",optionArrayList4));





    }
    public void addSolarSystemQuestion(Context context){
        solarSystemQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("Venus",false));
        optionArrayList.add(new Option("Earth",false));
        optionArrayList.add(new Option("Mars",false));
        optionArrayList.add(new Option("Jupiter",true));

        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("Jupiter",false));
        optionArrayList1.add(new Option("Saturn",false));
        optionArrayList1.add(new Option("Mars",true));
        optionArrayList1.add(new Option("Neptune",false));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("Venus",false));
        optionArrayList2.add(new Option("Earth",false));
        optionArrayList2.add(new Option("Mars",false));
        optionArrayList2.add(new Option("Mercury",true));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("Titan",false));
        optionArrayList3.add(new Option("Ganymede",true));
        optionArrayList3.add(new Option("Europa",false));
        optionArrayList3.add(new Option("Callisto",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("Jupiter",true));
        optionArrayList4.add(new Option("Saturn",false));
        optionArrayList4.add(new Option("Uranus",false));
        optionArrayList4.add(new Option("Neptune",false));


        solarSystemQuestionList.add(new Question("What is the largest planet in the solar system by mass?",optionArrayList));

        solarSystemQuestionList.add(new Question("Which planet is known as the Red Planet?",optionArrayList1));

        solarSystemQuestionList.add(new Question("Which planet is closest to the Sun?",optionArrayList2));

        solarSystemQuestionList.add(new Question("What is the largest moon in the solar system, orbiting Jupiter?",optionArrayList3));

        solarSystemQuestionList.add(new Question("Which planet has the most known moons in the solar system?",optionArrayList4));





    }


    public void addPhysicsQuestion(Context context){
        physicsQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("True",true));
        optionArrayList.add(new Option("False",false));
        optionArrayList.add(new Option("",false));
        optionArrayList.add(new Option("",false));

        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("True",true));
        optionArrayList1.add(new Option("False",false));
        optionArrayList1.add(new Option("",false));
        optionArrayList1.add(new Option("",false));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("True",true));
        optionArrayList2.add(new Option("False",false));
        optionArrayList2.add(new Option("",false));
        optionArrayList2.add(new Option("" ,false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("True",true));
        optionArrayList3.add(new Option("False",false));
        optionArrayList3.add(new Option("",false));
        optionArrayList3.add(new Option("",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("True",true));
        optionArrayList4.add(new Option("False",false));
        optionArrayList4.add(new Option("",false));
        optionArrayList4.add(new Option("",false));


        physicsQuestionList.add(new Question("Acceleration is the rate of change of velocity?",optionArrayList));

        physicsQuestionList.add(new Question("Newton's first law of motion states that an object in motion will remain in motion unless acted upon by an external force?",optionArrayList1));

        physicsQuestionList.add(new Question(" Work is done when a force causes an object to move in the direction of the force?",optionArrayList2));

        physicsQuestionList.add(new Question("The law of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another?",optionArrayList3));

        physicsQuestionList.add(new Question("Sound waves cannot travel through a vacuum?",optionArrayList4));





    }
    public void addSpellingQuestion(Context context){
        spellingQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("Neccessary",false));
        optionArrayList.add(new Option("Necesary",false));
        optionArrayList.add(new Option("Necessary",true));
        optionArrayList.add(new Option("Necesssary",false));

        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("Accommadation",false));
        optionArrayList1.add(new Option("Accomodation",false));
        optionArrayList1.add(new Option("Acommodation",false));
        optionArrayList1.add(new Option("Accommodation",true));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("Recieve",false));
        optionArrayList2.add(new Option("Receive",true));
        optionArrayList2.add(new Option("Recive",false));
        optionArrayList2.add(new Option("Recievee" ,false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("Embarrassment",true));
        optionArrayList3.add(new Option("Embarassment",false));
        optionArrayList3.add(new Option("Embarasment",false));
        optionArrayList3.add(new Option("Embarassmentt",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("Concientious",false));
        optionArrayList4.add(new Option("Consciencious",false));
        optionArrayList4.add(new Option("Conscientious",true));
        optionArrayList4.add(new Option("Conscietious",false));


        spellingQuestionList.add(new Question("Which word is spelled correctly?",optionArrayList));

        spellingQuestionList.add(new Question("Which word is spelled correctly?",optionArrayList1));

        spellingQuestionList.add(new Question("Which word is spelled correctly?",optionArrayList2));

        spellingQuestionList.add(new Question("Which word is spelled correctly?",optionArrayList3));

        spellingQuestionList.add(new Question("Which word is spelled correctly?",optionArrayList4));





    }public void addGrammerQuestion(Context context){
        grammerQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("he goed to the store yesterday.",false));
        optionArrayList.add(new Option("he went to the store yesterday.",true));
        optionArrayList.add(new Option("he goeded to the store yesterday.",false));
        optionArrayList.add(new Option("he goed to store yesterday.",false));

        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("the dogs barks loudly",false));
        optionArrayList1.add(new Option("the dog bark loudly",false));
        optionArrayList1.add(new Option("the dogs bark loudly",true));
        optionArrayList1.add(new Option("the dog barks loudly",false));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("my favorite colors are blue green and red.",false));
        optionArrayList2.add(new Option("my favorite colors are blue, green, and red.",true));
        optionArrayList2.add(new Option("my favorite colors are blue green, and red.",false));
        optionArrayList2.add(new Option("my favorite colors are blue green and, red." ,false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("me and my friend went to the movies.",false));
        optionArrayList3.add(new Option("my friend and me went to the movies.",false));
        optionArrayList3.add(new Option("my friend and i went to the movies.",true));
        optionArrayList3.add(new Option("me and my friend went to movies.",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("she don't like apples.",false));
        optionArrayList4.add(new Option("she doesn't likes apples.",false));
        optionArrayList4.add(new Option("she don't likes apples.",false));
        optionArrayList4.add(new Option("she doesn't like apples.",true));


        grammerQuestionList.add(new Question("which sentence is grammatically correct?",optionArrayList));

        grammerQuestionList.add(new Question("which sentence uses correct subject-verb agreement?",optionArrayList1));

        grammerQuestionList.add(new Question("which sentence has correct punctuation?",optionArrayList2));

        grammerQuestionList.add(new Question("which sentence uses correct pronoun usage?",optionArrayList3));

        grammerQuestionList.add(new Question("which sentence is grammatically correct?",optionArrayList4));





    }public void addLiteratureQuestion(Context context){
        literatureQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("Mark Twain",false));
        optionArrayList.add(new Option("Harper Lee",true));
        optionArrayList.add(new Option("J.D. Salinger",false));
        optionArrayList.add(new Option("F. Scott Fitzgerald",false));

        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("Macbeth",false));
        optionArrayList1.add(new Option("Romeo and Juliet",false));
        optionArrayList1.add(new Option("Othello",false));
        optionArrayList1.add(new Option("Hamlet",true));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("Charlotte Brontë",false));
        optionArrayList2.add(new Option("Jane Austen",true));
        optionArrayList2.add(new Option("Emily Dickinson",false));
        optionArrayList2.add(new Option("Virginia Woolf" ,false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("Paradise Lost",false));
        optionArrayList3.add(new Option("Wuthering Heights",false));
        optionArrayList3.add(new Option("The Canterbury Tales",false));
        optionArrayList3.add(new Option("I Wandered Lonely as a Cloud",true));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("Homer",true));
        optionArrayList4.add(new Option("Virgil",false));
        optionArrayList4.add(new Option("Dante Alighieri",false));
        optionArrayList4.add(new Option("Geoffrey Chaucer",false));


        literatureQuestionList.add(new Question("Who is the author of To Kill a Mockingbird?",optionArrayList));

        literatureQuestionList.add(new Question("In which Shakespearean play does the character Hamlet appear?",optionArrayList1));

        literatureQuestionList.add(new Question("Who wrote the novel Pride and Prejudice?",optionArrayList2));

        literatureQuestionList.add(new Question("Which of the following is a work by William Wordsworth?",optionArrayList3));

        literatureQuestionList.add(new Question("Who wrote the epic poem The Odyssey?",optionArrayList4));





    }
}
