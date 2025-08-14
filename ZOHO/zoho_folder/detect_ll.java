package zoho_prac;
//code runs fine dont worry but the error


public class Detect_ll {
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
	
	public void detect_loop() {
		Node slow_ptr=head;
		Node fast_ptr=head;
		
		while(fast_ptr!=null && fast_ptr.next!=null) {
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			if(slow_ptr==fast_ptr) {
				System.out.print("True");
				return;
			}
			else {
				System.out.print("false");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		#here the object creation is done for class linkedlist
		Detect_ll list=new Detect_ll();
		list.insert_1(20);
		list.insert_1(40);
		list.insert_1(50);
		list.insert_1(60);
		list.insert_1(70);
		list.detect_loop();
	}

}
