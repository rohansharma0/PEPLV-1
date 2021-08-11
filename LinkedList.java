class Node{
    int data;
    Node next;
}

public class LinkedList {
    Node head;
    Node tail;
    int size;


    public int size(){
        return size;
    }

    public void display(){

        Node temp =head;

        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }

    public void addFirst(int val) {

        Node temp = new Node();

        temp.data = val;

        if(size == 0){
            head =tail = temp;
            temp.next = null;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addLast(int val){

        Node nNode = new Node();
        nNode.data = val;
        nNode.next = null;

        if(size == 0){
            head = tail = nNode;

        }else{
            tail.next = nNode;
            tail = nNode;
        }
        size++;

    }


    public void addAt(int idx, int val){

        if(idx < 0 || idx > size){
            System.out.println("Invalid arguments");
        }else if(idx == 0){
            addFirst(val);
        }else if(idx == size){
            addLast(val);
        }else{

            Node node = new Node();
            node.data = val;

            Node temp = head;
            for(int i = 0 ;i < idx -1 ;i++){
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void removeFirst(){

        if(size == 0){
            System.out.println("List is empty");
        }else if(size == 1){
            head = tail = null;
            size = 0;
        }else{
            head = head.next;
            size--;
        }

    }
    public void removeLast(){

        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {

            Node temp = head;
            for(int i = 0 ; i< size -2 ; i++){
                temp = temp.next;
            }

            tail = temp;
            temp.next = null;

            size--;
        }
    }
    public void removeAt(int idx) {

        if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == size -1) {
            removeLast();
        } else {

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            size--;
        }
    }

    public int getFirst(){

        if(size == 0){

            System.out.println("List is empty");
            return -1;

        }else{
            return head.data;
        }

    }
    public int getLast(){
        if(size == 0){

            System.out.println("List is empty");
            return -1;

        }else{
            return tail.data;
        }

    }
    public int getAt(int idx){
        // write your code here
        if(size == 0){

            System.out.println("List is empty");
            return -1;

        }else if(idx < 0 || idx >= size){

            System.out.println("Invalid arguments");
            return -1;

        }else{
            Node temp = head;

            for(int i = 0;i < idx ;i++){

                temp = temp.next;
            }

            return temp.data;
        }

    }

    private Node getNodeAt(int idx){

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void reverseDI() {

        int li = 0;
        int ri = size - 1;

        while(li < ri){

            Node node1 = getNodeAt(li);
            Node node2 = getNodeAt(ri);

            int temp = node1.data;
            node1.data = node2.data;
            node2.data = temp;


            li++;
            ri--;
        }


    }
    public void reversePI() {

        Node prev = null;
        Node curr = head;

        while(curr != null){

            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        Node temp = head;
        head = tail;
        tail = temp;

    }

    public int kthFromLast(int k){

        Node s = head , f = head;

        while(k-- > 0){
            f = f.next;
        }

        while (f.next != null){
            s = s.next;
            f = f.next;
        }

        return s.data;
    }

    public int mid(){

        Node s = head , f = head;

        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }

        return  s.data;

    }
}
