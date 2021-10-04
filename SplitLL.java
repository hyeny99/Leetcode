
public class SplitLL {
	public ListNode[] splitListToParts(ListNode head, int k) {
		ListNode[] list = new ListNode[k];
		ListNode current = head;
		int size = 0;
		while (current != null) {
			current = current.next;
			size++;
		}

		current = head;
		if (k >= size) {
			for (int i = 0; i < k; i++) {
				if (i >= size) {
					list[i] = null;
				}
				
				else {
					list[i] = current;
					ListNode temp = current.next;
					current.next = null;
					current = temp;
				}
			}

		}

		else {
			int quotient = size / k;
			if(size % k != 0) {
				quotient++;
			}
			
			int i = 0;
			int j = 0;
			while(i < size) {
				int count = 0;
				list[j] = current;
				while(count < quotient && i < size) {
					current = current.next;
					count++;
					i++;
				}
				ListNode temp = current.next;
				current.next = null;
				current = temp;
				j++;		
			}

		}
		
		return list;
	}
	
	public static void main(String[] args) {
		SplitLL ll = new SplitLL();
		ListNode head = new ListNode();
		int i = 1;
		ListNode current = head;
		while(i < 3) {
			current.val = i;
			current = current.next;
		}
		
		ListNode[] list = ll.splitListToParts(head, 3);
		for(int j = 0; j < list.length; j++) {
			System.out.println(list[j]);
		}
	}
	
}
