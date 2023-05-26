package com.zmei.tomjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }
public void eraseTom(View view){
    ImageView imageTom = findViewById(R.id.imageTom);
    ImageView imageJerry = findViewById(R.id.imageJerry);
    imageTom.animate().rotation(3600).setDuration(3000);
    imageJerry.animate().rotation(3600).setDuration(3000);
    float jerry = imageJerry.getAlpha();
            if(jerry == 0) {
            imageTom.animate().alpha(0).setDuration(3000);
            imageTom.animate().rotation(-3600).setDuration(3000);
            imageTom.animate().scaleX(0).scaleY(0).setDuration(3000);

            imageJerry.animate().alpha(1).setDuration(3000);
            imageJerry.animate().rotation(3600).setDuration(3000);
            imageJerry.animate().scaleX(1).scaleY(1).setDuration(3000);

        }  else if (jerry == 1 ) {
            imageJerry.animate().alpha(0).setDuration(3000);
            imageJerry.animate().rotation(-3600).setDuration(3000);
            imageJerry.animate().scaleX(0).scaleY(0).setDuration(3000);

            imageTom.animate().alpha(1).setDuration(3000);
            imageTom.animate().rotation(3600).setDuration(3000);
            imageTom.animate().scaleX(1).scaleY(1).setDuration(3000);

        }
    }
}