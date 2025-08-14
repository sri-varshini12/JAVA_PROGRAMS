package zoho_prac;

public class Reverse {
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
	
	public void display(Node temp) {
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void reverse() {
		Node temp=head;
		Node prev=null;
		while(temp!=null) {
			Node front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
		display(prev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse rev=new Reverse();
		rev.insert_1(10);
		rev.insert_1(20);
		rev.insert_1(30);
		rev.insert_1(40);
		rev.insert_1(50);
		rev.reverse();

	}

}
