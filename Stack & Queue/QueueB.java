import java.util.*;

public class QueueB {
    /*
     * static class Queue {
     * static int arr[];
     * static int size;
     * static int rear;
     *
     * Queue(int n) {
     * arr = new int[n];
     * size = n;
     * rear = -1;
     * }
     *
     * public static boolean isEmpty() {
     * return rear == -1;
     * }
     *
     * public static void add(int data) {
     * if (rear == size - 1) {
     * System.out.println("Queue is Full");
     * return;
     * }
     * rear = rear + 1;
     * arr[rear] = data;
     * }
     *
     * public static int remove() {
     * if (isEmpty()) {
     * System.out.println("Empty queue");
     * return -1;
     * }
     * int front = arr[0];
     * for (int i = 0; i < rear; i++) {
     * arr[i] = arr[i + 1];
     * }
     * rear = rear - 1;
     * return front;
     * }
     *
     * public static int peek() {
     * if (isEmpty()) {
     * System.out.println("Empty queue");
     * return -1;
     * }
     * return arr[0];
     * }
     * }
     */

    /*
     * static class CircularQueue {
     * static int arr[];
     * static int size;
     * static int rear;
     * static int front;
     *
     * CircularQueue(int n) {
     * arr = new int[n];
     * size = n;
     * rear = -1;
     * front = -1;
     * }
     *
     * public static boolean isEmpty() {
     * return rear == -1 && front == -1;
     * }
     *
     * public static boolean isFull() {
     * return (rear + 1) % size == front;
     * }
     *
     * public static void add(int data) {
     * if (isFull()) {
     * System.out.println("Queue is Full");
     * return;
     * }
     * if (front == -1) {
     * front = 0;
     * }
     * rear = (rear + 1) % size;
     * arr[rear] = data;
     * }
     *
     * public static int remove() {
     * if (isEmpty()) {
     * System.out.println("Empty queue");
     * return -1;
     * }
     * int result = arr[front];
     *
     * if (rear == front) {
     * rear = front = -1;
     * } else {
     * front = (front + 1) % size;
     * }
     * return result;
     * }
     *
     * public static int peek() {
     * if (isEmpty()) {
     * System.out.println("Empty queue");
     * return -1;
     * }
     * return arr[front];
     * }
     * }
     */

    /*
     * //Creating a Queue using Linked List
     * static class Node {
     * int data;
     * Node next;
     *
     * Node(int data) {
     * this.data = data;
     * this.next = null;
     * }
     * }
     *
     * public static class Queue {
     * static Node head = null;
     * static Node tail = null;
     *
     * public static boolean isEmpty() {
     * return head == null && tail == null;
     * }
     *
     * public static void add(int data) {
     * Node newNode = new Node(data);
     * if (head == null) {
     * head = tail = newNode;
     * }
     * tail.next = newNode;
     * tail = newNode;
     * }
     *
     * public static int remove() {
     * if (isEmpty()) {
     * System.out.println("Empty Queue");
     * return -1;
     * }
     * int front = head.data;
     * if (tail == head) {
     * head = tail = null;
     * } else {
     * head = head.next;
     * }
     * return front;
     * }
     *
     * public static int peek() {
     * if (isEmpty()) {
     * System.out.println("Empty Queue");
     * return -1;
     * }
     * return head.data;
     * }
     *
     * }
     */

    /*
     * //Queue Using 2 Stacks
     * static class Q2S{
     * static Stack<Integer> s1=new Stack<>();
     * static Stack<Integer> s2=new Stack<>();
     *
     * public static boolean isEmpty(){
     * return s1.isEmpty();
     * }
     *
     * //add-O(n)
     * public static void add(int data){
     * while(!s1.isEmpty()){
     * s2.push(s1.pop());
     * }
     * s1.push(data);
     *
     * while (!s2.isEmpty()) {
     * s1.push(s2.pop());
     * }
     * }
     *
     * //remove-O(1)
     * public static int remove(){
     * if(isEmpty()){
     * System.out.println("Queue Empty");
     * return -1;
     * }
     * return s1.pop();
     * }
     *
     * //peek-O(1)
     * public static int peek(){
     * if(isEmpty()){
     * System.out.println("Queue Empty");
     * return -1;
     * }
     * return s1.peek();
     * }
     * }
     */

    /*
     * public static class S2Q {
     * static Queue<Integer> q1 = new LinkedList<>();
     * static Queue<Integer> q2 = new LinkedList<>();
     *
     * public static boolean isEmpty() {
     * return q1.isEmpty() && q2.isEmpty();
     * }
     *
     * // push-O(1)
     * public static void push(int data) {
     * if (!q1.isEmpty()) {
     * q1.add(data);
     * } else {
     * q2.add(data);
     * }
     * }
     *
     * // pop-O(n)
     * public static int pop() {
     * if (isEmpty()) {
     * System.out.println("Empty STack");
     * }
     * int top = -1;
     * if (!q1.isEmpty()) {
     * while (!q1.isEmpty()) {
     * top = q1.remove();
     * if (q1.isEmpty()) {
     * break;
     * }
     * q2.add(top);
     * }
     * } else {
     * while (!q2.isEmpty()) {
     * top = q2.remove();
     * if (q2.isEmpty()) {
     * break;
     * }
     * q1.add(top);
     * }
     * }
     * return top;
     * }
     *
     * public static int peek() {
     * if (isEmpty()) {
     * System.out.println("Empty STack");
     * }
     * int top = -1;
     * if (!q1.isEmpty()) {
     * while (!q1.isEmpty()) {
     * top = q1.remove();
     * q2.add(top);
     * }
     * } else {
     * while (!q2.isEmpty()) {
     * top = q2.remove();
     * q1.add(top);
     * }
     * }
     * return top;
     * }
     *
     * }
     */

    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        /*
         * CircularQueue q = new CircularQueue(3);
         * q.add(1);
         * q.add(2);
         * q.add(3);
         * System.out.println(q.remove());
         * q.add(4);
         * System.out.println(q.remove());
         * q.add(5);
         * System.out.println();
         * while(!q.isEmpty()){
         * System.out.println(q.peek());
         * q.remove();
         * }
         */

        /*
         * //Queue q = new Queue();
         * //Queue<Integer> q=new LinkedList<>(); // or use ArrayDeque
         * Queue<Integer> q=new ArrayDeque<>();
         * q.add(1);
         * q.add(2);
         * q.add(3);
         * System.out.println(q.remove());
         * q.add(4);
         * System.out.println(q.remove());
         * q.add(5);
         * System.out.println();
         * while (!q.isEmpty()) {
         * System.out.println(q.peek());
         * q.remove();
         * }
         */

        /*
         * //Queue Using Stack taking add() as O(n) others atO(1)
         * Q2S q=new Q2S();
         * q.add(1);
         * q.add(2);
         * q.add(3);
         *
         * while(!q.isEmpty()){
         * System.out.println(q.peek());
         * q.remove();
         * }
         */

        /*
         * // Stack using 2 Queues
         * S2Q s=new S2Q();
         * s.push(1);
         * s.push(2);
         * s.push(3);
         *
         * while (!s.isEmpty()) {
         * System.out.println(s.peek());
         * s.pop();
         * }
         */

        /*
         * //First non repeating character
         * String str="aabccxb";
         * printNonRepeating(str);
         */

        /*
         * //Interleave 2 halves of queue
         * Queue<Integer> q=new LinkedList<>();
         * q.add(1);
         * q.add(2);
         * q.add(3);
         * q.add(4);
         * q.add(5);
         * q.add(6);
         * q.add(7);
         * q.add(8);
         * q.add(9);
         * q.add(10);
         *
         * interLeave(q);
         *
         * while(!q.isEmpty()){
         * System.out.print(q.remove()+" ");
         * }
         * System.out.println();
         */

        /*Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }*/

        
    }
}
