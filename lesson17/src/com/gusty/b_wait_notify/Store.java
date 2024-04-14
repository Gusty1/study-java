package com.gusty.b_wait_notify;

public class Store {
    //代表包子的count
    private int count;

    //代表是否有包子的flag
    private boolean flag;

    /*
        getCount改造成消費包子的方法
        直接輸出count
     */
    public synchronized void getCount() {
        //return count;
        //1.判斷flag是否為false，如果為false，證明沒有包子，生產線等待
        while (!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //2.如果flag為true，證明有包子，開始消費
        System.out.println("消費了...第" + count + "個包子");

        //3.改變flag狀態為false，證明消費完了，沒有包子
        //store.setFlag(false);
        this.flag = false;

        //4.喚醒所有等待線程
        this.notifyAll();
    }

    /*
        getCount改造成生產包子
        直接輸出count
     */
    public synchronized void setCount() {
        //1.判斷flag是否為true，如果為true，證明有包子，生產線等待
        while (this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //2.如果flag為false，證明沒有包子，開始生產
        count++;
        System.out.println("生產了...第" + count + "個包子");
        //3.改變flag狀態為true，證明生產完了，有包子
        this.flag = true;

        //4.喚醒所有生產線程
        this.notifyAll();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Store() {
    }

    public Store(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }
}
