package zoho_prac;


// here the class node can be in file been used anywhere without declaring this in our 
//cde so dont type again and again in the code of any other problm
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class MyLinkedList {
	Node head=null;
	
	
//	this is one func where insertion is done
	public void insert_1(int value){
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
		
	}
//	here the values have been displayed
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		#here the object creation is done for class linkedlist
		MyLinkedList list=new MyLinkedList();
		list.insert_1(20);
		list.insert_1(40);
		list.insert_1(50);
		list.insert_1(60);
		list.insert_1(70);
		list.display();
	}

}
