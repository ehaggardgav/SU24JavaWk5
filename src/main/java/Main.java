//start by importing scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    //define 1D array with 10 numbers
    int[] HW5arr = {4,5,2,24,98,54,10,8,34,7};

    //set HW5arr equal to arr
    int[] arr = HW5arr;
    print(arr);
    
  } 
   
  //define print function
  public static void print(int[] arr) {
    for (int i = 0; i <arr.length; i++) {
      if (i <arr.length -1) {
        System.out.print(arr[i] + ", ");
      } else {
        System.out.print(arr[i]);
      }
      

      }
    }
  }

  
