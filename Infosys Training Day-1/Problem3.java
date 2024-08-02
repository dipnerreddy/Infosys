/*
 * Reffer the picture for the qustion, problem3.jpg
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value and base value");
        int n=sc.nextInt();
        int base=sc.nextInt();
        for(int i=base;i<n;i++){
            if(base(n,i) == true){
                System.out.println(i);
                break;
            }
        }

    }

    public static boolean base(int m,int b){
        int r=m%b;
        while(m>=b && (m%b)==r){
            m=m/b;
            if(m==r){
                return true;
            }
        }
        return false;
    }
}
