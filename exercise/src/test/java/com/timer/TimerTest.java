package com.timer;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import sun.net.www.http.HttpClient;
import sun.text.resources.cldr.es.FormatData_es_419;
import sun.tools.jar.Main;

import javax.swing.text.StyledEditorKit;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimerTest
{
    @Test
    public void test1()
    {
        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                System.out.println("bombing!");
            }
        }, 2000, 2000);
    }

    public static void main(String[] args)
    {
        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                System.out.println("bombing!");
            }
        }, 2000, 2000);
    }

    @Test
    public void test2()
    {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Timestamp t = new Timestamp(System.currentTimeMillis());
        System.out.println(t);
        for (int i = 0; i < 100000000; i++)
        {

        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2);
        System.out.println(l2 - l);
        //Timestamp timestamp = new Timestamp(l2 - l);

        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        System.out.println(t2);
    }

    @Test
    public void test3()
    {

        ExecutorService pool1 = Executors.newSingleThreadExecutor();
        pool1.execute(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 1000; i++)
                {
                    System.out.println("1111" + Thread.currentThread().getName());
                }

            }
        });

        pool1.execute(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 1000; i++)
                {
                    System.out.println("222222" + Thread.currentThread().getName());
                }
            }
        });


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 1000; i++)
                {
                    System.out.println("3333" + Thread.currentThread().getName());
                }
            }
        }).run();
    }

    @Test
    public void test4()
    {

    }


}
