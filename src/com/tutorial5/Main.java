package com.tutorial5;

import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello");
        System.out.println("Bankole");
    }
}

class Sum {
    public static void main(String args[]) {
        int sum;
        sum = 74+36;
        System.out.println("The sum of two numbers is " + sum);
    }
}

class Box {
    double width; double height; double depth;


    //constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; //an uninitialized
        depth = -1; //box
    }

    //constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
    }

    class OverloadCons {
    public static void main(String args[]) {
        // create voxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of first bos is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);


    }
}

class OpEquals {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5;
        b *= 4;
        c += a*b;
        c %= 6;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
        }

class now{
    public static void main(String args[]) {
        System.out.println("J   A   V   A");
        System.out.println("jj  aa VVV aaaa");
        System.out.println("  J  a  v  A");
    }
}

class AreaPeri {
    public static void main(String args[]) {

        System.out.println(4.0 * (1 -1.0/3) + (1.05/5) - (1.0/7) + (1.0/9) - (1.0/11));

    }
}


class Exercise15 {

    public static void main(String[] args) {

        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+  b);

    }
}

class Exercise13 {

    public static void main(String[] strings) {

        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);

        double area = width * height;

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}

//demonstrate static variables, methods, blocks
class Usestatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a is = " + a);
        System.out.println("b is = " + b);

    }
    public static void main (String args[]) {
        meth(42);
    }
}


import java.util.Scanner;
class Exercise19 {
    public static void main(String args[])
    {
        int dec_num, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        quot = dec_num;

        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }

        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}

class Box2 {
    double length;
    double height;
    double width;

    double volume;

    Box2(double l, double h, double w) {
        length = l;
        height = h;
        width = w;
    }
    

}
