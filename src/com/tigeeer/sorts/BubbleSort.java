package com.tigeeer.sorts;

/**
 * Created by tigeeer on 2016/8/4.
 */
public class BubbleSort {

   public static int[] descending(int[] array) {
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array.length-1; j++) {
            int tmp;
            if(array[j] < array[j+1]) {
               tmp = array[j];
               array[j] = array[j+1];
               array[j+1] = tmp;
            }
         }
      }

      return array;
   }

   public static int[] ascending(int[] array) {
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array.length-1; j++) {
            int tmp;
            if(array[j] > array[j+1]) {
               tmp = array[j];
               array[j] = array[j+1];
               array[j+1] = tmp;
            }
         }
      }

      return array;
   }
}
