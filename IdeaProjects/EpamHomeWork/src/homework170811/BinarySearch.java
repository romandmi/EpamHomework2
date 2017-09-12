package homework170811;


import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

         final int MAX = 1000000;

         long start = System.currentTimeMillis();
         long finish = System.currentTimeMillis();

        long startTotal = System.currentTimeMillis();
        long finishTotal = System.currentTimeMillis();



        startTotal = System.currentTimeMillis();

        start = System.currentTimeMillis();

        LinkedList<A> linkedList = new LinkedList<>();
        for (int i = 0; i < MAX; i++) {
            linkedList.add(new A());
        }
        finish = System.currentTimeMillis();

        System.out.println("linkedlist creating and fill = " + (finish - start));


        start = System.currentTimeMillis();
        Collections.sort(linkedList);
        finish = System.currentTimeMillis();

        System.out.println("linkedlist sort = " + (finish - start));


        start = System.currentTimeMillis();
        int a = Collections.binarySearch(linkedList, new A());
        finish = System.currentTimeMillis();

        System.out.println("linkedlist binarysearch = " + (finish - start));

        finishTotal = System.currentTimeMillis();
        System.out.println("linkedlist total time  = " + (finishTotal - startTotal));
        System.out.println();



        startTotal = System.currentTimeMillis();

        start = System.currentTimeMillis();

        ArrayList<A> arrayList = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            arrayList.add(new A());
        }

        finish = System.currentTimeMillis();

        System.out.println("Arraylist creating and fill = " + (finish - start));



        start = System.currentTimeMillis();

        Collections.sort(arrayList);

        finish = System.currentTimeMillis();

        System.out.println("Arraylist sort = " + (finish - start));



        start = System.currentTimeMillis();

        int b = Collections.binarySearch(arrayList, new A());
        
        finish = System.currentTimeMillis();

        System.out.println("Arraylist binarysearch = " + (finish - start));

        finishTotal = System.currentTimeMillis();
        System.out.println("Arraylist total time  = " + (finishTotal - startTotal));
        System.out.println();



        startTotal = System.currentTimeMillis();

        start = System.currentTimeMillis();

        Set<A> treeSet = new TreeSet<>();
        for (int i = 0; i < MAX; i++) {
            treeSet.add(new A());
        }

        finish = System.currentTimeMillis();

        System.out.println("TreeSet creating and fill = " + (finish - start));



        start = System.currentTimeMillis();

        boolean c = treeSet.contains(new A());

        finish = System.currentTimeMillis();

        System.out.println("TreeSet search = " + (finish - start));

        finishTotal = System.currentTimeMillis();
        System.out.println("TreeSet total time  = " + (finishTotal - startTotal));

    }


}
