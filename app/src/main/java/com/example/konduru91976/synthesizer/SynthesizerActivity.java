package com.example.konduru91976.synthesizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        mpE = mediaPlayer.create(this,R.raw.scalee);
    }

    public void onButton1(View view) {
        Log.i(TAG, "Button1 clicked");
        Log.e(TAG, "Button 1 clicked");
        mpE.start();
    }
    public void onButton2(View view) {
        Log.i(TAG, "Button2 clicked");
        mpE.start();
    }
}
