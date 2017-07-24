package me.rayanalkhelaiwi.soccerscorecounter;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamOneGoalScore = 0;
    int teamOnePenaltyScore = 0;
    int teamOneFoulScore = 0;

    int teamTwoGoalScore = 0;
    int teamTwoPenaltyScore = 0;
    int teamTwoFoulScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void teamOneGoalScore(View view) {
        teamOneGoalScore += 1;
        displayTeamOneGoalScore(teamOneGoalScore);
    }

    public void teamOnePenaltyScore(View view) {
        teamOnePenaltyScore += 1;
        displayTeamOnePenaltyScore(teamOnePenaltyScore);
    }

    public void teamOneFoulScore(View view) {
        teamOneFoulScore += 1;
        displayTeamOneFoulScore(teamOneFoulScore);
    }

    public void teamTwoGoalScore(View view) {
        teamTwoGoalScore += 1;
        displayTeamTwoGoalScore(teamTwoGoalScore);
    }

    public void teamTwoPenaltyScore(View view) {
        teamTwoPenaltyScore += 1;
        displayTeamTwoPenaltyScore(teamTwoPenaltyScore);
    }

    public void teamTwoFoulScore(View view) {
        teamTwoFoulScore += 1;
        displayTeamTwoFoulScore(teamTwoFoulScore);
    }

    public void resetScores(View view) {
        teamOneGoalScore = 0;
        teamOnePenaltyScore = 0;
        teamOneFoulScore = 0;

        teamTwoGoalScore = 0;
        teamTwoPenaltyScore = 0;
        teamTwoFoulScore = 0;

        displayTeamOneGoalScore(teamOneGoalScore);
        displayTeamOnePenaltyScore(teamOnePenaltyScore);
        displayTeamOneFoulScore(teamOneFoulScore);

        displayTeamTwoGoalScore(teamTwoGoalScore);
        displayTeamTwoPenaltyScore(teamTwoPenaltyScore);
        displayTeamTwoFoulScore(teamTwoFoulScore);
    }

    public void displayTeamOneGoalScore(int goalScore) {
        TextView textView = (TextView) findViewById(R.id.teamOneGoalScore);
        textView.setText(String.valueOf(goalScore));
    }

    public void displayTeamOnePenaltyScore(int penaltyScore) {
        TextView textView = (TextView) findViewById(R.id.teamOnePenaltyScore);
        textView.setText(String.valueOf(penaltyScore));
    }

    public void displayTeamOneFoulScore(int foulScore) {
        TextView textView = (TextView) findViewById(R.id.teamOneFoulScore);
        textView.setText(String.valueOf(foulScore));
    }

    public void displayTeamTwoGoalScore(int goalScore) {
        TextView textView = (TextView) findViewById(R.id.teamTwoGoalScore);
        textView.setText(String.valueOf(goalScore));
    }

    public void displayTeamTwoPenaltyScore(int penaltyScore) {
        TextView textView = (TextView) findViewById(R.id.teamTwoPenaltyScore);
        textView.setText(String.valueOf(penaltyScore));
    }

    public void displayTeamTwoFoulScore(int foulScore) {
        TextView textView = (TextView) findViewById(R.id.teamTwoFoulScore);
        textView.setText(String.valueOf(foulScore));
    }
}
