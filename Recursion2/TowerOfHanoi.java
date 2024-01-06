package Recursion2;
import java.util.*;
public class TowerOfHanoi {
	public static void towerOfHanio(int disk,int source,int aux,int destination){
        if(disk==0){
            return;
        }
        if(disk==1){
            System.out.println("Move "+disk+"th "+"disc from T"+source+ " to " +"T"+destination);
            return;
        }
        towerOfHanio(disk-1,source,destination,aux);
        System.out.println("Move "+disk+"th "+"disc from T"+source+ " to " +"T"+destination);
        towerOfHanio(disk-1,aux,source,destination);
         
    }
    public static int cnt(int n){
        if(n==1){
            return 1;
        }
        else{
            return  2*cnt(n-1)+1;
        }

    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanio(n,1,3,2);
        System.out.println(cnt(n));
        
    }
}
