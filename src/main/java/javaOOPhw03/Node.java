package javaOOPhw03;


public class Node {


    String currentElem;
    static Node nextElem;


    public Node(Node currentElem, Node nextElem) {
        this.currentElem = currentElem.toString();
        this.nextElem = nextElem;
    }

}
