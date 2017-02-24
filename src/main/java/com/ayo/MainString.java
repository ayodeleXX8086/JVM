package com.ayo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.annotation.PostConstruct;

public class MainString {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
      Mstring l= new Mstring();
      Mstring x= new Mstring();
      l.setNames("Ayo");
      String h=new String("hello").intern();
      
      String y=new String("hello");
      
      
      if(l==x){
    	  System.out.println("Equals");
      }else{
    	  System.out.println("not equals");
      }
      Object ls=l;
      
      System.out.println("Set class "+ls.getClass().getName());
      Class c = Class.forName(ls.getClass().getName());
      for(Method method:c.getDeclaredMethods()){
    	  Class params[] = {};
    	  Object paramsObj[] = {};
    	  if(method.getName().startsWith("get")){
    		  Class thisClass = Class.forName(ls.getClass().getName());
    		      	      //Object newInstance=thisClass.newInstance();
    		      	    Method thisMethod=c.getDeclaredMethod(method.getName(), params);
                         Object obj=thisMethod.invoke(ls, paramsObj);
    		 if(obj instanceof String){
    		  System.out.println("This print out :"+obj.toString());
    		 }
    	  System.out.println(method.getName());
    	  
      }
      }
      
      
      if(h==y){
    	  System.out.println("Equals");
      }else{
    	  System.out.println("not equals");
      }
      
	}

}
