package com.suleymanince.picassofirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgViewOrnek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        resimCek();
    }

    public void tanimla(){
        imgViewOrnek = findViewById(R.id.img_view_ornek);
    }

    public void resimCek(){
        Picasso.with(getApplicationContext()).load("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png").into(imgViewOrnek);
    }
}
