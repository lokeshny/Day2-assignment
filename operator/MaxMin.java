

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        System.out.println("program to perform operation and find MIN and MAX \n");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value for a");
        int a = sc.nextInt();
        System.out.println("enter the value for b");
        int b = sc.nextInt();
        System.out.println("enter the value for c");
        int c = sc.nextInt();

        System.out.println("performing i.a+b*c");
        double i=(a+(b*c));
        System.out.println("output of a+b*c= "+i +"\n");

        System.out.println("performing ii.c+a/b");
        double ii=(c+(a/b));
        System.out.println("output of c+a/b= "+ii+"\n");

        System.out.println("performing iii.a%b+c");
        double iii=(a%b)+c;
        System.out.println("output of a%b+c= "+iii+"\n");

        System.out.println("performing iv.a*b+c");
        double iv=(a*b)+c;
        System.out.println("output of a*b+c= "+iv+"\n");

        System.out.print("maximum among these four operations is = ");
        if ((i>ii) && (i>iii) && (i>iv)){
            System.out.println("i.a+b*c = "+i+ " is the maximum value among these operations ");
        }
        else if ((ii>i) && (ii>iii) && (ii>iv)){
            System.out.println("ii.c+a/b = "+ii+ " is the maximum value among these operations ");
        }
        else if ((iii>i) && (iii>ii) && (iii>iv)){
            System.out.println("iii.a%b+c = "+iii+ " is the maximum value among these operations ");
        }
        else if ((iv>i) && (iv>ii) && (iv>iii)){
            System.out.println("iv.a*b+c = "+iv+ " is the maximum value among these operations ");
        }
        else
        {
            System.out.println("none is maximum ");
        }

        System.out.print("minimum among these four operations is = ");
        if ((i<ii) && (i<iii) && (i<iv)){
            System.out.println("i.a+b*c = "+i+ " is the minimum value among these operations ");
        }
        else if ((ii<i) && (ii<iii) && (ii<iv)){
            System.out.println("ii.c+a/b = "+ii+ " is the minimum value among these operations ");
        }
        else if ((iii<i) && (iii<ii) && (iii<iv)){
            System.out.println("iii.a%b+c = "+iii+ " is the minimum value among these operations ");
        }
        else if ((iv<i) && (iv<ii) && (iv<iii)){
            System.out.println("iv.a*b+c = "+iv+ " is the minimum value among these operations ");
        }
        else
        {
            System.out.println("none is minimum ");
        }





    }
}