package com.example.microproject;

public class CPlusQuestion {

    private String Questions [] = {
            "A user defined header file is included by following statement in general?",
            "Choose the Object Oriented Language",
            "Choose the Option not applicable for Constructor",
            "An Exception is _____",
            "Identify the C++ compiler for Linux",
            "C++ is regarded as ______ level language",
            "C++ was developed by _____",
            "Which of the following is used to display the Output in C++",
            "Which of the following is used to take the Input in C++",
            "Which header file is important to include in C++ Program"
    };

    private String choice[][] = {
            {"a) #include 'file.h'","b) #include <file.h>","c) #include <file>","d) #include <file.h>"},
            {"a) C++","b) Java","c) Python","d) All of the above"},
            {"a) Cannot be called explicitly","b) Cannot be overloaded","c) Cannot be overridden","d) None of the above"},
            {"a) Runtime Error","b) Compile time Error","c) Logical Error","d) None of the above"},
            {"a) cpp","b) g++","c) Borland","d) -vc++"},
            {"a) high","b) low","c) middle","d) Both a and b"},
            {"a) Denis Ritchie","b) Bjarne Stroustrup","c) Guido Van Rossum","d) None of the Above"},
            {"a) cout","b) cin","c) print","d) printf"},
            {"a) cout","b) cin","c) input","d) scanf"},
            {"a) #include <iostream.h>","b) #include <stdio.h>","c) Both a and b","d) None of the above"}
    };

    private String question_answer[] = {"a) #include 'file.h'","d) All of the above","c) Cannot be overridden","a) Runtime Error","b) g++", "c) middle","b) Bjarne Stroustrup","a) cout","b) cin","a) #include <iostream.h>"};

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
