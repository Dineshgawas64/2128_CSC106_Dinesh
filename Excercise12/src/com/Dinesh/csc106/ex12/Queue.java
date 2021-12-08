package com.Dinesh.csc106.ex12;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	
	private List<String> queuelist;

	

//	public Queue() {
//		
//	}


	public Queue() {
		this.queuelist = new ArrayList<String>();
	}


	public void enqueue(String name) {
		
		queuelist.add(name);
		
	}
	
	public void dequeue() {
		
	System.out.println(queuelist.remove(0));	
	
		
	}
	
	
//	public void count() {
//		
//		
//	}
//	
	
	public void peek() {
		
		System.out.println(queuelist.get(0));

		
	
	}
	
	public List getQueuelist() {
		return queuelist;
	}

	public void setQueuelist(List queuelist) {
		this.queuelist = queuelist;
	}


	public void count() {
		System.out.println(queuelist.size());
		
	}

	
	
	
	
	
}