package com.example.tc2r.tinderhelptest;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jarvischarles on 7/13/17.
 */

public class CustomActivity extends AppCompatActivity{

    TextView title, subTitle, description;
    ImageView mImageView;
    CardView baseCardView, imageCardView;
    Toolbar customTool;
    int selection;

    final int[] titleArray = {
            R.string.subject_0_title_tv,
            R.string.subject_1_title_tv,
            R.string.subject_2_title_tv,
            R.string.subject_3_title_tv,
            R.string.subject_4_title_tv};

    final int[] subTitleArray = {
            R.string.subject_0_subTitle,
            R.string.subject_1_subTitle,
            R.string.subject_2_subTitle,
            R.string.subject_3_subTitle,
            R.string.subject_4_subTitle};

    final int[] imageArray = {
            R.drawable.subject_0_main_image,
            R.drawable.subject_1_main_image,
            R.drawable.subject_2_main_image,
            R.drawable.subject_3_main_image,
            R.drawable.subject_4_main_image};

    final int[] descriptionArray = {
            R.string.subject_0_description_tv,
            R.string.subject_1_description_tv,
            R.string.subject_2_description_tv,
            R.string.subject_3_description_tv,
            R.string.subject_4_description_tv};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        Intent mIntent = getIntent();
        selection = mIntent.getIntExtra("selection", 0); //if it's a string you stored.

        Toolbar mToolbar;

        title = (TextView) findViewById(R.id.custom_title);
        subTitle = (TextView) findViewById(R.id.custom_subTitle);
        mImageView = (ImageView) findViewById(R.id.custom_imageView);
        description = (TextView) findViewById(R.id.custom_description);
        customTool = (Toolbar) findViewById(R.id.toolbar);
        baseCardView = (CardView) findViewById(R.id.base_cardView);
        imageCardView = (CardView) findViewById(R.id.image_cardView);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        final ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Back");

        final Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
        upArrow.setColorFilter(getResources().getColor(R.color.ColorPrimary), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);




        for(int i = 0; i <= selection; i++){

            switch (selection){
                case 0:
                    title.setText(titleArray[selection]);
                    subTitle.setText(subTitleArray[selection]);
                    mImageView.setImageResource(imageArray[selection]);
                    description.setText(descriptionArray[selection]);
                    break;
                case 1:
                    title.setText(titleArray[selection]);
                    subTitle.setText(subTitleArray[selection]);
                    mImageView.setImageResource(imageArray[selection]);
                    description.setText(descriptionArray[selection]);
                    break;
                case 2:
                    title.setText(titleArray[selection]);
                    subTitle.setText(subTitleArray[selection]);
                    mImageView.setImageResource(imageArray[selection]);
                    description.setText(descriptionArray[selection]);
                    break;
                case 3:
                    title.setText(titleArray[selection]);
                    subTitle.setText(subTitleArray[selection]);
                    mImageView.setImageResource(imageArray[selection]);
                    description.setText(descriptionArray[selection]);
                    break;
                case 4:
                    title.setText(titleArray[selection]);
                    subTitle.setText(subTitleArray[selection]);
                    mImageView.setImageResource(imageArray[selection]);
                    description.setText(descriptionArray[selection]);
                break;
            }
        }
        

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                try {
                    Intent myIntent = new Intent(CustomActivity.this, MainActivity.class);
                    CustomActivity.this.startActivity(myIntent);
                }catch (Exception e){
                    Toast.makeText( this, "Back Button Clicked Error", Toast.LENGTH_LONG).show();
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
