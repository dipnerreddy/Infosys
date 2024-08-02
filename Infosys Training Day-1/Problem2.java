/*
 *  Minimum Platforms requried
 * 
 * given the arrival and depature times of the trains that reach a railway station, the task is to find the minimum number of platforms
 * requried for the railway station so that no train waits.
 * 
 * we are given two arrays that represents the arrival and depature times of the trains that stops
 * 
 * eg: input: arr[]={9:00,9:40,9:50,11:00,15:00,18:00},
 *            dep[]={9:10,12:00,11:20,11:30,19:00,20:00}
 *    output: 3
 */

public class Problem2 {
    public static void main(String[] args) {
        int arr[]={900,940,950,1100,1500,1800};
        int dep[]={910,1200,1120,1130,1900,2000};
        int a=0;
        int d=0;
        int count=1;
        while( a<arr.length){ // in place of 4, if we are using scanner class to take user input then we ned to use the arr.length;
            if(arr[a]<dep[d]){
                count+=1; // 2 1 2 3 2 1 2 3
                a+=1;
            }
            else{
                count-=1;
                d+=1;
            }
        }
        System.out.println(count);

    }
}
