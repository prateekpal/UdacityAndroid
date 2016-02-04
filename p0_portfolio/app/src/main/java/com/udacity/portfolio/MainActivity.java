package com.udacity.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }

    public void bibOnClickListener(View view) {
        Context context = getApplicationContext();
        CharSequence bibText = "This button will launch Build It Bigger App";
        int duration = Toast.LENGTH_SHORT;

        Toast bibToast = Toast.makeText(context,bibText,duration);
        bibToast.show();
    }

    public void ssOnClickListener(View view) {
        Context context = getApplicationContext();
        CharSequence Text = "This button will launch Spotify Streamer App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, Text, duration).show();
    }

    public void saOnClickListener(View view) {
        Context context = getApplicationContext();
        CharSequence Text = "This button will launch Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, Text, duration).show();
    }

    public void laOnClickListener(View view) {
        Context context = getApplicationContext();
        CharSequence Text = "This button will launch Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, Text, duration).show();
    }

    public void xyzOnClickListener(View view) {
        Context context = getApplicationContext();
        CharSequence Text = "This button will launch XYZ Reader App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, Text, duration).show();
    }

    public void CapstoneOnClickListener(View view) {
        Context context = getApplicationContext();
        CharSequence Text = "This button will launch Capstone App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, Text, duration).show();
    }
}
