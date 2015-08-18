package com.example.ouliviamikhael.onu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import com.squareup.picasso.Picasso;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //set picasso image
        /*ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg")
                .into(imageView);*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
