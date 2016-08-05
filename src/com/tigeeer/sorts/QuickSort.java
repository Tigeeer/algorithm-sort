package com.tigeeer.sorts;

/**
 * Created by tigeeer on 2016/8/4.
 */
public class QuickSort {

   private int[] newArray;

   public QuickSort(int[] array, int leftOrRight, int offset) {
      newArray = new int[array.length];
      sort(array, leftOrRight, offset);
   }

   private void sort(int[] array, int leftOrRight, int offset) {
      int tmp = array[0], j = 0, k = array.length-1, count = 1;
      int[] tempArray = new int[array.length];
      for(int i = 1; i < array.length; i++) {
         if(array[i] < tmp) {
            tempArray[j] = array[i];
            j++;
         } else if(array[i] > tmp) {
            tempArray[k] = array[i];
            k--;
         } else {
            count++;
         }
      }
      int[] leftArray = new int[j], rightArray = new int[array.length - k - 1];
      for(int i = 0; i < tempArray.length; i++) {
         if(i < j) {
            leftArray[i] = tempArray[i];
         }
         if(i > k) {
            rightArray[i-1-k] = tempArray[i];
         }
      }
      int offsetLeft, offsetRight;
      if(leftOrRight == 0) {
         offsetRight = offset - (tempArray.length - k);
         offsetLeft = offsetRight +1 - count;
         for(int i = 0; i < count; i++) {
            newArray[offsetLeft+i] = tmp;
         }
      } else {
         offsetLeft = offset + j + 1;
         offsetRight = offsetLeft-1+count;
         for(int i = 0; i < count; i++) {
            newArray[offsetLeft+i] = tmp;
         }
      }
      if(leftArray.length != 0) {
         sort(leftArray, 0, offsetLeft);
      }
      if(rightArray.length != 0) {
         sort(rightArray, 1, offsetRight);
      }
   }

   public int[] getNewArray() {
      return newArray;
   }
}
