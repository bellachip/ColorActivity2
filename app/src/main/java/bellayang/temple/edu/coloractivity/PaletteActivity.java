package bellayang.temple.edu.coloractivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity implements ColorListener {
    PaletteFragment palette_fragment;
    CanvasFragment canvas_fragment;
    boolean twoPanes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);


        palette_fragment = new PaletteFragment();

        canvas_fragment = new CanvasFragment();

        android.app.FragmentManager fragment_manager = getFragmentManager();
        fragment_manager.beginTransaction().add(R.id.pFragment, palette_fragment).addToBackStack(null).commit();
    }


    public void setColor(String c) {
        if (findViewById(R.id.page) != null) {
            FragmentManager fragment_manager3 = getFragmentManager();
            fragment_manager3.beginTransaction().replace(R.id.pFragment, palette_fragment).addToBackStack(null).commit();
            fragment_manager3.executePendingTransactions();
            findViewById(R.id.pFragment).setBackgroundColor(Color.parseColor(c));

        }


        //set activity title to palette activity
//        setTitle(R.string.palette);


    }
}


