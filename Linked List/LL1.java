import java.util.*;

@SuppressWarnings("unused")
public class LL1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // O(1)

        // 1. Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. newNode next=head
        newNode.next = head;// link

        // 3. head=newNode
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        // 1. Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. tail.next= newNode
        tail.next = newNode;

        // 3. tail = newNode
        tail = newNode;
    }

    public void addIndex(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // key not found;
    }

    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int helper(Node head, int key) { // O(n) and also Space Complexity O(n) due to call stack
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void removeNthFromLast(int n) {
        // calculate size of Linked List
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) { // helper for Palindrome
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// this is the mid node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 Find Mid
        Node midNode = findMid(head);

        // step2 Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;

        // step3 Check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;// last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        //  find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LL1 ll = new LL1();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        /*
         * ll.print();
         * ll.addFirst(1);
         * ll.print();
         * ll.addFirst(2);
         * ll.print();
         * ll.addLast(3);
         * ll.print();
         * ll.addLast(4);
         * ll.print();
         * ll.addIndex(2, 9);
         * ll.print();
         * System.out.println(ll.size);
         * ll.removeFirst();
         * ll.print();
         * System.out.println(ll.size);
         * ll.removeLast();
         * ll.print();
         * System.out.println(ll.size);
         * System.out.println(ll.itrSearch(3));
         * System.out.println(ll.itrSearch(10));
         * ll.print();
         * ll.reverse();
         * ll.print();
         * ll.removeNthFromLast(2);
         * ll.print();
         * ll.addLast(1);
         * ll.addLast(2);
         * ll.addLast(1);
         * //ll.addLast(1);
         *
         * System.out.println(ll.checkPalindrome());
         */

        // Cycle checking and Removal in Linked List
        /*
         * head = new Node(1);
         * Node temp = new Node(2);
         * head.next = temp;
         * head.next.next = new Node(3);
         * head.next.next.next = temp;
         * System.out.println(ll.isCycle());
         * removeCycle();
         * System.out.println(ll.isCycle());
         * ll.print();
         */

        // Merge Sort
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addFirst(9);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
    }
}

/*
 * Linked List
 *
 * // Structure of a Linked List
 * class Node{
 * int data;
 * Node next;
 * public Node(int data){
 * this.data=data;
 * this.next=NULL;
 * }
 * }
 *
 * // Add First
 * 1. Create new node
 * 2. new node's next=head
 * 3. head=new Node
 *
 * //Add Last
 * 1. Create new node
 * 2. tail.next=newNode
 * 3. tail=newNode
 *
 */

/*
 * Check if LL it's Palindrome
 *
 * Use slow fast Pointer Approach
 * Slow=head//+1(turtle)
 * Fast=head//+2(rabbit)
 * This pointer approach will be used to find the middle element
 */

/*
 * Floyd's cycle finding algorithm:
 *
 * Use slow fast pointer approach
 * 0 moves -> slow =fast
 * 1 moves -> slow =fast+1
 * 2 moves -> slow =fast+2
 * 3 moves -> slow =fast+3
 * ....
 * n moves -> if slow == fast then cycles exists
 * or slow+fast= size
 *
 * slow=head
 * fast=head
 *
 * while(fast!=null && fast.next!=null){
 * slow+=1
 * fast+=2
 * (slow==fast){
 * return true;
 * }
 * }
 * return false
 */

/*
 * Removing a Cycle in a Linked List
 *
 * 1. Detect Cycle
 * 2. a) slow=fast=head;
 * b) prev=null
 * c) while(slow==fast){
 * slow*=1,
 * prev=fast,
 * fast+=1
 * }
 * prev.next=null //last node
 *
 */
