package bst;

public class BST {
	private Node root;
	private int size;

	public boolean isPresent(int x) {
		return isPresentHelper(root, x);
	}
	
	public boolean isPresentHelper(Node root,int x)
	{
		if (root == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}
		if(x<root.data)
		{
			return isPresentHelper(root.left,x);
		}
		
		return isPresentHelper(root.right, x);
	}

	public void insert(int data) {
		if (root == null) {
			root = new Node(data);
			size++;
		} else {
			Node temp = root;
			boolean flag = false;
			while (flag == false) {
				if (data < temp.data) {
					if (temp.left == null) {
						temp.left = new Node(data);
						size++;
						break;
					} else {
						temp = temp.left;
					}
				} else {
					if (temp.right == null) {
						temp.right = new Node(data);
						size++;
						break;
					} else {
						temp = temp.right;
					}
				}
			}
		}
	}
	
	public int size()
	{
		return this.size;
	}
	 
	public void printTree()
	{
		printTreeHelper(root);
	}

	private void printTreeHelper(Node root) {
		if(root==null)
		{
			return;
		}
		printTreeHelper(root.left);
		System.out.print(root.data+" ");
		printTreeHelper(root.right);
	}

}
