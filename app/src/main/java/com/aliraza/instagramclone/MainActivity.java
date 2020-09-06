package com.aliraza.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickTapped(View view){
        ParseObject kickboxer = new ParseObject("Boxer");
        kickboxer.put("punchSpeed", 200);
        kickboxer.put("punchPower", 300);
        kickboxer.put("kickSpeed",400);
        kickboxer.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e==null){
                    Toast.makeText(MainActivity.this, "Kickboxer object is saved ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}