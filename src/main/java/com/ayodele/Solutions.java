package com.ayodele;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer>x=new ArrayList<>();
        TreeMap<Integer, Integer>sortedint=new TreeMap<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                x.add(i);
            }
        }
        for(int i:x){
        	if(i<10){
        		sortedint.put(i,i);
        	}else{
        		sortedint.put(sumdigit(i),i);
        		
        	}
        	
        }
        Map.Entry<Integer, Integer>y=sortedint.lastEntry();
        
        System.out.println(y.getKey()+" "+y.getValue());
       
    }
    public static int sumdigit(int x){
    	int sum=0;
    	while(x>0){
    		sum=sum+x%10;
    		x=x/10;
    	}
    	return sum;
    }
}