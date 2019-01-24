package com.ftninformatika.termin14.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ftninformatika.termin14.R;
import com.ftninformatika.termin14.model.Fruit;

import java.io.IOException;
import java.io.InputStream;

public class SecondActivity extends Activity {

    private Fruit fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       int id = getIntent().getExtras().getInt("id");

       for(Fruit f : Fruit.FRUITS) {
           if(f.getId() == id)
               fruit = f;

       }

        TextView tv = findViewById(R.id.textView_name);
       tv.setText(fruit.getName());

       TextView tv2 = findViewById(R.id.textView_description);
       tv2.setText(fruit.getDescription());


        ImageView iv = findViewById(R.id.imageView);
        try {
            InputStream is = getAssets().open(fruit.getImageFileName());
            Drawable drawable = Drawable.createFromStream(is,null);
            iv.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    public void onClick (View v){
        Toast.makeText(this," You are buying fruit " + fruit.getName(), Toast.LENGTH_SHORT).show();
    }
}
