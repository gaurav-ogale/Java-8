package com.ho;

public class LamdaRunnableEx {

	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			for(int i=0;i<10;i++) {
				System.out.println("i " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
			
		});
		
		t.start();
	}
}
