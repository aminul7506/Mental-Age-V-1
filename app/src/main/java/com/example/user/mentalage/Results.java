package com.example.user.mentalage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 3/5/2016.
 */
public class Results extends AppCompatActivity {
    Button share1;
    TextView answer1,older1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        share1=(Button) findViewById(R.id.share);
        answer1 = (TextView) findViewById(R.id.answer);
        older1 = (TextView) findViewById(R.id.older);
        //QuestionPage qp = new QuestionPage();
        //AgeSelect as = new AgeSelect();
        int sc = QuestionPage.score;
        int age = AgeSelect.ageInt;
        String sc1 = String.valueOf(sc);
        if(sc >= 10)answer1.setText(sc1);
        else answer1.setText(String.valueOf(10));
        if(sc == age)older1.setText("(You are totally matched with your age!!)");
        else if(sc <= 10) older1.setText("( " + String.valueOf(age-10) + " years younger!!)");
        else if(sc > age)older1.setText("( " + String.valueOf(sc-age) + " years older!!)");
        else if(sc < age)older1.setText("( " + String.valueOf(age-sc) + " years younger!!)");
        share1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //button on press method
                /*Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello,I'm Sojal!!!");
                startActivity(Intent.createChooser(shareIntent, "Share your thoughts"));*/
                AgeSelect.ageInt = 0;
                QuestionPage.score = 0;
                Intent intent=new Intent(Results.this,HomePage.class);
                startActivity(intent);

            }
        });
    }

    public void onBackPressed() {
        AgeSelect.ageInt = 0;
        QuestionPage.score = 0;
        Intent intent=new Intent(Results.this,HomePage.class);
        startActivity(intent);
    }
}

