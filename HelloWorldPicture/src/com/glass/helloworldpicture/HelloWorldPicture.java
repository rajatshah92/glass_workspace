package com.glass.helloworldpicture;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.glass.app.Card;

public class HelloWorldPicture extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    	
        Card myCard = new Card(this);
        myCard.setText("Hello World!");
        myCard.setFootnote("Hello World With a Picture");
        myCard.setImageLayout(Card.ImageLayout.FULL);
        myCard.addImage(R.drawable.thumbsup);
        View view = myCard.getView();
        setContentView(view);
    }
}
