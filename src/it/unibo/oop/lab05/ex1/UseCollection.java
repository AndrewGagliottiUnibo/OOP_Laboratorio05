package it.unibo.oop.lab05.ex1;


import java.util.ArrayList;
import java.util.Arrays;

public final class UseCollection {

    private UseCollection() {
    }

    public static void main(final String[] args) {

        final ArrayList<Integer> coll = new ArrayList<>();
        coll.addAll(Arrays.asList(1, 3, 5, 7, 9, 11)); // var-args
        System.out.println(coll); // [1, 3, 5, 7, 9, 11]

        coll.add(13);
        coll.add(15);
        coll.add(15);
        coll.remove(7);
        System.out.println(coll);

        coll.removeAll(Arrays.asList(11, 13, 15));
        System.out.println(coll);
        coll.retainAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(coll);
        System.out.println(coll.contains(3));
        System.out.println(Arrays.toString(coll.toArray()));
    }
}
