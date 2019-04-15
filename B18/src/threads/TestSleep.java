package threads;

public class TestSleep extends Thread {

	  
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		TestSleep t1=new TestSleep();  
		t1.start();  
		 }  
		}  