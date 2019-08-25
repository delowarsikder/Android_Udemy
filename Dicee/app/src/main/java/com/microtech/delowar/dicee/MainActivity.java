package com.microtech.delowar.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int [] diskArray=new int[]{R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
    Button rollButton;
    ImageView leftImage,rightImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listener();
    }

    private void listener() {
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("d","button is clicked");
                Random randomNumber1=new Random();
                int n1=randomNumber1.nextInt(6);
                leftImage.setImageResource(diskArray[n1]);

                Random randomNumber2=new Random();
                int n2=randomNumber2.nextInt(6);
                rightImage.setImageResource(diskArray[n2]);
            }
        });
    }

    private void init() {
        rollButton=findViewById(R.id.rollButton_id);
        leftImage=findViewById(R.id.leftImage_id);
        rightImage=findViewById(R.id.rightImage_id);
    }
}
