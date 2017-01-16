package com.example.android.superbowl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Score for Raiders.
    int raidersScore = 0;
    //Score for Rams.
    int ramsScore = 0;
    //Score reset.
    int resetScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        //noinspection SimplifiableIfStatement.
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase Raiders score by 7 points.
     */
    public void sevenForRaiders(View v) {
        raidersScore = raidersScore + 7;
        displayForRaiders(raidersScore);
    }

    /**
     * Increase Raiders score by 1 point.
     */
    public void oneForRaiders(View v) {
        raidersScore = raidersScore + 1;
        displayForRaiders(raidersScore);
    }

    /**
     * Increase Raiders score by 3 points.
     */
    public void threeForRaiders(View v) {
        raidersScore = raidersScore + 3;
        displayForRaiders(raidersScore);
    }

    /**
     * Decrease Raiders score by 2 points.
     */
    public void twoForRaiders(View v) {
        raidersScore = raidersScore - 2;
        displayForRaiders(raidersScore);
    }

    /**
     * Increase Rams score by 7 points.
     */
    public void sevenForRams(View v) {
        ramsScore = ramsScore + 7;
        displayForRams(ramsScore);
    }

    /**
     * Increase Rams score by 1.
     */
    public void oneForRams(View v) {
        ramsScore = ramsScore + 1;
        displayForRams(ramsScore);
    }

    /**
     * Increase Rams score by 3 points.
     */
    public void threeForRams(View v) {
        ramsScore = ramsScore + 3;
        displayForRams(ramsScore);
    }

    /**
     * Decrease Rams score by 2 points.
     */
    public void twoForRams(View v) {
        ramsScore = ramsScore - 2;
        displayForRams(ramsScore);
    }

    /**
     * Displays score for Raiders.
     */
    public void displayForRaiders(int raidersScore) {
        TextView scoreView = (TextView) findViewById(R.id.raiders_score);
        scoreView.setText(String.valueOf(raidersScore));
    }

    /**
     * Displays score for Rams.
     */
    public void displayForRams(int ramsScore) {
        TextView scoreView = (TextView) findViewById(R.id.rams_score);
        scoreView.setText(String.valueOf(ramsScore));
    }

    /**
     * Reset button.
     */
    public void resetScore(View v) {
        displayForRaiders(resetScore);
        displayForRams(resetScore);
        raidersScore = 0;
        ramsScore = 0;
    }


}
