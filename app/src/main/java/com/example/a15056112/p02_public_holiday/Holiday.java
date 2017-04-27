package com.example.a15056112.p02_public_holiday;

/**
 * Created by 15056112 on 27/4/2017.
 */

public class Holiday {
    private String holidaysName;
    private String holidaysDate;
    private int holidayImage;

    public Holiday(String holidaysName, String holidaysDate, int holidayImage) {
        this.holidaysName = holidaysName;
        this.holidaysDate = holidaysDate;
        this.holidayImage = holidayImage;
    }

    public String getHolidaysName() {
        return holidaysName;
    }

    public String getHolidaysDate(){
        return holidaysDate;
    }
    public int getHolidayImage(){
        return holidayImage;
    }
}
