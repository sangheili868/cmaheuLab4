package com.cs40333.cmaheu.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String[]> teams = new ArrayList<String[]>();
        teams.add(new String[] {
                "Feb 11",
                "Saturday, February 11, 6:00 PM",
                "Purcell Pavilion at the Joyce Center, Notre Dame, Indiana",
                "@drawable/florida_state",
                "Florida State",
                "Seminoles",
                "(21-5)",
                "72 - 84",
                "Final",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(19-7)"
        });
        teams.add(new String[] {
                "Feb 14",
                "Tuesday, February 14, 7:00 PM",
                "Silvio O. Conte Forum, Chestnut Hill, Massachusetts",
                "@drawable/bc",
                "Boston College",
                "Eagles",
                "(9-18)",
                "76 - 84",
                "Final",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(20-7)"
        });
        teams.add(new String[] {
                "Feb 18",
                "Saturday, February 18, 12:00 PM",
                "PNC Arena, Raleigh, North Carolina",
                "@drawable/ncs",
                "North Carolina State",
                "Wolfpack",
                "(14-14)",
                "72 - 81",

                "Final",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(21-7)"
        });
        teams.add(new String[] {
                "Feb 26",
                "Sunday, February 26, 6:30 PM",
                "Purcell Pavilion at the Joyce Center, Notre Dame, Indiana",
                "@drawable/georgia_tech_yellow_jackets",
                "Georgia Tech",
                "Yellow Jackets",
                "(15-11)",
                "",

                "",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(21-7)"
        });
        teams.add(new String[] {
                "March 1",
                "Wednesday,March 1, 8:00 PM",
                "Purcell Pavilion at the Joyce Center, Notre Dame, Indiana",
                "@drawable/bc",
                "Boston College",
                "Eagles",
                "(9-18)",
                "",

                "",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(21-7)"
        });
        teams.add(new String[] {
                "March 4",
                "Saturday,March 4, 2:00 PM",
                "KFC Yum! Center, Louisville, Kentucky",
                "@drawable/louisville",
                "Louisville",
                "Cardinals",
                "(22-5)",
                "",

                "",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(21-7)"
        });
        teams.add(new String[] {
                "March 7",
                "Tuesday, March 7, 12:00 PM",
                "Barclays Center, Brooklyn, New York",
                "@drawable/acc",
                "ACC Tournament",
                "",
                "",
                "",

                "",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(21-7)"
        });
        teams.add(new String[] {
                "Thursday 16",
                "Tuesday, March 16, 12:00 PM",
                "",
                "@drawable/ncaa",
                "NCAA Tournament",
                "",
                "",
                "",

                "",
                "@drawable/nd",
                "Notre Dame",
                "Fighting Irish",
                "(21-7)"
        });
        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(this, teams);

        ListView scheduleListView = (ListView) findViewById(R.id.scheduleListView);
        scheduleListView.setAdapter(scheduleAdapter);

        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("team", teams.get(position)); //where al is your ArrayList holding team information.
                startActivity(intent);
            }
        };
        scheduleListView.setOnItemClickListener (clickListener);
    }
}
