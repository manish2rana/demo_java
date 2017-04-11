package com.skill.doublylinkedlist;

public class DoublyLinkedList {
	protected Node start;
	protected Node end;
	public int size;

	/* Constructor */
	public DoublyLinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return start == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert element at beginning */
	public void insertAtStart(int val) {
		Node nptr = new Node(val, null, null);
		if (start == null) {
			start = nptr;
			end = nptr;
		} else {
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			start = nptr;
		}
		size++;
	}

	/* Function to insert element at end */
	public void insertAtEnd(int val) {
		Node nptr = new Node(val, null, null);
		if (start == null) {
			start = nptr;
			end = nptr;
		} else {
			nptr.setLinkPrev(end);
			end.setLinkNext(nptr);
			end = nptr;
		}
		size++;
	}

	/* Function to insert element at position */
	public void insertAtPos(int val, int pos) {

		Node nptr = new Node(val, null, null);
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (pos == i) {
				Node temp = ptr.getLinkNext();
				nptr.setLinkNext(temp);
				temp.setLinkPrev(nptr);
				ptr.setLinkNext(nptr);
				nptr.setLinkPrev(ptr);
				break;
			}
			ptr = ptr.getLinkNext();
		}
		size++;
	}

	/* Function to delete node at position */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			if (size == 1) {
				start = null;
				end = null;
				size = 0;
				return;
			} else {
				Node temp = start.getLinkNext();
				temp.setLinkPrev(null);
				start.setLinkNext(null);
				start = temp;
				size--;
			}
		} else {
			Node ptr = start.getLinkNext();
			pos=pos-1;
			for(int i=1;i<size;i++){
				if(pos==i){
					Node tempNext=ptr.getLinkNext();
					Node tempPrev=ptr.getLinkPrev();
					tempPrev.setLinkNext(tempNext);
					tempNext.setLinkPrev(tempPrev);
					size--;
				}
				ptr=ptr.getLinkNext();
			}
			
		}
	}

	/* Function to display status of list */
	public void display() {
		System.out.print("\nDoubly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLinkNext() == null) {
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData() + " <-> ");
		ptr = start.getLinkNext();
		while (ptr.getLinkNext() != null) {
			System.out.print(ptr.getData() + " <-> ");
			ptr = ptr.getLinkNext();
		}
		System.out.print(ptr.getData() + "\n");
	}
}
