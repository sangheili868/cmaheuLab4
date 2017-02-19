package com.cs40333.cmaheu.lab4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_detail);

        int resID;
        String[] teamInfo = getIntent().getStringArrayExtra("team");

        TextView date = (TextView) findViewById(R.id.txt_date);
        TextView place = (TextView) findViewById(R.id.txt_place);
        date.setText(teamInfo[1]);
        place.setText(teamInfo[2]);

        ImageView logo1 = (ImageView) findViewById(R.id.img_logo1);
        TextView loc1 = (TextView) findViewById(R.id.txt_loc1);
        TextView team1 = (TextView) findViewById(R.id.txt_team1);
        TextView record1 = (TextView) findViewById(R.id.txt_record1);

        resID = this.getResources().getIdentifier(teamInfo[3] , "drawable", this.getPackageName());
        logo1.setImageResource(resID );
        loc1.setText(teamInfo[4]);
        team1.setText(teamInfo[5]);
        record1.setText(teamInfo[6]);

        TextView scorepnts = (TextView) findViewById(R.id.txt_scorepnts);
        TextView scoreTime = (TextView) findViewById(R.id.txt_scoreTime);
        scorepnts.setText(teamInfo[7]);
        scoreTime.setText(teamInfo[8]);

        ImageView logo2 = (ImageView) findViewById(R.id.img_logo2);
        TextView loc2 = (TextView) findViewById(R.id.txt_loc2);
        TextView team2 = (TextView) findViewById(R.id.txt_team2);
        TextView record2 = (TextView) findViewById(R.id.txt_record2);

        resID = this.getResources().getIdentifier(teamInfo[9] , "drawable", this.getPackageName());
        logo2.setImageResource(resID );
        loc2.setText(teamInfo[10]);
        team2.setText(teamInfo[11]);
        record2.setText(teamInfo[12]);

        Button btn_cam = (Button) findViewById(R.id.btn_camera);
        btn_cam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
            }
        });

    }
}
