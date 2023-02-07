package com.huangbo.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static int i=0;

    public void run() {
        for(int j=0;j<10000000;j++){
            lock.lock();
            try {
                i++;
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock r1 = new ReenterLock();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        t1.join(); // 同步，main 进程与 t1 串行，main 等 t1 执行完
        t2.join();
        System.out.println(i);
    }
}

