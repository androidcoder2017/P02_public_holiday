package com.example.a15056112.p02_public_holiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;
    TextView tvHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       tvHoliday = (TextView)findViewById(R.id.tvType);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvHoliday.setText(type);

        lv = (ListView) findViewById(R.id.lvType);
        holidays = new ArrayList<Holiday>();
        if (type.equalsIgnoreCase("secular")) {
            holidays.add(new Holiday("New Year's Day", "1 January 2017",R.drawable.newyear));
            holidays.add(new Holiday("Labour Day", "1 May 2017",R.drawable.labourday));
        } else {
            holidays.add(new Holiday("Chinese New Year", "28-29 January 2017",R.drawable.cny));
            holidays.add(new Holiday("Good Friday", "14 April 2017",R.drawable.goodfriday));
            holidays.add(new Holiday("Vesak Day", "10 May 2017",R.drawable.vesakday));
            holidays.add(new Holiday("Hari Raya Haji", "1 September 2017",R.drawable.harirayahaji));

        }

        aa = new HolidayAdapter(this, R.layout.rows, holidays);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectHoliday = holidays.get(position);
                Toast.makeText(SecondActivity.this, selectHoliday.getHolidaysName() + ": " + selectHoliday.getHolidaysDate(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
