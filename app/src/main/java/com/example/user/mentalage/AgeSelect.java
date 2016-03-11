package com.example.user.mentalage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by User on 3/4/2016.
 */
public class AgeSelect extends AppCompatActivity {
    Button start1,back1;
    EditText age1;
    TextView warning1;
    public static int ageInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_age);
        start1=(Button) findViewById(R.id.start);
        age1=(EditText) findViewById(R.id.age);
        warning1=(TextView) findViewById(R.id.warning);
        back1 = (Button) findViewById(R.id.back);
        age1.setText("");
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button on press method
                try {
                    warning1.setText("");
                    if (!age1.getText().toString().equals(""))
                        ageInt = Integer.parseInt(age1.getText().toString());
                    if (age1.getText().toString().equals(""))
                        warning1.setText("Please enter your age!");
                    else if (ageInt < 10) warning1.setText("You are not eligable for the test!!");
                    else if (ageInt > 80) warning1.setText("You are too old for the test!!");
                    else if (ageInt >= 10 && ageInt <= 80) {
                        Intent intent = new Intent(AgeSelect.this, QuestionPage.class);
                        startActivity(intent);
                    }
                }
                catch (Exception e){
                    warning1.setText("Please enter an integer not a floating point number!");
                }
            }
        });
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button on press method
                Intent intent = new Intent(AgeSelect.this, HomePage.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        //moveTaskToBack(true);
        AgeSelect.ageInt = 0;
        QuestionPage.score = 0;
        Intent intent=new Intent(AgeSelect.this,HomePage.class);
        startActivity(intent);
    }

    /*@Override
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

