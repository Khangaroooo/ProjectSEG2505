package com.example.nguye.seg2505app.ScheduleClasses;

import java.util.ArrayList;

public class CurrentUserSchedule {
    private static ArrayList<Day> currentUserSchedule = null;


    private CurrentUserSchedule() {
    }

    public static ArrayList<Day> get() {
        return currentUserSchedule;
    }

    public static void set(ArrayList<Day> schedule) {
        currentUserSchedule = schedule;
    }
}
