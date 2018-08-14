package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Player 1 by 15 point.
     */
    public void addFifteenForPlayer1(View v) {
        if (scorePlayer1 < 30) {
            scorePlayer1 += 15;
            displayForPlayer1(scorePlayer1);
        } else {
            displayForPlayer1(scorePlayer1);
            Toast.makeText(this, "Player 1 gained all the points they can.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Increase the score for Player 1 by 10 points.
     */
    public void addTenForPlayer1(View v) {
        if (scorePlayer1 == 30) {
            scorePlayer1 += 10;
            displayForPlayer1(scorePlayer1);
        } else {
            displayForPlayer1(scorePlayer1);
            Toast.makeText(this, "Player 1 must gain 2 point score first.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * set Player 1 winner
     */
    public void setWinnerPlayer1(View v) {
        if (scorePlayer1 == 40) {
            displayForPlayer1(scorePlayer1);
            Toast.makeText(this, "Congrats! Player 1 wins!", Toast.LENGTH_SHORT).show();

        } else
            displayForPlayer1(scorePlayer1);
        Toast.makeText(this, "Player 1 must gain match point first.",
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player 2 by 15 point.
     */
    public void addFifteenForPlayer2(View v) {
        if (scorePlayer2 < 30) {
            scorePlayer2 += 15;
            displayForPlayer2(scorePlayer2);
        } else {
            displayForPlayer2(scorePlayer2);
            Toast.makeText(this, "Player 2 gained all the points they can.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Increase the score for Player 2 by 10 points.
     */
    public void addTenForPlayer2(View v) {
        if (scorePlayer2 == 30) {
            scorePlayer2 += 10;
            displayForPlayer2(scorePlayer2);
        } else {
            displayForPlayer2(scorePlayer2);
            Toast.makeText(this, "Player 2 must gain 2 point score first.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Set Player 2 winner.
     */
    public void setWinnerPlayer2(View v) {
        if (scorePlayer2 == 40) {
            displayForPlayer2(scorePlayer2);
            Toast.makeText(this, "Congrats! Player 2 wins!", Toast.LENGTH_SHORT).show();

        } else
            displayForPlayer2(scorePlayer2);
        Toast.makeText(this, "Player 2 must gain match point first.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetButton(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }
}
