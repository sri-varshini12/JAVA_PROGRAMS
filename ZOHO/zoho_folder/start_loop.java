package zoho_prac;
//no need of display func becuz their no need to print all those values
public class Start_loop {
Node head=null;
	 
	public void insert_1(int value) {
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
	
	public boolean find_start() {
		Node slow_ptr=head;
		Node fast_ptr=head;
		while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null) {
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			if(slow_ptr==fast_ptr) {
				slow_ptr=head;
				while(slow_ptr!=fast_ptr) {
					slow_ptr=slow_ptr.next;
					fast_ptr=fast_ptr.next;
				}
				System.out.println("Loop starts at node with value: " + slow_ptr.data);
				return true;
			}
		}
		System.out.println("NO LOOP");
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start_loop strt=new Start_loop();
		strt.insert_1(10);
		strt.insert_1(20);
		strt.insert_1(30);
		strt.insert_1(40);
		strt.head.next.next.next.next=strt.head.next.next;
		strt.find_start();
	}

}
