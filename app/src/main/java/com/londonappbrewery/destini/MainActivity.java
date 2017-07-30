package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static com.londonappbrewery.destini.R.id.buttonTop;
import static com.londonappbrewery.destini.R.string.T1_Ans1;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStory;
    Button buttonTop;
    Button buttonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        mStory = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button b = (Button)v;
                String buttonText = b.getText().toString();
                updateStory(buttonText);

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button b = (Button)v;
                String buttonText = b.getText().toString();
                updateStory(buttonText);

            }
        });



    }

    public void updateStory(String buttonText) {


        String T1A1 = getResources().getString(R.string.T1_Ans1);
        String T1A2 = getResources().getString(R.string.T1_Ans2);

        String ST2A = getResources().getString(R.string.T2_Story);
        String T2A1 = getResources().getString(R.string.T2_Ans1);
        String T2A2 = getResources().getString(R.string.T2_Ans2);

        String ST3A = getResources().getString(R.string.T3_Story);
        String T3A1 = getResources().getString(R.string.T3_Ans1);
        String T3A2 = getResources().getString(R.string.T3_Ans2);

        String E4 = getResources().getString(R.string.T4_End);
        String E5 = getResources().getString(R.string.T5_End);
        String E6 = getResources().getString(R.string.T6_End);

        if (buttonText == "THE END") {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("End of the line");
            alert.setCancelable(false);
            alert.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.show();

        }

        else if (buttonText == T1A1) {
            mStory.setText(ST3A);
            buttonTop.setText(T3A1);
            buttonBottom.setText(T3A2);

        }

        else if (buttonText == T1A2) {

            mStory.setText(ST2A);
            buttonTop.setText(T2A1);
            buttonBottom.setText(T2A2);

        }

        else if (buttonText == T2A1) {
            mStory.setText(ST2A);
            buttonTop.setText(T2A1);
            buttonBottom.setText(T2A2);

        }

        else if (buttonText == T2A2) {
            mStory.setText(E4);
            buttonTop.setText("THE END");
            buttonBottom.setVisibility(View.INVISIBLE);

        }

        else if (buttonText == T3A1) {
            mStory.setText(E6);
            buttonTop.setText("THE END");
            buttonBottom.setVisibility(View.INVISIBLE);

        }

        else if (buttonText == T3A2) {
            mStory.setText(E5);
            buttonTop.setText("THE END");
            buttonBottom.setVisibility(View.INVISIBLE);

        }

    }
}
