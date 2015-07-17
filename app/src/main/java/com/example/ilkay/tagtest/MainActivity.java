package com.example.ilkay.tagtest;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.apmem.tools.layouts.*;
import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {


    public boolean isSelected = false;
    private View notSelected;
    private View selected;

//hello

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);

/*
        FlowLayout flowLayout  = (FlowLayout) findViewById(R.id.flowLayout);



        for (int i = 0; i < 20; i++) {
            LinearLayout linearLayoutChild = new LinearLayout(this);
            linearLayoutChild.setOrientation(LinearLayout.HORIZONTAL);
            linearLayoutChild.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


            for (int j = 0; j < 3; j++) {
                Button button = new Button(this);
                button.setText("Button");
                flowLayout.addView(button);
            }


        }*/


        /*//WORKING 3 BUTTONS

        // Find the ScrollView
        ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);



// Create a LinearLayout element
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

// Add Buttons

        for (int i = 0; i < 20; i++) {
            LinearLayout linearLayoutChild = new LinearLayout(this);
            linearLayoutChild.setOrientation(LinearLayout.HORIZONTAL);
            linearLayoutChild.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


            for (int j = 0; j < 3; j++) {
                Button button = new Button(this);
                button.setText("Some texttttt");
                linearLayoutChild.addView(button);
            }
            linearLayout.addView(linearLayoutChild);
        }

        // Add the LinearLayout element to the ScrollView
       scrollView.addView(linearLayout);*/



    }

}
