package com.learn.binarysearch;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 */
public class FindIndex {

    public int findIndex(int [] nums, int targetValue){
        int startingIndex = 0;
        int endingIndex =  nums.length -1;
        while(startingIndex <= endingIndex){
            int middleIndex =  startingIndex + (endingIndex - startingIndex)/2;
            int middleIndexValue =  nums[middleIndex];
            if(targetValue < middleIndexValue){
                endingIndex = middleIndex-1;
            }else if(targetValue > middleIndexValue){
                startingIndex = middleIndex+1;
            } else if (targetValue == middleIndexValue) {
                return middleIndex;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindIndex findIndex = new FindIndex();
        int index = findIndex.findIndex(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        System.out.println(index);
    }
}
