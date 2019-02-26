package com.example.user.diction;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shaik on 01-02-2019.
 */

public class WordAdapter extends ArrayAdapter<list_items> {
    private Context context;

    public WordAdapter(Activity context, ArrayList<list_items> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViewsw, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        this.context=context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_items, parent, false);
        }

        // Get listItems = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView TextView = (TextView) listItemView.findViewById(R.id.word);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        TextView.setText(list_items.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView TextView1 = (TextView) listItemView.findViewById(R.id.meaning);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        TextView1.setText(list_items.getMean());



        return listItemView;
    }
}
