package com.dsa.backtracking;
public class Solution {

	static class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> l1=new LinkedListNode<Integer>(4);
		LinkedListNode<Integer> l2=new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> l3=new LinkedListNode<Integer>(7);
		LinkedListNode<Integer> l4=new LinkedListNode<Integer>(8);
		LinkedListNode<Integer> l5=new LinkedListNode<Integer>(3);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		printReverse(l1);
	}
	
	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
		LinkedListNode prev=null;
		LinkedListNode curr=root;
		LinkedListNode nextPtr=null;
		while(curr!=null)
		{
			nextPtr=curr.next;//7,8
			curr.next=prev;//1->4->
			prev=curr;//1
			curr=nextPtr;//7
		}
		while(prev!=null)
		{
			System.out.print(prev.data+" ");
		}
	}

}