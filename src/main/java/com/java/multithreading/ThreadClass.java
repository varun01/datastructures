package com.java.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadClass {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(1, 101).forEach(num -> {
//            CompletableFuture<Integer> applyAsync = CompletableFuture.supplyAsync();
        });
    }

}
