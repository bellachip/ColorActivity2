package bellayang.temple.edu.coloractivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        //set title to Canvas Activity
        setTitle(R.string.title2);

        //get intent
        Intent intent = getIntent();

        //get the color value
        int colorValue = intent.getIntExtra("colorValue", -1);

        //set canvas activity background to color
        ConstraintLayout layout =  findViewById(R.id.canvas_layout);
        layout.setBackgroundColor(colorValue);


    }
}
