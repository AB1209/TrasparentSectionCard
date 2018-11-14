package com.ab1209.transparentsectioncard.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ab1209.transparentsectioncard.R;
import com.ab1209.transparentsectioncard.views.TransparentCardView;

public class MainActivity extends AppCompatActivity implements TransparentCardView.OnLayoutListener {

    private TransparentCardView transparentCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transparentCardView = findViewById(R.id.activity_main_transparent_card_view);
        transparentCardView.setOnLayoutListener(this);
    }

    @Override
    public void onLayout() {
        transparentCardView.setCardColor(R.color.chocolate);
    }
}
