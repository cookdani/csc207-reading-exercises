public class Tree<T extends Comparable<T>> {
	
	public static class Node<T> {
		public Node<T> left;
		public Node<T> right;
		public T value;
		
		public Node (Node<T> left, Node<T> right, T value){
			this.left = left;
			this.right = right;
			this.value = value;
		}
	}
	
	public Node<T> root;
	public Tree(){
		this.root = null;
	}
	public int size(){
		return 0;
	}
	public static void printInOrder(Node<Integer> root){
		if (root.left != null){
			printInOrder(root.left);
		}
		System.out.println(root.value);
		if (root.right != null){
			printInOrder(root.right);
		}
	}
	public static void main(String[] args){
		Node<Integer> newNode = new Node<Integer>(null, null, 5);
		Node<Integer> newNode2 = new Node<Integer>(null, null, 7);
		Node<Integer> newNode3 = new Node<Integer>(newNode, newNode2, 6);
		printInOrder(newNode3);
	}
}
