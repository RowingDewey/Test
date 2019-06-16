package com.timer;

import sun.tools.jar.Main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask
{
    private static int count = 0;

    @Override
    public void run()
    {
        count =(count + 1) %2;
        System.out.println("bombing!");
        new Timer().schedule(new MyTimerTask(), 2000 + 2000 * count);


    }

    public static void main(String[] args)
    {
        final int delay = 2000;
        new Timer().schedule(new MyTimerTask(), delay);
        while (true)
        {
            System.out.println(new Date().getSeconds());
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}
