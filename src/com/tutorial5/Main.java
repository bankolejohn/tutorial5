package com.tutorial5;

public class Main {
// Using a do-while to process a menu selection
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for( ; !done; ) {
            System.out.println("i is " + i);
            if(i==10) done = true;
            i++;
        }
    }
}
