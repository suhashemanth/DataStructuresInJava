package bst;

public class Client {
	
	public static void main(String[] args) {
		BST bst=new BST();
		bst.insert(5);
		bst.insert(2);
		bst.insert(7);
		bst.insert(3);
		bst.insert(1);
		bst.insert(6);
		bst.insert(8);
		bst.printTree();
		System.out.println();
		System.out.println(bst.isPresent(10));
	}

}

