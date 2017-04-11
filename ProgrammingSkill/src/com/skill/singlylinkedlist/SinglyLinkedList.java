package com.skill.singlylinkedlist;

public class SinglyLinkedList {
	protected Node start;
	protected Node end;
	public int size;

	/*  Constructor  */
    public SinglyLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
	
	/* Constructor */
	public SinglyLinkedList(Node mStart, Node mEnd, int mSize) {
		start = mStart;
		end = mEnd;
		size = mSize;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return start == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element at beginning */
	public void insertAtStart(int val) {
		Node nPtr = new Node(val, null);
		size++;
		if (start == null) {
			start = nPtr;
			end = start;
		} else {
			nPtr.setLink(start);
			start = nPtr;
		}
	}

	/* Function to insert an element at end */
	public void insertAtEnd(int val) {
		Node nPtr = new Node(val, null);
		size++;
		if (start == null) {
			start = nPtr;
			end = start;
		} else {
			end.setLink(nPtr);
			end = nPtr;
		}
	}

	/* Function to insert an element at position */
	public void insertAtPos(int val, int pos) {
		Node nPtr=new Node(val, null);
		Node ptr=start;
		pos=pos-1;
		for(int i=1;i<size;i++){
			if(i==pos){
				Node tempNode=ptr.getLink();
				nPtr.setLink(tempNode);
				ptr.setLink(nPtr);
				break;
				
			}
			ptr = ptr.getLink();
		}
		size++;
	}
	
	/*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    { 
    	if(pos==1){
    		start=start.getLink();
    		size--;
    		return;
    	}else {
    		Node ptr = start;
    		pos=pos-1;
			for(int i=1;i<size;i++){
				if(pos==i){
					Node temp=ptr.getLink();
					temp = temp.getLink();
	                ptr.setLink(temp);
	                break;
				}
				ptr = ptr.getLink();
			}
			size-- ;
		}
    }
    
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
