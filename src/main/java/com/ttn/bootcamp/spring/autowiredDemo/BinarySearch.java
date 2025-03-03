package com.ttn.bootcamp.spring.autowiredDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {



    Sorting sorting;

    @Autowired
    public BinarySearch(Sorting sorting){
        this.sorting=sorting;
        System.out.println("Using "+sorting+" for binary search");
    }


    public void search(int[] arr, int n,int target){
        sorting.sort(arr,n);

        int low=0; int high= n;
        int mid;

        while(low<=high){
            mid = low +(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Element found at "+mid);
                return;
            }else if(arr[mid]<target){
                low=mid+1;
            }else high=mid-1;
        }

        System.out.println("Element not found!");
    }
}
