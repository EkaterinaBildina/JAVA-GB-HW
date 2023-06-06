package javaOOPhw03;

import javaOOP03.User;

import static javaOOPhw03.Node.*;
import static javaOOPhw03.Realization.*;

public class Main {

    public static void main(String[] arg){

        Realization myLinkedList = new Realization();
        myLinkedList.addElem("Kate");
        myLinkedList.addElem("Elena");
        myLinkedList.addElem("Alexander");



        for (String elem : myLinkedList) {
           if (elem != null){
               System.out.printf(elem + Node.nextElem.toString());
           }
            System.out.println("null");
        }


    }
}
