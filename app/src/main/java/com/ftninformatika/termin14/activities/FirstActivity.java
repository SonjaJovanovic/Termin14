package com.ftninformatika.termin14.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ftninformatika.termin14.R;
import com.ftninformatika.termin14.model.Fruit;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        for(final Fruit fruit:Fruit.FRUITS) {
            Button button = new Button(this);
            button.setText(fruit.getName());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    intent.putExtra("id",fruit.getId());
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.linear_layout);
            layout.addView(button);





        }

    }

}
