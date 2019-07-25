package com.concurrent;

import jdk.nashorn.internal.runtime.ECMAException;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class  Ticket{
    private int number=50;

    Lock lock = new  ReentrantLock();

    public void sale(){
        lock.lock();
        try{
            if(number>0){
                System.out.println("已经卖出"+(50-(number--))+"张票，还剩"+number+"张");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}

public class MainTest {

    public static void main(String[] args) {

        final Ticket ticket = new Ticket();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <49 ; i++) {
                    ticket.sale();
                }

            }
        },"A").start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <49 ; i++) {
                    ticket.sale();
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <49 ; i++) {
                    ticket.sale();
                }
            }
        },"C").start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <49 ; i++) {
                    ticket.sale();
                }
            }
        },"D").start();

    }

}
