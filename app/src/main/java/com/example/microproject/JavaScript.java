package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class JavaScript extends AppCompatActivity {
    private static final long COUNTDOWN_IN_MILLIS = 30000;

    private JavaScriptQuestion androidQuestion  = new JavaScriptQuestion();

    private TextView score, time, question_no, question;
    private RadioButton option1, option2, option3, option4;
    private RadioGroup radio_group;
    private Button confirm,next;

    private boolean answered;

    private String answer;
    private int total_score = 0;
    private int total_question_no = 1;

    private ColorStateList textColorDefaultRb;
    private ColorStateList textColorDefaultTimer;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    private int questionCountTotal = androidQuestion.lengthOfQuestions()-1;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javascript_questions);

        score = (TextView) findViewById(R.id.score);
        time = (TextView) findViewById(R.id.time);
        question_no = (TextView) findViewById(R.id.question_no);
        question = (TextView) findViewById(R.id.question);

        option1 = (RadioButton) findViewById(R.id.option1);
        option2 = (RadioButton) findViewById(R.id.option2);
        option3 = (RadioButton) findViewById(R.id.option3);
        option4 = (RadioButton) findViewById(R.id.option4);

        confirm = (Button) findViewById(R.id.confirm);
        next = (Button) findViewById(R.id.next);
        radio_group = (RadioGroup) findViewById(R.id.radio_group);

        textColorDefaultRb = option1.getTextColors();
        textColorDefaultTimer = time.getTextColors();

        updateQuestion();
        next.setEnabled(false);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option1.isChecked() || option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    checkAnswer();
                    option1.setEnabled(false);
                    option2.setEnabled(false);
                    option3.setEnabled(false);
                    option4.setEnabled(false);
                    next.setEnabled(true);

                }
                else
                    Toast.makeText(JavaScript.this, "You have not Selected any Choice \n Please!! Select your Answer", Toast.LENGTH_SHORT).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });
    }

    private void updateQuestion(){
        next.setEnabled(false);

        option1.setEnabled(true);
        option2.setEnabled(true);
        option3.setEnabled(true);
        option4.setEnabled(true);

        option1.setTextColor(textColorDefaultRb);
        option2.setTextColor(textColorDefaultRb);
        option3.setTextColor(textColorDefaultRb);
        option4.setTextColor(textColorDefaultRb);

        question.setText("Q."+total_question_no + ") " +androidQuestion.getQuestion(total_question_no-1));
        option1.setText(androidQuestion.getChoice1(total_question_no-1));
        option2.setText(androidQuestion.getChoice2(total_question_no-1));
        option3.setText(androidQuestion.getChoice3(total_question_no-1));
        option4.setText(androidQuestion.getChoice4(total_question_no-1));

        question_no.setText(total_question_no + "/" + questionCountTotal);

        answer = androidQuestion.getAnswer(total_question_no-1);
        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();

        total_question_no++;
        radio_group.clearCheck();

        checkLastQuestion();
    }

    private void checkLastQuestion(){
        if(total_question_no == androidQuestion.lengthOfQuestions()) {
            next.setText("Finish");
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(JavaScript.this, "That was the Last Question!!", Toast.LENGTH_SHORT).show();
                    goBackToLanguage();
                }
            });
            if(timeLeftInMillis == 0000) {
                Toast.makeText(this, "That was the Last Question!!", Toast.LENGTH_SHORT).show();
                goBackToLanguage();
            }
        }
    }

    private void updateScore(int point){
        total_score = total_score + point;
        score.setText("Score: "+total_score);
    }

    private void checkAnswer(){
        countDownTimer.cancel();
        String ans;
        if(option1.isChecked()) {
            ans = option1.getText().toString();
            if (ans == answer) {
                option1.setTextColor(Color.GREEN);
                updateScore(10);
            } else {
                option1.setTextColor(Color.RED);
            }
        }
        else if(option2.isChecked())
        {
            ans = option2.getText().toString();
            if(ans==answer){
                option2.setTextColor(Color.GREEN);
                updateScore(10);
            }
            else {
                option2.setTextColor(Color.RED);
            }
        }
        else if(option3.isChecked())
        {
            ans = option3.getText().toString();
            if(ans==answer){
                option3.setTextColor(Color.GREEN);
                updateScore(10);
            }
            else{
                option3.setTextColor(Color.RED);
            }
        }
        else if(option4.isChecked())
        {
            ans = option4.getText().toString();
            if(ans==answer) {
                option4.setTextColor(Color.GREEN);
                updateScore(10);
            }
            else {
                option4.setTextColor(Color.RED);
            }
        }
    }

    private void startCountDown(){
        countDownTimer = new CountDownTimer(timeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();
                checkAnswer();
            }
        }.start();
    }

    private void updateCountDownText(){
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);

        time.setText(timeFormatted);

        if(timeLeftInMillis < 10000){
            time.setTextColor(Color.RED);
        }
        else{
            time.setTextColor(textColorDefaultTimer);
        }

        if(timeLeftInMillis == 0000) {
            updateQuestion();
            startCountDown();
        }
    }

    private void finishQuiz(){
        finish();
    }

    public void goBackToLanguage() {
        Intent i = new Intent(this,Languages.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Toast.makeText(this, "Press Back again to go back", Toast.LENGTH_SHORT).show();
            finishQuiz();
        }
        backPressedTime = System.currentTimeMillis();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(countDownTimer != null){
            countDownTimer.cancel();
        }
    }
}