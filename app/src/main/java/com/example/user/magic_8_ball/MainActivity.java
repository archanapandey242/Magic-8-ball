package com.example.user.magic_8_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        button = (Button) findViewById(R.id.button);
        final ImageView image = (ImageView) findViewById(R.id.ball_image);
        final int[] ballArray = {
                R.drawable.magicball1,
                R.drawable.magicball2,
                R.drawable.magicball3,
                R.drawable.magicball4,
                R.drawable.magicball5,
                R.drawable.magicball6,
                R.drawable.magicball7,
                R.drawable.magicball8
        };
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d("Magic-8-ball", "Button has been pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(8);
                Log.d("Magic-8-ball", "The random number is:" + number);
                image.setImageResource(ballArray[number]);


            }
        });

    }

}





