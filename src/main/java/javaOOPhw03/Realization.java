package javaOOPhw03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Realization implements Iterable<Node> {

    private static List<Node> myLinkedList = new ArrayList<>();

    public List<Node> addElem(String elem) {
        int index = 0;
        String currentElem = null;
        String nextElem;

        if (currentElem == null) {
            currentElem = elem;
            myLinkedList.add(currentElem);
        }
        nextElem = elem;
        index++;
        return myLinkedList;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<>() {
            Node elemNow = currentElem;

            @Override
            public boolean hasNext() {
                return elemNow != null;
            }

            @Override
            public Node next() {

                return myLinkedList.get(currentElem()).get(nextElem());
            }
        };
    }
}





