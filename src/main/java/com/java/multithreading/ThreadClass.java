package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadClass implements Runnable {

    @Override
    public void run() {
        ThreadClass tc = new ThreadClass();
        ReentrantLock lock = new ReentrantLock();
    }

}
