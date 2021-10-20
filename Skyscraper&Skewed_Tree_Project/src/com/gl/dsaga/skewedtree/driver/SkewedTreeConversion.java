package com.gl.dsaga.skewedtree.driver;

// Node Class Code
class Node
{
	int data;
	Node left, right;

	Node(int val)
	{
		data = val;
		left = right = null;
	}
}

public class SkewedTreeConversion {
	
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;
	
	static void flattenBTToSkewed(Node root)
	{
	
		if(root == null)
		{
			return;
		}
		flattenBTToSkewed(root.left);
		Node rightNode = root.right;
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		flattenBTToSkewed(rightNode);

	}

	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);	
	}
	
	//Drivers Code
	public static void main(String[] args) {
		
		 SkewedTreeConversion tree = new SkewedTreeConversion();
		 tree.node = new Node(50);
		 tree.node.left = new Node(30);
		 tree.node.right = new Node(60);
		 tree.node.left.left = new Node(10);
		 tree.node.right.left= new Node(55);

		flattenBTToSkewed(node);
		traverseRightSkewed(headNode);
		

	}
}
