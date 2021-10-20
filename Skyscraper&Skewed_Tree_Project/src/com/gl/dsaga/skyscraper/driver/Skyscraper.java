package com.gl.dsaga.skyscraper.driver;

import java.util.*;

public class Skyscraper {
	
	public static void sortstack(LinkedList<Integer> inp)
	{
		Stack<Integer> tmpStack = new Stack<Integer>();
		int N=inp.size();
		System.out.println("The order of construction is as follows :");
		for(int i=0;i<inp.size();i++)
		{
			int tmp = inp.get(i);
			tmpStack.push(tmp);
			System.out.println("Day: "+(i+1));
			if(tmp==N){
			    while (!tmpStack.isEmpty() && tmpStack.peek()==N)
			    {
			        System.out.print(tmpStack.pop()+" ");
			        N--;
			 	}
			 }
			 System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> inp = new LinkedList<>();
		System.out.println("Enter the total no of floors in the building");
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
		    System.out.println("Enter the floor size given on day : "+(i+1));
		    inp.add(sc.nextInt());
		}
		sortstack(inp);
		sc.close();
	}

}
