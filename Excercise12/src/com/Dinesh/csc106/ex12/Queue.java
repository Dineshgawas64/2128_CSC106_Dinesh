package com.Dinesh.csc106.ex12;

import java.util.List;
import java.util.ArrayList;


public class Queue {
	
	private List<String> queueList;
	Integer count;
	
	public Queue() {
		
		this.queueList = new ArrayList<String>();
	}
	public boolean isEmpty() {
		return this.count == 0;
		
	}
	
	
	
	public void enqueue(String person) {
		
		queueList.add(person);
		count++;
		System.out.println("Added\n");
		
	}
	
	
	
	public String dequeue() {
		
		if(isEmpty()) {
			return null;
		}
		 count--;
		return queueList.remove(0);
   
	}
	
	
	
	public String peek() {
		
		if(isEmpty()) {
			return null;
		}
		return this.queueList.get(0);
	}
	
	
	
	
	public void display() {
		
		for(String item : this.queueList) {
			System.out.println(item);
		}
	}
	
	

	public List<String> getQueueList() {
		return queueList;
	}

	public void setQueueList(List<String> queueList) {
		this.queueList = queueList;
	}

	
}