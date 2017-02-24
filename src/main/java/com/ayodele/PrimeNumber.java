package com.ayodele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PrimeNumber {

	
	public static void main(String...stringsargs){
		
		Scanner n=new Scanner(System.in);
		int w=3;
		int x=13;
		int temp = 0,sectemp = 0;
		int check=0;
		TreeSet<Integer>m=new TreeSet<>();
		int v=0;
		ArrayList<Integer>y=new ArrayList<>();
		
		for(int i=w;i<=x;i++){
			if(x!=i){
				if(checkprime(i)){
					y.add(i);
				}
				
			}
			
		}
		
		if(checkprime(x)){
			y.add(x);
		}
		
		m.addAll(y);
		y.clear();
		y.addAll(m);
		
		for(int b=1;b<=y.size();b++){
			if(b!=y.size()){
			if(y.get(b)-y.get(b-1)==2){
				v++;
			}
			}
		}
		System.out.println(v);
	
	}
	 
	
	
	
	public static boolean checkprime(int x){
		if(x>=2){
		for(int i=2;i<x;i++){
			
				if(x%i==0){
					return false;
					
				}
			
			
		}
		}
		 return true;
		
	}
}
