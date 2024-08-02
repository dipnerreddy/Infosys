// removing the duplicates in an array  
// eg: input: [1,2,2,3,4,5]
//    output: [1,2,3,4,5]

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];

        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=1;
        while(j<l){
            if(arr[i]==arr[j]){
                for(int k=j;k<l-1;k++){
                    arr[k]=arr[k+1];
                }
            }
            else{
                i=i+1;
                j=j+1;
            }
            
        }
        for(int k=0;k<l;k++){
            System.out.print(arr[k]+ " ");
        }
    }
}