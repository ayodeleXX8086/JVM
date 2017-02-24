package com.ayodele;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 BitSet bits1 = new BitSet(16);
         BitSet bits2 = new BitSet(16);
         
         // set some bits
         /*for(int i = 0; i < 16; i++) {
            if((i % 2) == 0) bits1.set(i);
            if((i % 5) != 0) bits2.set(i);
         }
         bits1.or(bits2);*/
         bits1.set(3);
         System.out.println(bits1);
     /*String text="[](){}<>";	
     System.out.println(check(text));
     System.out.println((text==null)?true:false);
    */
    }
    
    public static boolean  check(String str){
    	 Stack<Character> stack = new Stack<Character>();

    	    char[] c=str.toCharArray();
    	    for(int i=0; i < str.length(); i++) {
    	        

    	        if(c[i]=='{'){
    	        	 stack.push(c[i]);
    	        }
    	        if(c[i] == '['){
   	        	 stack.push(c[i]);
   	        }
    	        if(c[i] == '<'){
   	        	 stack.push(c[i]);
   	        }
    	        if(c[i] == '('){
    	            stack.push(c[i]);
    	        }

    	        /*if(c[i] == '{') {
    	            stack.push(c[i]);
    	            if(c[i] == '}')
    	                if(stack.empty())
    	                    return false;
    	                else if(stack.peek() == '{')
    	                    stack.pop();
    	        }*/
    	        else if(c[i] == ')'){
    	            if(stack.empty()){
    	                return false;
    	            }
    	            else if(stack.peek() == '('){
	                    stack.pop();
	            }
    	            else{
	                    return false;
	                }
    	        }
    	            
    	            else if(c[i] == '}'){
        	            if(stack.empty()){
        	                return false;
        	            }
        	            else if(stack.peek() == '{'){
    	                    stack.pop();
    	            }else{
	                    return false;
	                }
        	            
        	        }
        	            
        	            else if(c[i] == '<'){
            	            if(stack.empty()){
            	                return false;
            	            }
            	            else if(stack.peek() == '>'){
        	                    stack.pop();
        	            }
            	            else{
        	                    return false;
        	                }
            	        }
            	            
            	            else if(c[i] == ']'){
                	            if(stack.empty()){
                	                return false;
                	            }
                	            else if(stack.peek() == '['){
            	                    stack.pop();
            	            }
                	            else{
            	                    return false;
            	                }
                	        }
                	            
    	                
    	        }
    	        return stack.empty();


    }
    
	
}
