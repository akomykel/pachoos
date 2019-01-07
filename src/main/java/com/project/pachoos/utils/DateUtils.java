package com.project.pachoos.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(AppConstants.DATE_PATTERN);
        LocalDate localDate = LocalDate.now();
        return dtf.format(localDate);
    }
}
