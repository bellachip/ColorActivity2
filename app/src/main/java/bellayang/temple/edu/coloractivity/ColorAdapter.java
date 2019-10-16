package bellayang.temple.edu.coloractivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.content.res.Resources;
/**
 * Created by Belle on 10/8/19.
 */

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colors;

    //constructor
    public ColorAdapter(Context context, String[] colors){
        this.colors = colors;
        this.context = context;

    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView =  new TextView(context);

        if (convertView == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView) convertView;
        }

        if (position == 0) {
            textView.setText("WHITE");

        }
        //set text color
        textView.setText(colors[position]);
        //set background color
        textView.setBackgroundColor(Color.parseColor(colors[position]));

        return textView;



    }
}
