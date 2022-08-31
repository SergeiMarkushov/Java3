package com.example.lesson5;

import java.util.concurrent.*;

public class FutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        int[] source = {1, 2, 3, 4};

        int[] res1 = new int[2];
        int[] res2 = new int[2];

        System.arraycopy(source, 0, res1, 0, res1.length);
        System.arraycopy(source,2, res2, 0, res2.length);

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int res = 0;
                for (int i = 0; i < res1.length; i++) {
                    res += res1[1];
                }
                Thread.sleep(5000);
                return res;
            }
        };

        Callable<Integer> callable2 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int res = 0;
                for (int i = 0; i < res2.length; i++) {
                    res += res2[1];
                }
                Thread.sleep(5000);
                return res;
            }
        };

        Future<Integer> future1 = executorService.submit(callable);
        Future<Integer> future2 = executorService.submit(callable2);

        System.out.println(future1.get() + future2.get());

        executorService.shutdownNow();
    }
}
