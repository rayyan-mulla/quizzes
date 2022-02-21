package com.example.microproject;

public class PythonQuestion {

    private String Questions [] = {
            "Select the reserved keyword in python",
            "Which of the following symbols are used for comments in python",
            "Which keyword is used to define methods in python",
            "Which of the following is the correct way to declare string in python",
            "Which predefined method is used to find length of string",
            "Syntax of Constructor in Python?",
            "How to find the last element of list in Python? Assume 'bike' is the name of list",
            "What is the maximum possible length of an identifier",
            "Suppose list1 is [2, 32, 222, 14, 25], What is list1[-1]",
            "Which one of the following is not a python's predefined data type?"
    };

    private String choice[][] = {
            {"a) else","b) import","c) raise","d) All of the above"},
            {"a) //","b) /**/","c) ''","d) #"},
            {"a) function","b) def","c) method","d) All of the above"},
            {"a) fruit = 'banana'","b) fruit = banana","c) fruit = /banana/","d) fruit = (banana)"},
            {"a) length()","b) len()","c) strlen()","d) stringlength()"},
            {"a) def __init__()","b) def _init_()","c) _init_()","d) Both a and b"},
            {"a) bike[0]","b) bike[-1]","c) bike[!pos]","d) bike[:-1]"},
            {"a) 32 characters","b) 63 characters","c) 79 characters","d) None of the above"},
            {"a) Error","b) 25","c) 2","d) None of the above"},
            {"a) Class","b) List","c) Dictionary","d) Tuple"}
    };

    private String question_answer[] = {"d) All of the above","d) #","b) def","a) fruit = 'banana'","b) len()", "a) def __init__()","b) bike[-1]","d) None of the above","b) 25","a) Class"};

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
