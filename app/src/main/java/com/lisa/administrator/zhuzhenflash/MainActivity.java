package com.lisa.administrator.zhuzhenflash;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private AnimationDrawable animation;
    private ImageView imageFrame;
    private Button startBtn;
    private Button stopBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        imageFrame = (ImageView) findViewById(R.id.imageFrame);
        startBtn = (Button) findViewById(R.id.startBtn);
        stopBtn = (Button) findViewById(R.id.stopBtn);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
//        imageFrame = (ImageView) findViewById(R.id.imageFrame);//之前写的是这句话，一直没有出来
        imageFrame.setImageResource(R.drawable.frame);
        animation = (AnimationDrawable) imageFrame.getDrawable();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startBtn:
                animation.start();
                break;
            case R.id.stopBtn:
                animation.stop();
                break;
        }
    }
}
