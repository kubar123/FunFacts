package com.lansoftprogramming.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {
    private FactBook facts = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare variables and assign views from layout file
        final TextView factLabel= (TextView) findViewById(R.id.factTextView);
        final Button showFactButton=(Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked - update label fact with new fact


                //update label with dynamic fact
                int colorSchemeOne = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(colorSchemeOne);
                factLabel.setText(facts.getFact());
                showFactButton.setTextColor(colorSchemeOne);
            }
        };
        showFactButton.setOnClickListener(listener);
    }



}
