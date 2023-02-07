package com.huangbo.concurrent.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();

    public void run() {
        try {
            if (lock.tryLock(5, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + " Get lock successful");
                Thread.sleep(6000);
            } else {
                System.out.println(Thread.currentThread().getName() + " Get lock failed");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread())
                lock.unlock();
        }
    }

    public static void main(String[] args) throws Exception {
        TimeLock lock1 = new TimeLock();
        Thread t1 = new Thread(lock1);
        Thread t2 = new Thread(lock1);
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println("Main end");
    }
}
