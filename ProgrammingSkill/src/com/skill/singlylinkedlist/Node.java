package com.skill.singlylinkedlist;


public class Node {
	protected int data;
	protected Node link;

	/* Constructor */
	public Node() {
		data = 0;
		link = null;
	}

	/* Constructor */
	public Node(int mData, Node mLink) {
		data = mData;
		link = mLink;
	}

	/* Function to set link to next Node */
	public void setLink(Node n) {
		link = n;
	}

	/* Function to set data to current Node */
	public void setData(int d) {
		data = d;
	}

	/* Function to get link to next node */
	public Node getLink() {
		return link;
	}

	/* Function to get data from current Node */
	public int getData() {
		return data;
	}
}
