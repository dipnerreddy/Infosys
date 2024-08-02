// /*
//  * given an interger arr of size N the task is to find the count of elements whoes value is greater then all its prior element
//  * 
//  */

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int count = 1;
        int maxElement = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > maxElement) {
                count++;
                maxElement = ar[i];
            }
        }

        System.out.println(count);
    }
}
