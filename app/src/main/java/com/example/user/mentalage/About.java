package com.example.user.mentalage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 3/5/2016.
 */
public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

    public void onBackPressed() {
        AgeSelect.ageInt = 0;
        QuestionPage.score = 0;
        Intent intent=new Intent(About.this,HomePage.class);
        startActivity(intent);
    }
}
