public class LinkedList {
    // Node Creation :
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creation of HeadNode of type Node
    public static Node head;
    // Creation of TailNode of type Node
    public static Node tail;
    // Creation of static variable to calucate size of linkedList :
    static int size; // Java initialise it with 0 itself

    // Adding Node is at 1st position :
    public void addFirst(int data) {
        // 1. Create node
        Node newNode = new Node(data);

        // Update size
        size++;

        // If Node is empty :
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. newNode's next = head
        newNode.next = head;
        // 3. Head = newNode
        head = newNode;
    }

    // Adding Node at last :
    public void addLast(int data) {

        // Update size
        size++;

        // 1.Create Node
        Node newNode = new Node(data);

        // If node is empty :
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        // 2. Tail's next = newNode
        tail.next = newNode;

        // 3. newNode's next = null
        tail = newNode;
    }

    // Add at middle or wherever we want :
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        // 1. Create node
        Node newNode = new Node(data);

        // Update size
        size++;

        // Creating a temperory(Temp) node type variable to traverse till the previous
        // node of targated index
        Node temp = head;

        // Traverse till previous node of targated index
        int i = 0; // i for traversing indices
        while (i < index - 1) { // Previous to previous node of Linkedlist
            temp = temp.next; // Temp is now Previous node
            i++; // i is the previous index of target index
        }

        // 2. Link New node to upcoming i.e. temp.next
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void print() { // O(n)
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int removeFirst() {
        if (size == 0) {
            // size change not possible because remove operation can't be performed
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE; // returning invalid value
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linkedlist is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        // prev : i = size-2 i.e. second last index
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){  //O(n)
        Node temp = head;
        int index=0;
        while(temp.next != null){
            if (temp.data==key) {
                return index;
            } 
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public int recSearch(int key ,Node head){ //Recursive Search
        if(head.next==null){
            return -1;
        }
        else if(head.data==key){
            return 0;
        }
        int index = recSearch(key, head.next);
        return index+1 ;
    }
     
    public void reverse(){ //Important and Classical Question
        Node prev = null;
        Node curr = tail = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList object = new LinkedList();
        object.addFirst(2);
        object.addFirst(1);
        object.addLast(4);
        object.addLast(5);
        object.add(2, 3);
        object.print();
        // System.out.println(object.size);
        object.removeFirst();
        object.print();
        object.removeLast();
        object.print();
        System.out.println("Size is : "+object.size);
        System.out.println("Found at index : "+object.itrSearch(3)); 
        object.addFirst(1);
        object.addLast(5);
        object.addLast(6);
        object.print();
        System.out.println(object.recSearch(50, head));
        object.reverse();
        object.print();

    }
}
