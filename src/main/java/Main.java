//start by importing scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    //define 1D array with 10 numbers
    int[] HW5arr = {4,5,2,24,98,54,10,8,34,7};

    //set HW5arr equal to arr
    int[] arr = HW5arr;
    print(arr);
    System.out.println("sum: " + sum(arr));
    System.out.println("average: " + average(arr));
    System.out.println("max: " + max(arr));
    System.out.println("min: " + min(arr));
    sort(arr);
    System.out.print("sorted: ");
    for (int i : arr) {
        System.out.print(i + " ");
    }
    
  } 
   
  //define 'print' function
  public static void print(int[] arr) {
    for (int i = 0; i <arr.length; i++) {
      if (i <arr.length -1) {
        System.out.print(arr[i] + ", ");
      } else {
        System.out.print(arr[i]);
        System.out.println();
      }
      

      }
    }

  //define 'sum' function
  public static int sum(int[] arr) {
    int input = 0;
    for (int i=0; i <arr.length; i++) {
      input += arr[i];
    }
    return input; 
  }

  //define 'average' function
  public static float average(int[] arr) {
    int sum = sum(arr);
    return (float) sum / arr.length;
  }

  //define 'max' function
  public static int max(int[] arr) {
    int high = arr[0];
    for (int i=0; i <arr.length; i++) {
      if (arr[i] > high) {
        high = arr[i];
      }
    }
    return high;
  }

  //define 'min' function
  public static int min(int[] arr) {
    int low = arr[0];
    for (int i=0; i <arr.length; i++) {
      if (arr[i] < low) {
        low = arr[i];
      }
    }
    return low;
  }

  //define 'sort' function
  public static void sort(int[] arr) {
      int n = arr.length;
      for (int i = 1; i < n; ++i) {
          int place = arr[i];
          int j = i - 1;
          while (j >= 0 && arr[j] > place) {
              arr[j + 1] = arr[j];
              j = j - 1;
          }
          arr[j + 1] = place;
      }
  }
  

  
}

  
