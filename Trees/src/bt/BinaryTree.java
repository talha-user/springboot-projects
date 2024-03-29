package bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
  class Node {
	  int data;
	  Node left;
	  Node right;
	  
	  Node(int data){
		  this.data = data;
		  this.left = null;
		  this.right = null;
	  }
  }
  
  static Scanner sc = new Scanner(System.in);
  public Node buildBinaryTree(Node root){
	  int data;
	  System.out.println("Enter the data:");
	  data = sc.nextInt();
	  root = new Node(data);
	  if(data == -1)
		  return null;
	  
	  
	  System.out.println("Enter left value of "+root.data+":");
	  root.left = buildBinaryTree(root.left);
	  System.out.println("Enter right value of "+root.data+":");
	  root.right = buildBinaryTree(root.right);
	  
	  return root;
  }
  
  public void preOrderTraversal(Node root) {
	  if(root == null)
		  return;
	  System.out.print(root.data);
	  preOrderTraversal(root.left);
	  preOrderTraversal(root.right);
	  
  }
  public void postOrderTraversal(Node root) {
	  if(root == null)
		  return;
	  postOrderTraversal(root.left);
	  postOrderTraversal(root.right);
	  System.out.print(root.data);
	  
  }
  public void inOrderTraversal(Node root) {
	  if(root == null)
		  return;
	  inOrderTraversal(root.left);
	  System.out.print(root.data);
	  inOrderTraversal(root.right);
	  
  }
  public void levelOrderTraversal(Node root) {
	  
	  Queue<Node> q = new LinkedList<Node>();
	  q.offer(root);
	  
	  //q.offer(null);
	  while(!q.isEmpty()) {
		  Node node = q.element();
		  System.out.print(node.data);
		  q.remove();
		  if(q.isEmpty()) {
			  System.out.println();
		  }
		  if(node.left!=null) {
			  q.offer(node.left);
		  }
		  if(node.right!=null) {
			  q.offer(node.right);
		  }
		  
	  }
  }
  public  int countLeafNodes(Node root) {
	  if(root==null)
		  return 0;
	  
	  if(root.left==null && root.right==null)
		  return 1;
	  else
		  
	  return countLeafNodes(root.left)+countLeafNodes(root.right);
	  
	  
  }
  
  public static void main(String[] args) {
	  Node root = null;
	  
	  BinaryTree bt = new BinaryTree();
	  Node root1 = bt.buildBinaryTree(root);
	  System.out.println("pre-order traversal:");
	  bt.preOrderTraversal(root1);
	  
	  System.out.println("\npost-order traversal:");
	  bt.postOrderTraversal(root1);
	  
	  System.out.println("\nin-order traversal:");
	  bt.inOrderTraversal(root1);
	  System.out.println("\nLevel order traversal:");
	  bt.levelOrderTraversal(root1);
	  System.out.println(bt.countLeafNodes(root1));
  }
  
}
