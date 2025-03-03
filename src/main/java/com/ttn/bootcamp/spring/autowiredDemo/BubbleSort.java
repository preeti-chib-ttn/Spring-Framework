package com.ttn.bootcamp.spring.autowiredDemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BubbleSort  implements  Sorting{

    public void sort(int[] array,int n){
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for (int j = 0; j < n-1-i; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped){break;}
        }

        System.out.println("After sorting the array is: "+ Arrays.toString(array));
    }

    private void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
