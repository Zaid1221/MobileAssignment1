//Zaid Javaid
//Mobile Development
//Assignment 1

package com.example.zaid.mobileassignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){     //this is the function for when the button gets clicked

        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_LONG).show();   //makes the toast
        VideoView videoView = (VideoView) findViewById(R.id.rickroll); //create video view
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.rickroll); //setting path

        videoView.start();  //starts the video 
    }
}
