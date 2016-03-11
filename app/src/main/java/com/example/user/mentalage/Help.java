package com.example.user.mentalage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 3/5/2016.
 */
public class Help extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }

    public void onBackPressed() {
        AgeSelect.ageInt = 0;
        QuestionPage.score = 0;
        Intent intent=new Intent(Help.this,HomePage.class);
        startActivity(intent);
    }
}
