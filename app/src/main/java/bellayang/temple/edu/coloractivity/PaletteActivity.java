package bellayang.temple.edu.coloractivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    Spinner spinner;
    int colorInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //set activity title to palette activity
        setTitle(R.string.title);

        //color array
        final String[] colors = {"WHITE", "RED", "YELLOW", "GREEN", "TEAL", "CYAN", "BLUE",
                "MAGENTA", "PURPLE", "MAROON", "BLACK", "GRAY"};

        //spinner
        spinner = findViewById(R.id.spinner);

        //Color Custom Adapter
        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, colors );

        spinner.setAdapter(adapter);
        spinner.setSelection(0, false);

        //selection action
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //String item = parent.getItemAtPosition(position).toString();
                view.setBackgroundColor(Color.WHITE);
                ((TextView) view).setTextColor(Color.BLACK);

                String colorVal = ((TextView) view).getText().toString();

                    colorInt = Color.parseColor(colors[position]);
                    Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    intent.putExtra("colorValue", colorInt);
                    startActivity(intent);

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    }

