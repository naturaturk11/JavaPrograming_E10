package day49_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer>priorityQueue=new ArrayDeque<>() ;
        priorityQueue.addAll(Arrays.asList(10,20,80,60,40));

        System.out.println("priorityQueue = " + priorityQueue);


        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);


        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);


        linkedList.poll();
        System.out.println("linkedList = " + linkedList);
        linkedList.poll();
        System.out.println("linkedList = " + linkedList);


        System.out.println("................................");

       // priorityQueue.get(1)
        System.out.println(((LinkedList<Integer>) linkedList).get(2));




    }
}
