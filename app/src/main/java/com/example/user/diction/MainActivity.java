package com.example.user.diction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = findViewById(R.id.listview1);
        ArrayList<list_items> list_items = new ArrayList<list_items>();
        list_items obj1 = new list_items();
        list_items.add(obj1);
        obj1.setName("anamalous");
        obj1.setMean("deviating from what is standard, normal, or expected.");
        list_items obj2 = new list_items();
        list_items.add(obj2);
        obj2.setName("anecdote");
        obj2.setMean("a short interesting story about a real incident or person.");
        list_items obj3 = new list_items();
        list_items.add(obj2);
        obj3.setName("appopriate");
        obj3.setMean("suitable or proper in the circumstances");
        list_items obj4 = new list_items();
        list_items.add(obj4);
        obj4.setName("barricade ");
        obj4.setMean("an improvised barrier erected across a street to prevent the movement of opposing forces.");
        list_items obj5 = new list_items();
        list_items.add(obj5);
        obj5.setName("binoculars");
        obj5.setMean("an optical instrument with a lens for each eye, used for viewing distant objects.");
        list_items obj6 = new list_items();
        list_items.add(obj6);
        obj6.setName("caustic");
        obj6.setMean("sarcastic in a scathing and bitter way.");
        list_items obj7 = new list_items();
        list_items.add(obj7);
        obj7.setName("cease");
        obj7.setMean("bring to an end");
        list_items obj8 = new list_items();
        list_items.add(obj8);
        obj8.setName("chicanery");
        obj8.setMean("the use of deception or subterfuge to achieve one's purpose");
        list_items obj9 = new list_items();
        list_items.add(obj9);
        obj9.setName("dismiss");
        obj9.setMean("order or allow to leave; send away");
        list_items obj10 = new list_items();
        list_items.add(obj10);
        obj10.setName("dream");
        obj10.setMean("a cherished aspiration, ambition,ideal.");

    }
}