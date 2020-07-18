/*
 * Copyright (c) 2020
 * MR Wangwg
 * Hello world !
 *
 */

public class OrderByThreadDemo2 implements ITest {

    private volatile int count = 3;

    private Object lock = new Object();

    @Override
    public void test() {

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    synchronized (lock) {
                        try {
                            while (count != 1) {
                                lock.wait();
                            }
                            count = 2;
                            System.out.println("----11111111");
                            lock.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    synchronized (lock) {
                        try {
                            while (count != 2) {
                                lock.wait();
                            }
                            count = 3;
                            System.out.println("----2222222");
                            lock.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    synchronized (lock) {
                        try {
                            while (count != 3) {
                                lock.wait();
                            }
                            count = 1;
                            System.out.println("----33333");
                            lock.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
    }


}
