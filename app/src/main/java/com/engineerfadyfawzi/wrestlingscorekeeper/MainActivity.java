package com.engineerfadyfawzi.wrestlingscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the Wrestling score for 2 players (2 wrestlers).
 */
public class MainActivity extends AppCompatActivity
{
    // Tracks the score for the blue wrestler (Team A)
    int scoreBlueWrestler = 0;
    
    // Tracks the score for the red wrestler (Team A)
    int scoreRedWrestler = 0;
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    
    /**
     * From the neutral position, when one wrestler takes the other wrestler down to the mat
     * and controls them from the top, a takedown is scored.
     * (2 points)
     *
     * @param view represents the button when clicked.
     */
    public void takedown( View view )
    {
        addTwoForBlueWrestler();
    }
    
    /**
     * When a wrestler is on the bottom in the referee's position and reverses their opponent to
     * the top in the referee's position, a reversal is scored.
     * (2 Points)
     *
     * @param view represents the button when clicked.
     */
    public void reversal( View view )
    {
        addTwoForBlueWrestler();
    }
    
    /**
     * When a wrestler is on the bottom in the referee's position and escapes to the neutral
     * position without reversing the top wrestler, an escape is scored.
     * (1 Point)
     *
     * @param view represents the button when clicked.
     */
    public void escape( View view )
    {
        addOneForBlueWrestler();
    }
    
    /**
     * When the bottom wrestler has their back exposed to the mat on an angle of 45 degrees or less
     * for a count of at least two seconds, but less than five seconds, a near fall is scored.
     * (2 Points)
     *
     * @param view represents the button when clicked.
     */
    public void nearFall2Sec( View view )
    {
        addTwoForBlueWrestler();
    }
    
    /**
     * When the bottom wrestler has their back exposed to the mat on an angle of 45 degrees or less
     * for a count of five seconds or more a near fall is scored.
     * (3 Points)
     *
     * @param view represents the button when clicked.
     */
    public void nearFall5Sec( View view )
    {
        addThreeForBlueWrestler();
    }
    
    public void add1PointPenalty( View view )
    {
        addOneForBlueWrestler();
    }
    
    public void add2PointPenalty( View view )
    {
        addTwoForBlueWrestler();
    }
    
    /**
     * Increase the score for Blue Wrestler by 1 point.
     */
    public void addOneForBlueWrestler()
    {
        scoreBlueWrestler++;
        displayForBlueWrestler( scoreBlueWrestler );
    }
    
    /**
     * Increase the score for Blue Wrestler by 2 points.
     */
    public void addTwoForBlueWrestler()
    {
        scoreBlueWrestler += 2;
        displayForBlueWrestler( scoreBlueWrestler );
    }
    
    /**
     * Increase the score for Blue Wrestler by 3 points.
     */
    public void addThreeForBlueWrestler()
    {
        scoreBlueWrestler += 3;
        displayForBlueWrestler( scoreBlueWrestler );
    }
    
    
    /**
     * Increase the score for Red Wrestler by 1 point.
     *
     * @param view
     */
    public void addOneForRedWrestler( View view )
    {
        scoreRedWrestler++;
        displayForRedWrestler( scoreRedWrestler );
    }
    
    /**
     * Increase the score for Red Wrestler by 2 points.
     *
     * @param view
     */
    public void addTwoForRedWrestler( View view )
    {
        scoreRedWrestler += 2;
        displayForRedWrestler( scoreRedWrestler );
    }
    
    /**
     * Increase the score for Blue Wrestler by 3 points.
     *
     * @param view
     */
    public void addThreeForRedWrestler( View view )
    {
        scoreRedWrestler += 3;
        displayForRedWrestler( scoreRedWrestler );
    }
    
    /**
     * Resets the score for both wrestlers (players) back to 0.
     *
     * @param view
     */
    public void resetScore( View view )
    {
        scoreBlueWrestler = 0;
        scoreRedWrestler = 0;
        displayForBlueWrestler( scoreBlueWrestler );
        displayForRedWrestler( scoreRedWrestler );
    }
    
    /**
     * Displays the given score for Blue Wrestler (Player A).
     *
     * @param score
     */
    public void displayForBlueWrestler( int score )
    {
        TextView scoreView = findViewById( R.id.blue_wrestler_score );
        scoreView.setText( String.valueOf( score ) );
    }
    
    /**
     * Displays the given score for Red Wrestler (Player B).
     *
     * @param score
     */
    public void displayForRedWrestler( int score )
    {
        TextView scoreView = findViewById( R.id.red_wrestler_score );
        scoreView.setText( String.valueOf( score ) );
    }
}