package hackerrank.ds.stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] buildings = new int[n];
        for(int i = 0; i < n; i++){
            buildings[i] = s.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            int size = maxSize(i, n, buildings);
            if(size > max) max = size;
        }
        System.out.println(max);
    }
    
    private static int maxSize(int index, int size, int[] buildings){
        int cur = buildings[index];
        
        int minIndex = index;
        int maxIndex = index;
        for(; minIndex >= 0 && buildings[minIndex] >= cur; minIndex--);
        for(; maxIndex < buildings.length && buildings[maxIndex] >= cur; maxIndex++);
        
        return cur*(maxIndex-minIndex-1);
    }
}