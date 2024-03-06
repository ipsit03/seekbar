package com.example.seekbarjava;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;
    private TextView ratingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);
        ratingText = findViewById(R.id.ratingText);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateTextViewColor(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    private void updateTextViewColor(int progress) {
        String resultText = "you are rating " + progress;
        textView.setText(resultText);

        if (progress >= 1 && progress <= 3) {
            textView.setTextColor(Color.RED);
        }
        else if (progress >= 4 && progress <= 6) {
            textView.setTextColor(Color.YELLOW);
        }
        else if (progress >= 7 && progress <= 10) {
            textView.setTextColor(Color.GREEN);
        }
    }
}
