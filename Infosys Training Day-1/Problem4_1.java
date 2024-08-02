/*
 * you are given an array of size N.
 * An Array A is considered a summer array if all  the even vlaues in A are on one side
 *  and odd values are on the other side.
 * 
 * you are allowed to swap two adjacent elements in A in one operation.
 * find the minimum swap operations requried to change A into a summer Array.
 * 
 * ex: input: [1,2,3,4,5,6,8]
 *    output: 3
 *
 */


public class Problem4_1 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,8};
        int c=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length-1;j++){
                if(ar[j]%2==0 && ar[j]%2==1){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    c+=1;
                }
            }
        }
        

    }

}
