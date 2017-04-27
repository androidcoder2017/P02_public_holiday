package com.example.a15056112.p02_public_holiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15056112 on 27/4/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvNames;
    private TextView tvDate;
    private ImageView ivHoliday;

    public HolidayAdapter(Context context, int resources, ArrayList<Holiday> objects) {
        super(context, resources, objects);
        holidays = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rows,parent,false);

        tvNames = (TextView)rowView.findViewById(R.id.tvName);
        tvDate = (TextView)rowView.findViewById(R.id.tvDate);
        ivHoliday = (ImageView) rowView.findViewById(R.id.ivIcon);


        Holiday currentHolidays = holidays.get(position);

        tvNames.setText(currentHolidays.getHolidaysName());
        tvDate.setText(currentHolidays.getHolidaysDate());
        ivHoliday.setImageResource(currentHolidays.getHolidayImage());


         return rowView;
    }

}

