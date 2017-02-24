package com.ayodele;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagram {
 
	   public static int numberNeeded(String first, String second) {
		   
		      char[]values1=first.toCharArray();
		      char[]values2=second.toCharArray();
		      ArrayDeque<Character>xy=new ArrayDeque<>();
		      ArrayDeque<Character>xy2=new ArrayDeque<>();
		      int i=0;
		      for(char x:values1){
		    	  xy.add(x);
		      }
		      for(char x:values2){
		    	  xy2.add(x);
		      }
		     
		      for(char y:xy){
		    	  
		    	  if(xy2.contains(y)){
		    		  System.out.println(y);
		    		 xy2.remove(y);
		    		 i++;
		    	  }
		      }
		      
		      
		      
		      int total=xy.size()-i+xy2.size();
		      return total;
		      
		      
	    }
	   
	   
	  public static boolean findCharacter(char x1,char[] y){
		  
		  for(char x:y){
	    		 if(x==x1){
	    			 return true;
	    		 }
	    		 
	    	 }
		  return false;
	  }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    	/*ArrayDeque<Character>y=new ArrayDeque<Character>();
	    	y.add('m');
	    	y.add('n');
	    	y.add('t');
	        y.add('b');
	        y.add('m');
	        System.out.println("Size "+y.size());
	        y.remove('m');
	    	 System.out.println(y.contains('m')+" size "+y.size());*/
	    }
	
	
}
