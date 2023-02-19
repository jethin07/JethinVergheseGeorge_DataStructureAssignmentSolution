package com.greatlearning;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FloorScheduling {

    public void scheduling(int numberOfFloors, int[] floorsDelivered){
        int totalFloors = numberOfFloors;

        System.out.println("Sequence of construction is as follows");

        PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

        int[] tempArray = new int[totalFloors];
        int max = totalFloors;
        System.out.println();

        for (int i = 0; i < totalFloors; i++) {

            System.out.println("Day : "+(i+1));
            tempArray[i] = floorsDelivered[i];
            queue.add(tempArray[i]);

            while (!queue.isEmpty() && queue.peek() == max) {
                System.out.print(queue.poll() + " ");
                max--;
            }
            System.out.println();
        }
    }
}
