package com.discardpast.louwailou;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {


    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.setTime(date);
        System.out.println(simpleDateFormat.format(date));
        calendar.add(Calendar.MONTH,2);
        System.out.println(simpleDateFormat.format(new Date(calendar.getTimeInMillis())));
    }
}
