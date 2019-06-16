package com.java.se.Thread.problem;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 一个线程循环10次， 另一个线程循环100次 交替执行，循环50次
 *
 * @author Administrator
 * @version C10 2018年9月14日
 * @since SDP V300R003C10
 */
public class question1
{
    
        public static void main(String[] args)
        {
           Business business = new Business();
            
           new Thread(new Runnable()
        {
            
            @Override
            public void run()
            {
                for (int i = 0; i < 50; i++)
                {
                    business.sub(i);
                }
            }
        }).start();
           
          for (int i = 0; i < 50; i++)
          {
                  business.main(i);
          }
          
           
           // 即使2个方法加上 synchronized  也不会同步  ？
      /* new Thread(new Runnable()
        {
            
            @Override
            public void run()
            {
                for (int i = 0; i < 100; i++)
                {
                    business.main(i);
                }
            }
        }).start();*/
       
    
    }  
     
    
  

}

class Business {
    
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    
    private boolean pass_sub = true;
    
    public   void sub(int i) {
        lock.lock();
        
        while (!pass_sub)
        {
            try
            {
                condition.await();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        try
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println("sub ------------- of " + j + ", loop of" + i);
            }
            // 不应当放到 finally 中
            pass_sub = false;
            condition.signal();
        }
        catch (Exception e)
        {
        } finally {
            lock.unlock();
            
            
        }
        
        
        
    }
    
    public  void main(int i) {
        lock.lock();
       
        while (pass_sub)
        {
            try
            {
                condition.await();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            for (int j = 0; j < 100; j++)
            {
                System.out.println("main Thread sequence of " + j+ ", loop of " + i);
            }
            pass_sub = true;
            condition.signal();
        }
        catch (Exception e)
        {
        }finally {
            lock.unlock();
            
        }
      
    }
}
