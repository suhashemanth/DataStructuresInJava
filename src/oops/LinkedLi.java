package oops;

import oops.LinkedLi.LinkedListNode;

public class LinkedLi {

	static class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
		// Your code goes here
		LinkedListNode node = head;
		int count = find(node);
		LinkedListNode<Integer> n1 = del(head, pos, 0, count);
		LinkedListNode<Integer> n2 = del1(head, pos, 0, count);
		n1.next = n2;
		return node;
	}

	public static int find(LinkedListNode<Integer> head) {
		if (head == null) {
			return 0;
		}
		return 1 + find(head.next);
	}

	public static LinkedListNode<Integer> del(LinkedListNode<Integer> head, int pos, int i, int count) {
		if (i == count) {
			return null;
		}
		if (i >= pos-1) {
			return head;
		}
		return del(head.next, pos, i + 1, count);
	}

	public static LinkedListNode<Integer> del1(LinkedListNode<Integer> head, int pos, int i, int count) {
		if (i == count) {
			return null;
		}
		if (i>=pos+1) {
			return head;
		}
		return del1(head.next, pos, i + 1, count);
	}

	public static void print(LinkedListNode<Integer> head) {
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}

	public static void main(String[] args) {
		int pos = 2;
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> head1 = new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> head2 = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> head3 = new LinkedListNode<Integer>(4);
		LinkedListNode<Integer> head4 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> head5 = new LinkedListNode<Integer>(6);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
//		LinkedListNode<Integer> deleteNodeRec = delete(head, pos);
		
		LinkedListNode<Integer> ins = ins(head);
		print(ins);
	}
	
	public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head,int i)
	{
		if(head==null)
		{
			return null;
		}
		if(i==0)
		{
			return head.next;
		}
		LinkedListNode<Integer> smallOutput=delete(head.next, i-1);
		return smallOutput;
	}
	
	public static void insert(LinkedListNode<Integer> head,int ele,int i)
	{
		if(head==null)
		{
			return;
		}
		if(i==0)
		{
			LinkedListNode<Integer> node=new LinkedListNode<Integer>(ele);
			node.next=head;
		}
		insert(head.next, ele, i-1);
	}
	
	public static LinkedListNode<Integer> ins(LinkedListNode<Integer> head)
	{
		insert(head, 20, 2);
		return head;
	}

}
