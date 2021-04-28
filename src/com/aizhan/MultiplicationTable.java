package com.aizhan;

public class MultiplicationTable {
    //5*1 = 5
    //5*10 = 50
    public void print() {
        print(5);
        //for(int i = 1; i<=10; i++) {
        //  System.out.printf("%d * %d = %d",5, i, 5*i).println();
    }

    //}
    public void print(int table) {
        print(table, 1, 10);
        //  for (int i = 1; i <= 10; i++) {
        //   System.out.printf("%d * %d = %d", table, i, table * i).println();
      }

   //}
    public void print(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
}
