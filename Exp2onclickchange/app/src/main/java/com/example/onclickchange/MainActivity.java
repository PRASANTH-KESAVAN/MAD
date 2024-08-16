package com.example.onclickchange;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // Import this
import android.widget.TextView; // Import this
import android.graphics.Color;
import android.graphics.Typeface; // Import this
import android.widget.Toast; // Import this

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button); // Find the Button by its ID
        btn.setBackgroundColor(Color.parseColor("#CDEFFE")); // Set background color

        TextView tv = findViewById(R.id.textview); // Find the TextView by its ID
        tv.setTextColor(Color.parseColor("#000000")); // Set initial text color to black
        tv.setTypeface(tv.getTypeface(), Typeface.NORMAL); // Set initial text style to normal

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(34);
                tv.setText("Hello, there");
                btn.setBackgroundColor(Color.parseColor("green"));
                tv.setTextColor(Color.parseColor("#FF0000")); // Change text color to red
                tv.setTypeface(tv.getTypeface(), Typeface.BOLD_ITALIC); // Change text style to bold and italic

                // Show a toast message
                Toast.makeText(MainActivity.this, "Size and color changed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}



