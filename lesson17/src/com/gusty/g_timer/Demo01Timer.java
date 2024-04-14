package com.gusty.g_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo01Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我我我我我我我");
            }
        },new Date(),2000);
    }
}
