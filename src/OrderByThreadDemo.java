/*
 * Copyright (c) 2020
 * MR Wangwg
 * Hello world !
 *
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OrderByThreadDemo implements ITest{

    private volatile int count = 3;
    private ReentrantLock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();

    @Override
    public void test() {

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    try {
                        lock.lock();
                        while (count != 1) {
                            c1.await();
                        }
                        count = 2;
                        System.out.println("----11111111");
                        c2.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    try {
                        lock.lock();
                        while (count != 2) {
                            c2.await();
                        }
                        count = 3;
                        System.out.println("----2222222");
                        c3.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    try {
                        lock.lock();
                        while (count != 3) {
                            c3.await();
                        }
                        count = 1;
                        System.out.println("----33333");
                        c1.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }.start();
    }


}
