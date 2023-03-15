package com.mytests;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
public class WinDiver {
	
	static File file1 = new File("C:\\Program Files\\Mendix\\9.12.10.62109\\modeler\\studiopro.exe");
	static File file2 = new File("C:\\Windows\\System32\\cmd.exe");
    
 public static void start(){
	 try{
	     Desktop desktop = Desktop.getDesktop();
	 
	      File file = new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe");
	      
	 
	           /* Check if there is support for Desktop or not */
	       if(!Desktop.isDesktopSupported())
	        {
	           System.out.println("not supported");
	            return;
	         }
	 
	         if (file.exists())
	          {
	             System.out.println("Open WinAppDriver.exe\n");
	             desktop.open(file);
	          }
	       }
	       catch (IOException e)
	       {
	           e.printStackTrace();
	           System.out.println("Encountered Exception\n");
	           throw new RuntimeException(e);
	       }
	 
	    if(!Desktop.isDesktopSupported())
	    {
	    	System.out.println("Not supported");
	    }
	   }
 
 public static void  launch() {
	 try{
	     Desktop desktop = Desktop.getDesktop();
	     
	     if(!Desktop.isDesktopSupported())
	        {
	           System.out.println("not supported");
	            return;
	         }
	 
	         if (file1.exists())
	          {
	             System.out.println("Open Mendix Studio pro.exe\n");
	             desktop.open(file1);
	          }
	       }
	       catch (IOException e)
	       {
	           e.printStackTrace();
	           System.out.println("Encountered Exception\n");
	           throw new RuntimeException(e);
	       }
	 
	    if(!Desktop.isDesktopSupported())
	    {
	    	
	    	System.out.println("Not supported");
	    }
	   }	 
 
	 
 
// public static void  cmd() {
//	 try{
//	     Desktop desktop = Desktop.getDesktop();
//	     
//	     if(!Desktop.isDesktopSupported())
//	        {
//	           System.out.println("not supported");
//	            return;
//	         }
//	 
//	         if (file2.exists())
//	          {
//	             System.out.println("Open Mendix Studio pro.exe\n");
//	             desktop.open(file2);
//	          }
//	       }
//	       catch (IOException e)
//	       {
//	           e.printStackTrace();
//	           System.out.println("Encountered Exception\n");
//	           throw new RuntimeException(e);
//	       }
//	 
//	    if(!Desktop.isDesktopSupported())
//	    {
//	    	
//	    	System.out.println("Not supported");
//	    }
//	   }	 
 
public static void stop(){
	
	try
	{
	 ProcessBuilder processBuilder =new ProcessBuilder("taskkill ","/f","/IM","WinAppDriver.exe");
	 processBuilder.start();
	  }
	 catch (IOException e)
	  {
	    e.printStackTrace();
	    throw new RuntimeException(e);
	 }
  }


}


