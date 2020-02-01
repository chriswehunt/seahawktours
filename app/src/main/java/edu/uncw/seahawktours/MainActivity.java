package edu.uncw.seahawktours;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
    private Button cis;
    private Button bear;
    private Button fisher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cis = findViewById(R.id.CIS);
        cis.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                onCIS();
            }
        });
        bear = findViewById(R.id.BEAR);
        bear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                 onBEAR();
            }
        });
        fisher = findViewById(R.id.Fisher);
        fisher.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                onFisher();
            }
        });

    }
    public void onCIS(){
        Intent intent = new Intent(this, DetailActivity.class);
        String building = getString(R.string.CIS);
        intent.putExtra(Intent.EXTRA_TEXT, building);
        startActivity(intent);

    }
    public void onBEAR(){
        Intent intent = new Intent(this, DetailActivity.class);
        String building = getString(R.string.Bear);
        intent.putExtra(Intent.EXTRA_TEXT, building);
        startActivity(intent);
    }
    public void onFisher(){
        Intent intent = new Intent(this, DetailActivity.class);
        String building = getString(R.string.Fisher);
        intent.putExtra(Intent.EXTRA_TEXT, building);
        startActivity(intent);
    }
}








