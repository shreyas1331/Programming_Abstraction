package Heap1;
//min heap
import java.util.*;
public class heapify_test{
  public static void heapifyyy(int arr[],int n,int i){
      int smallest=i;
      int left=2*i+1;
      int right=2*i+2;
      if(left<n && arr[smallest]>arr[left]){
          smallest=left;
      }
      if(right<n && arr[smallest]> arr[right]){
          smallest=right;
      }
      if(smallest!=i){
          swap(arr, smallest, i);
          heapifyyy(arr, n,smallest);
      }
  }
  public static void swap(int arr[], int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  public static void main(String args[]){
          int n=5;
       int []arr={12,534,32,2,123};
      
       for (int i = n/2-1; i >=0; i--) {
          heapifyyy(arr, n, i);
       }
       System.out.println("printing array");
       for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
       }
       }
  }
