package com.example.tc2r.tinderhelptest;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView subject_0, subject_1, subject_2, subject_3, subject_4;

    int selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subject_0 = (CardView) findViewById(R.id.subject_0_card_view);
        subject_1 = (CardView) findViewById(R.id.subject_1_card_view);
        subject_2 = (CardView) findViewById(R.id.subject_2_card_view);
        subject_3 = (CardView) findViewById(R.id.subject_3_card_view);
        subject_4 = (CardView) findViewById(R.id.subject_4_card_view);



        subject_0.setOnClickListener(this);
        subject_1.setOnClickListener(this);
        subject_2.setOnClickListener(this);
        subject_3.setOnClickListener(this);
        subject_4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        Intent myIntent = new Intent(MainActivity.this, CustomActivity.class);
        switch(view.getId()){
            case R.id.subject_0_card_view:
                //Toast.makeText(this, "subject_0 clicked", Toast.LENGTH_LONG).show();

                selection = 0;
                subject_0.setCardBackgroundColor(Color.GRAY);
                break;
            case R.id.subject_1_card_view:
                //Toast.makeText(this, "subject_1_main_image clicked", Toast.LENGTH_LONG).show();
                selection = 1;
                subject_1.setCardBackgroundColor(Color.GRAY);
                break;
            case R.id.subject_2_card_view:
                //Toast.makeText(this, "should do clicked", Toast.LENGTH_LONG).show();
                selection = 2;
                subject_2.setCardBackgroundColor(Color.GRAY);
                break;
            case R.id.subject_3_card_view:
                //Toast.makeText(this, "shouldnt do clicked", Toast.LENGTH_LONG).show();
                subject_3.setCardBackgroundColor(Color.GRAY);
                selection = 3;
                break;
            case R.id.subject_4_card_view:
                //Toast.makeText(this, "how to talk clicked", Toast.LENGTH_LONG).show();
                subject_4.setCardBackgroundColor(Color.GRAY);
                selection = 4;
                break;
        }

        myIntent.putExtra("selection",selection);
        MainActivity.this.startActivity(myIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        subject_0.setCardBackgroundColor(ContextCompat.getColor(this, R.color.ColorPrimary));
        subject_1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.ColorPrimary));
        subject_2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.ColorPrimary));
        subject_3.setCardBackgroundColor(ContextCompat.getColor(this, R.color.ColorPrimary));
        subject_4.setCardBackgroundColor(ContextCompat.getColor(this, R.color.ColorPrimary));
    }


}
