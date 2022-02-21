package com.example.microproject;

public class AndroidQuestion {

    private String Questions [] = {
            "Android is Developed By",
            "Android Web Browser is Based on",
            "Android is based on which Kernel",
            "What is JNI in Android",
            "ADB Stands for",
            "Which Programming Language is used for Android Application Development",
            "What are the layouts available in Android",
            "What is the use of Content Provider in Android",
            "How many orientations does android support",
            "What is an interface in Android?"
    };

    private String choice[][] = {
            {"a) Apple","b) Microsoft","c) Google","d) Android Inc"},
            {"a) Chrome","b) Open-source Webkit","c) Safari","d) Firefox"},
            {"a) Linux","b) Mac","c) Windows","d) Redhat"},
            {"a) Java Interface","b) Java Native Interface","c) Java Network Interface","d) Java NetBeans Interface"},
            {"a) Android Debug Bridge","b) Android Driver Bridge","c) Android Delete Bridge","d) Android Destroy Bridge"},
            {"a) Java","b) Kotlin","c) Python","d) Both a and b"},
            {"a) FrameLayout","b) AbsoluteLayout","c) RelativeLayout","d) All of the Above"},
            {"a) To send the data from one application to another","b) To store the data in database","c) To share the data between applications","d) None of the above"},
            {"a) 4","b) 2","c) 10","d) None of the above"},
            {"a) Interface act as a bridge between class and outside world","b) Interface is a class","c) Interface is a layout file","d) None of the above"}
    };

    private String question_answer[] = {"d) Android Inc","b) Open-source Webkit","a) Linux","b) Java Native Interface","a) Android Debug Bridge", "d) Both a and b","d) All of the Above","c) To share the data between applications","a) 4","a) Interface act as a bridge between class and outside world"};

    private int length = Questions.length + 1;

    public int lengthOfQuestions(){
        return length;
    }

    public String getQuestion(int a){
        String question = Questions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = choice[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = choice[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = choice[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = choice[a][3];
        return choice3;
    }

    public String getAnswer(int a){
        String answer = question_answer[a];
        return answer;
    }

}
