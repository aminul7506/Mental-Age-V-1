package com.example.user.mentalage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class HomePage extends AppCompatActivity {
    Button startTest1,help1,about1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        startTest1=(Button) findViewById(R.id.startTest);
        help1=(Button) findViewById(R.id.help);
        about1=(Button) findViewById(R.id.about);
        startTest1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //button on press method
                Intent intent=new Intent(HomePage.this,AgeSelect.class);
                startActivity(intent);
            }
        });
        help1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //button on press method
                Intent intent=new Intent(HomePage.this,Help.class);
                startActivity(intent);
            }
        });
        about1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //button on press method
                Intent intent = new Intent(HomePage.this, About.class);
                startActivity(intent);
            }
        });



    }

    public void onBackPressed() {
        AgeSelect.ageInt = 0;
        QuestionPage.score = 0;
        moveTaskToBack(true);
        /*Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, from tutorialspoint");
        startActivity(Intent.createChooser(shareIntent, "Share your thoughts"));*/
       /* Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        Uri screenshotUri = Uri.parse("android.resource://com.example.user.mentalage/*");

        try {
            InputStream stream = getContentResolver().openInputStream(screenshotUri);
        }

        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        sharingIntent.setType("mental age/jpg");
        sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
        startActivity(Intent.createChooser(sharingIntent, "Share image using"));*/
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
