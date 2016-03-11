package com.example.user.mentalage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 3/4/2016.
 */
public class QuestionPage extends AppCompatActivity {
    Button yes1,no1,neither1;
    TextView questionNo1,question1;
    public static int score = 0;
    public int qn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page);
        yes1 = (Button) findViewById(R.id.yes);
        no1 = (Button) findViewById(R.id.no);
        neither1 = (Button) findViewById(R.id.neither);
        questionNo1 = (TextView) findViewById(R.id.questionNo);
        question1 = (TextView) findViewById(R.id.question);
        questionNo1.setText("Question " + qn + " out of 30");
        question1.setText("I have a very high tolerance level.");
        yes1.setText("True");
        no1.setText("False");
        neither1.setText("Neither");
        yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button on press method
                qn++;
                if (qn == 1) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I have a very high tolerance level.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                } else if (qn == 2) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I have a dream.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 3) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to stay at home rather playing outdoor games or roaming.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 4) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to be friends with those older than me.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score -= 0;
                } else if (qn == 5) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to get up early in the morning.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score -= 0;
                } else if (qn == 6) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I care about my clothes and hair style.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 7) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I get angry at the children if they make a noise.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 8) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to play with little children very much.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 9) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I always act before thinking.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                } else if (qn == 10) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't know what popular among young people.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 11) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I get depressed at my hard times.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                } else if (qn == 12) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sometimes waste money,foods etc..");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                } else if (qn == 13) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to live alone.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                } else if (qn == 14) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I want to grow old.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                }
                else if(qn == 15){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't enjoy reading books.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 16){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sing songs lonely when I become depressed.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 17){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I'd rather live in the countryside rather than a huge metropolis.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                }
                else if(qn == 18){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sometimes behave like a fool.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                }
                else if(qn == 19){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I am very emotional.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 20){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't prefer to talk with those persons whom I don't like.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 21){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to watch cartoons,animations etc..");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 22){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to pass my weekends with friends.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 23){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sometimes become upset with no matter.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 24){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to make a tour.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 25){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to lead a punctual life.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 26){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't like to think about critical things.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                }
                else if(qn == 27){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I think about my parents.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 28){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I do a task without thinking anything.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 2;
                }
                else if(qn == 29){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to quarrel.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 30){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to disturb others and become entertained.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 0;
                }
                else if(qn == 31){
                    score += 0;
                    Intent intent = new Intent(QuestionPage.this, Results.class);
                    startActivity(intent);
                }
            }

        });
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button on press method
                qn++;
                    if (qn == 1) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I have a very high tolerance level.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                    }
                    else if(qn == 2){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I have a dream.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if(qn == 3){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to stay at home rather playing outdoor games or roaming.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if (qn == 4) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to be friends with those older than me.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    } else if (qn == 5) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to get up early in the morning.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    } else if (qn == 6) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I care about my clothes and hair style.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    } else if (qn == 7) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I get angry at the children if they make a noise.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    } else if (qn == 8) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to play with little children very much.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    } else if (qn == 9) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I always act before thinking.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    } else if (qn == 10) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I don't know what popular among young people.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    } else if (qn == 11) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I get depressed at my hard times.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    } else if (qn == 12) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I sometimes waste money,foods etc..");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    } else if (qn == 13) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to live alone.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    } else if (qn == 14) {
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I want to grow old.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if(qn == 15){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I don't enjoy reading books.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 16){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I sing songs lonely when I become depressed.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 17){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I'd rather live in the countryside rather than a huge metropolis.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if(qn == 18){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I sometimes behave like a fool.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if(qn == 19){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I am very emotional.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 20){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I don't prefer to talk with those persons whom I don't like.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 21){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to watch cartoons,animations etc..");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 22){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to pass my weekends with friends.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 23){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I sometimes become upset with no matter.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 24){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to make a tour.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 25){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to lead a punctual life.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 26){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I don't like to think about critical things.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if(qn == 27){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I think about my parents.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 28){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I do a task without thinking anything.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 0;
                    }
                    else if(qn == 29){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to quarrel.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 30){
                        questionNo1.setText("Question " + qn + " out of 30");
                        question1.setText("I like to disturb others and become entertained.");
                        yes1.setText("True");
                        no1.setText("False");
                        neither1.setText("Neither");
                        score += 2;
                    }
                    else if(qn == 31){
                        score += 2;
                        Intent intent = new Intent(QuestionPage.this, Results.class);
                        startActivity(intent);
                    }
                }

        });
        neither1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button on press method
                qn++;
                if (qn == 1) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I have a very high tolerance level.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                } else if (qn == 2) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I have a dream.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 3) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to stay at home rather playing outdoor games or roaming.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if (qn == 4) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to be friends with those older than me.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 5) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to get up early in the morning.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 6) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I care about my clothes and hair style.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 7) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I get angry at the children if they make a noise.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 8) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to play with little children very much.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 9) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I always act before thinking.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 10) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't know what popular among young people.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 11) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I get depressed at my hard times.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 12) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sometimes waste money,foods etc..");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 13) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to live alone.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                } else if (qn == 14) {
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I want to grow old.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 15){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't enjoy reading books.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 16){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sing songs lonely when I become depressed.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 17){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I'd rather live in the countryside rather than a huge metropolis.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 18){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sometimes behave like a fool.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 19){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I am very emotional.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 20){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't prefer to talk with those persons whom I don't like.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 21){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to watch cartoons,animations etc..");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 22){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to pass my weekends with friends.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 23){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I sometimes become upset with no matter.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 24){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to make a tour.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 25){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to lead a punctual life.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 26){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I don't like to think about critical things.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 27){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I think about my parents.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 28){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I do a task without thinking anything.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 29){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to quarrel.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 30){
                    questionNo1.setText("Question " + qn + " out of 30");
                    question1.setText("I like to disturb others and become entertained.");
                    yes1.setText("True");
                    no1.setText("False");
                    neither1.setText("Neither");
                    score += 1;
                }
                else if(qn == 31){
                    score += 1;
                    Intent intent = new Intent(QuestionPage.this, Results.class);
                    startActivity(intent);
                }
            }
        });

    }

    public void onBackPressed() {
        AgeSelect.ageInt = 0;
        score = 0;
        Intent intent=new Intent(QuestionPage.this,HomePage.class);
        startActivity(intent);
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}

