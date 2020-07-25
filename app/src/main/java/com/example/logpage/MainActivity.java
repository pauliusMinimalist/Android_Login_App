package com.example.logpage;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.logpage.ActivitySecond;

public class MainActivity extends AppCompatActivity {

    private TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2: added button action
        tV = (TextView) findViewById(R.id.buttonelis);
        tV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, ActivitySecond.class);
        startActivity(intent);
    }
}
