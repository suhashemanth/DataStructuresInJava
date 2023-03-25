package trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import trees.TreeTraversals.Height;

public class TreeTraversals {

	public static class Node<T> {

		private T data;
		private Node<T> left;
		private Node<T> right;

		public Node(T data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node<Integer> root = takeInput();
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		preOrderIterative(root);
		System.out.println();
		inOrderTraversal(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		System.out.println(checkBal(root).isBal);
	}

	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void postOrder(Node<Integer> root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void preOrderIterative(Node<Integer> root) {

		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data + " ");
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
	}

	public static void inOrderTraversal(Node<Integer> root) {
		Stack<Node<Integer>> stack = new Stack<>();
		HashSet<Node> set = new HashSet<>();
		stack.push(root);
		Node<Integer> node = root;
		while (!stack.isEmpty()) {
			while (node!=null && node.left != null) {
				stack.push(node.left);
				node = node.left;
			}
			node = stack.pop();//
			while(node!=null && node.right==null && !stack.isEmpty())
			{
				System.out.print(node.data + " ");
				node=stack.pop();
			}
			if(node!=null)
			{
				System.out.print(node.data+" ");
				stack.push(node.right);
				node = node.right;
			}
			
		}
	}

	public static void postOrderTraversal(Node<Integer> root) {
		Stack<Node<Integer>> stack = new Stack<>();
		Stack<Node<Integer>> stackStore = new Stack<>();
		stack.push(root);
		Node<Integer> node = root;
		while (!stack.isEmpty()) {
			node = stack.pop();
			stackStore.push(node);
			if (node.left != null) {
				stack.push(node.left);
			}
			if (node.right != null) {
				stack.push(node.right);
			}
		}
		while (!stackStore.isEmpty()) {
			System.out.print(stackStore.pop().data + " ");
		}
	}
	
	public static class Height{
		int height;
		boolean isBal;
		
		public Height(){}
		public Height(int height,boolean isBal) {
			this.height=height;
			this.isBal=isBal;
		}
	}

	public static boolean checkBalanced(Node<Integer> root) {
		if (root == null) {
			return true;
		}
		
		return checkBalanced(root.left) && checkBalanced(root.right);
	}
	
	public static Height checkBal(Node<Integer> root)
	{
		if(root==null)
		{
			return new Height(0,true);
		}
		int height=0;
		boolean isBal=true;
		Height leftBal = checkBal(root.left);
		Height rightBal = checkBal(root.right);
		int heightLeft=leftBal.height;
		int heightRight=rightBal.height;
		boolean isBalLeft=leftBal.isBal;
		boolean isBalRight=rightBal.isBal;
		height=1+Math.max(heightLeft, heightRight);
		if(Math.abs(heightLeft-heightRight)>1)
		{
			isBal=false;
		}
		if(isBalLeft==false||isBalRight==false)
		{
			isBal=false;
		}
		return new Height(height, isBal);
	}
	
	public static Node<Integer> takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the root value: ");
		int r=sc.nextInt();
		Node<Integer> root=new Node<>(r);
		Node<Integer> temp=root;
		Queue<Node<Integer>> q=new LinkedList<>();
		q.add(temp);
		while(!q.isEmpty())
		{
			root=q.poll();
			System.out.println("Enter the left Child for "+root.data+" :");
			int left= sc.nextInt();
			if(left!=-1)
			{
				root.left=new Node<>(left);
				q.add(root.left);
			}
			System.out.println("Enter the right Child for "+root.data+" :");
			int right= sc.nextInt();
			if(right!=-1)
			{
				root.right=new Node<>(right);
				q.add(root.right);
			}
		}
		return temp;
	}


}
