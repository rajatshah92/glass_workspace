package com.glass.helloworld;

import com.google.android.glass.app.Card;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;



public class HelloWorld extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Card mycard = new Card(this);
        mycard.setFootnote("This is a test");
        mycard.setText("Hello World!");
        mycard.getView();
        View cardview = mycard.getView();
        setContentView(cardview);
        
    }
}