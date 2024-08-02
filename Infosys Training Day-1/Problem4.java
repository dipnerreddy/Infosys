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


 // but we are getting 1 as output because, we are not swaping adjecent elements, insted we are swaping anyplace inside an array
public class Problem4 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,8,9};
        int arr2[]={1,2,3,4,5,6,8,9};
        int a1=f(arr1);
        int a2=l(arr2);
        int ans=Math.min(a1,a2);
        System.out.println(ans);
    }
    public static int f(int a[]){
        int i=0;
        int j=a.length-1;
        int c=0;
        while (i<j) {
            if(a[i]%2==0){
                i+=1;
            }
            else if(a[j]%2==1){
                j-=1;
            }
            else if(a[i]%2==1 && a[j]%2==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                c+=1;
            }
        }
        return c;
    }
    public static int l(int a[]){
        int i=0;
        int j=a.length-1;
        int c=0;
        while (i<j) {
            if(a[i]%2==1){
                i+=1;
            }
            else if(a[j]%2==0){
                j-=1;
            }
            else if(a[i]%2==0 && a[j]%2==1){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                c+=1;
            }
           
        }
        return c;
    }
}
