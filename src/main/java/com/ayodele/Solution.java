package com.ayodele;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int l[]=new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int i=0;
        int y=0;
        int e=0;
        for(int x:a){
        	
            
            
            
            if(a.length<=k){
            	l[i]=a[(k-a.length)];
            	
            	
            }else{
            	l[i]=a[k];
            	
            	
            	 
            }
            i++;
            k++;
            
            /*k=k+i;*/
        }
       for(int x:l){
    	   System.out.println(x);
       }
        
    }
}

