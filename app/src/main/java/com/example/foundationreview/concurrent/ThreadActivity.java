package com.example.foundationreview.concurrent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TimeUtils;

import com.example.foundationreview.R;
import com.example.foundationreview.util.CodeIdUtils;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadActivity extends AppCompatActivity {

    private static final String TAG = "ccg";
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();
    private Object object = new Object();
    private int countA = 1;
    private int countB = 1;
    private ExecutorService executorService;
    private Runnablea runnablea;
    private Runnableb runnableb;
    private ThreadLocal<String> threadLocal = new ThreadLocal<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        threadLocal.set("主线程");
        Log.d(TAG, "localMain:"+threadLocal.get());
        new Thread(){
            @Override
            public void run() {
                super.run();
                threadLocal.set("1线程");
                Log.d(TAG, "local1:"+threadLocal.get());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                threadLocal.set("2线程");
                Log.d(TAG, "local2:"+threadLocal.get());
            }
        }.start();

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 3; i++) {
//                executorService.execute(new FirstRunnable());
//            }
//        executorService.shutdown();
//        Thread A = new Thread(){
//            public void run() {
//
//                synchronized (object){
//                    try {
//
//                       for (countA=1;countA<4;countA++){
//                           Log.d(TAG, "A:"+countA);
//                           if (countA==1){
//                               object.wait();
//                           }
//                       }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        };


//        Thread B = new Thread(){
//            @Override
//            public void run() {
//                //insert(Thread.currentThread());
//                synchronized (object){
//
//                    for (countB=1;countB<4;countB++){
//                        Log.d(TAG, "B:"+countB);
//                    }
//                    object.notify();
//                }
//
//            }
//        };
//        A.start();
//        B.start();
        executorService = Executors.newCachedThreadPool();
//        runnablea = new Runnablea();
//        runnableb = new Runnableb();
//        executorService.execute(runnablea);
//        executorService.execute(runnableb);
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new Test1());
//        }
//        executorService.shutdown();

    }

    private  void printNumber(String threadName) throws InterruptedException {

//        while (i++ < 3) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Log.d(TAG, threadName+ "print:" + i);
//        }
        for (int j = 0; j < 3; j++) {
            Log.d(TAG, threadName+ "print:" + j);
            if (j==0){
                object.wait();
            }

        }
    }

    public class FirstRunnable implements Runnable {

        public FirstRunnable() {
            Log.d("ccg", "*****"+ "launch");
        }

        @Override
        public void run() {
//            for (int i = 0; i < 3; i++) {
//                Log.d("ccg", "#"+ i);
//                Thread.yield();
//            }
            long start = System.currentTimeMillis();
            try {
                Thread.sleep(((int)(Math.random()*10+1))*1000);
                Log.d("ccg", "耗时："+ (System.currentTimeMillis()-start)/1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            Log.d("ccg", "*****"+ "close");
        }
    }

    public class Thread1 implements Runnable {
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    Log.d("ccg", Thread.currentThread().getName() + " synchronized loop " + i);
                }
            }
        }

    }

    public class Thread2 {
        public void m4t1() {
            synchronized (this) {
                int i = 5;
                while (i-- > 0) {
                    Log.d("ccg", Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }

        public void m4t2() {
//            int i = 5;
//            while( i-- > 0) {
//                Log.d("ccg", Thread.currentThread().getName() + " : " + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException ie) {
//                }
//            }

            synchronized (this) {
                int i = 5;
                while (i-- > 0) {
                    Log.d("ccg", Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }
    }

    public void insert(Thread thread) {
        if (lock.tryLock()){
            try {
                Log.d(TAG, thread.getName()+"得到了锁");
                for(int i=0;i<5;i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }finally {
                Log.d(TAG, thread.getName()+"释放了锁");
                lock.unlock();
            }
        }else {
            Log.d(TAG, thread.getName()+"获取锁失败");
        }

    }

    /**
     *练习1/3
     */
    public class Test1 implements Runnable{

        private int count = 3;

        public Test1() {
            Log.d(TAG, "construct");
        }

        @Override
        public void run() {
//            for (int i = 0; i < 3; i++) {
//                Log.d(TAG, "test1 out");
//                Thread.yield();
//            }
            while (count-- > 0){
                Log.d(TAG, "test1："+count);
                Thread.yield();
            }
            Log.d(TAG, " out");


        }
    }

    /**
     * 练习21
     */
    public class Runnablea implements Runnable{

        @Override
        public void run() {
            synchronized (this){
                try {
                    wait();
                    Log.d(TAG, "run: its ok");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class Runnableb implements Runnable{

        @Override
        public void run() {
            synchronized (runnablea){
                try {
                    TimeUnit.SECONDS.sleep(5);
                    runnablea.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


