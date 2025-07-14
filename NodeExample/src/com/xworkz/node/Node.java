package com.xworkz.node;

public class Node {

    private String value;
    private Node next;

    public Node(String value){
        this.value=value;
    }

    public static void main(String[] args) {

    Node node1=(new Node("100"));
    Node node2=(new Node("200"));
    Node node3=(new Node("300"));
    node1.next=node2;
    node2.next=node3;

    Node currentNode=node1;
    while(currentNode!=null){
        System.out.print("==>"+currentNode.value);
        currentNode=currentNode.next;
    }
    }
}
