import java.util.Scanner;

import org.w3c.dom.Node;

public class SLL{


    private node head;
    private node tail;
    private int size;

    public SLL(){
        this.size = 0;
    }

    //create a linked list 
    public void create_sll(){
        System.out.println("Enter the number of the nodes : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        head = null;
        node temp = head;

        for(int i = 0; i<num; i++){
            System.out.println("Enter value for node"+(i+1)+ " : ");
            int val = input.nextInt();
            node node = new node(val);

            if(head == null){
                head = node;
                temp = head;
            }
            //node.next = null;
            else{
                temp.next = node;
                temp = node;
            }

        }
    
    }

    //Insert element at the first position
    public void insert_into_first(int val){
        node node = new node(val);
        node.next = head;
        head = node;

        if(tail == null ){
            tail = head;
        }

        size++;

    }

    //insert element at the last position using the tail
    public void insertLAST_tail(int val){
        node node = new node(val);
        if(tail == null){
            insert_into_first(val);
        }
        tail.next = node;
        tail = node;

        size++;
    }

    //insert element at the head position using the head
    public void insertLast_head(int val){
        node node = new node(val);
        node temp = new node(val);
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }

    //insert at any index
    public void insert_any(int val, int index){
        

        if(index == 0){
            insert_into_first(val);
            return;
        }
        if(index == size){
            insertLast_head(val);
        }


            node temp = head;
            for(int i = 1; i<index; i++){
                temp = temp.next;
            }
            node node = new node(val, temp.next);
            temp.next = node;
            size ++;
    }

    //delete element from first
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //delete element from last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    //delete from a given index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    //find a node from a given value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //return a node from an indexl
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    //display the linked list
    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    
    private class node{
        private int val;
        private node next;

        public node(int val){
            this.val = val;
        }

        public node(int val, node next){
            this.val = val;
            this.next = next;
        }

    }

        public static void main(String[] args) {
        SLL list = new SLL();


        list.create_sll();
        list.display();
        list.insert_any(78, 2);
        list.display();
        list.insert_into_first(2);
        list.insert_into_first(4);
        list.insert_into_first(5);
        list.display();
        list.insertLast_head(0);
        list.display();
    }

}


