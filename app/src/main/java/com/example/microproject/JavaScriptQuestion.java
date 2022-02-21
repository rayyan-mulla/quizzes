package com.example.microproject;

public class JavaScriptQuestion {

    private String Questions [] = {
            "JavaScript is a ________ language",
            "JavaScript is ________ side Scripting language",
            "JavaScript is designed for _________",
            "JavaScript can be written",
            "JavaScript is an ________ language",
            "JavaScript is invented by ________",
            "JavaScript was invented at ________ Lab",
            "JavaScript was originally developed under the name ________",
            "Microsoft developed a compatible dialect of JavaScript called ________",
            "JavaScript statement are executed by ________"
    };

    private String choice[][] = {
            {"a) Application","b) Scripting","c) Programming","d) None of the above"},
            {"a) Server","b) Browser","c) ISP","d) None of the above"},
            {"a) To perform server side operation","b) To Execute query","c) To add interactivity to HTML pages","d) All of the above"},
            {"a) In HTML file directly  ","b) In JS file and include in HTML","c) Both a and b","d) None of the above"},
            {"a) Compiled","b) Interpreted","c) None of the above","d) Both a and b"},
            {"a) Brendan Eich","b) James Gosling","c) W3 Group","d) Both a and b"},
            {"a) Netscape","b) Bell","c) Google","d) None of the Above"},
            {"a) Mocha","b) ActionScript","c) Oak","d) None of the above"},
            {"a) JScript","b) Advance JavaScript","c) MS Script","d) None of the above"},
            {"a) JVM","b) Browser","c) Server","d) Compiler"}
    };

    private String question_answer[] = {"b) Scripting","b) Browser","c) To add interactivity to HTML pages","c) Both a and b","b) Interpreted", "a) Brendan Eich","a) Netscape","a) Mocha","a) JScript","b) Browser"};

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
