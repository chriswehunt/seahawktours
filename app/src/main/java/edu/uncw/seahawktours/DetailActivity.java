package edu.uncw.seahawktours;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String building = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView building_name = findViewById(R.id.building);
        building_name.setText(building);
        TextView buildingInfo = findViewById(R.id.building_info);

        if (building.equals(getString(R.string.CIS))) {
            buildingInfo.setText(getString(R.string.cis_info));

        }else if (building.equals(getString(R.string.Bear))) {
            buildingInfo.setText(getString(R.string.bear_info));

        } else if (building.equals(getString(R.string.Fisher))) {
            buildingInfo.setText(getString(R.string.fisher_info));
        }
    }


}
