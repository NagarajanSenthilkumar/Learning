package com.kodnest.ArrayDS;

public class Queue {
	private int Queue[] = null;
	private int size = 0;
	private int top = -1;
	private int arr=-1;
	public Queue(int n) {
		Queue = new int[n];
		size = Queue.length;
	}
	
	public void push(int elem)
	{
		if (top == size - 1)
		{
			System.out.println("Stack Is Full Cannot Insert");
		}
		else 
		{
			++top;
			Queue[top] = elem;
		}
	}
	public int pop()
	{
			arr++;
			Queue[arr]=0;
	
			if(Queue[arr]==Queue[top])
			{
				return push;			
			}
			
	
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(Queue[i]);
		}
		
	}


}
