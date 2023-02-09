package com.nttdata.bootcamp.webfluxdemo.controller;

public class Subscriber {
	


	public static Object print(Integer n) {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Subscriber 1 " + n);
		return n;
	}

}
