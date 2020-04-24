package hello;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MiddleNode {

	ListNode root;
	
	public static void main(String[] args) {
		MiddleNode m = new MiddleNode();
		
		m.root = new ListNode(1);
		m.root.next = new ListNode(2);
		m.root.next.next = new ListNode(3);
		m.root.next.next.next = new ListNode(4);
		m.root.next.next.next.next = new ListNode(5);
		m.root.next.next.next.next.next = new ListNode(6);
		
		ListNode res = m.middleNode(m.root);
		System.out.println(res.val);
	}

	public ListNode middleNode(ListNode head) {
		ListNode[] arr = new ListNode[100];
		int i = 0;
		while(head != null) {
			arr[i++] = head;
			head = head.next;
		}
		return arr[i / 2];
	}

}
