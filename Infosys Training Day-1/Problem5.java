// Reffer Problem5.jpg for the probelm statemet

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int E=sc.nextInt(); // energy level
        // int N=sc.nextInt(); // no of ex
        // int arr[]=new int[N];
        // for(int i=0;i<N;i++){
        //     arr[i]=sc.nextInt();
        // }

        int E=6;
        int N=2;
        int arr[]={1,2};
        int count=0;
        int t=0;
        while(t<N){
            for(int i=0;i<=N;i++){
                if(arr[i]<=E){
                    count+=1;
                    E=E-arr[i];
                }
            }
            t+=1;
        }
        if(E>0){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }

    }
}
