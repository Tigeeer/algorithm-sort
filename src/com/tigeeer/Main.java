package com.tigeeer;

import com.tigeeer.sorts.BubbleSort;
import com.tigeeer.sorts.QuickSort;

/**
 * Created by tigeeer on 2016/8/4.
 */
public class Main {

   public static void main(String[] args) {
      int[] array = new int[20];
      for(int i = 0; i < 20; i++) {
         array[i] = (int) (1+Math.random()*100);
      }
      System.out.println("==========  Before Sort ===========");
      for(int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
      System.out.println();
      System.out.println("==========  After Sort ===========");
      array = new QuickSort(array, 1, -1).getNewArray();
      for(int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
   }
}
