package zoho_prac;

public class Middle_ll {
	Node head=null;
	
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
	
	public void middle_ele() {
		Node slow_ptr=head;
		Node fast_ptr=head;
		
		while(fast_ptr!=null && fast_ptr.next!=null) {
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
		}
		System.out.print(slow_ptr.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		#here the object creation is done for class linkedlist
		Middle_ll list=new Middle_ll();
		list.insert_1(20);
		list.insert_1(40);
		list.insert_1(50);
		list.insert_1(60);
		list.insert_1(70);
		list.insert_1(100);
		list.middle_ele();
	}

}
