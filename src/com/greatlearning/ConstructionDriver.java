package com.greatlearning;

import java.io.IOException;
import java.util.Scanner;

    public class ConstructionDriver {

        public static void main(String args[]) throws IOException {

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the targeted number of floors for constructing the building : ");
            int totalFloors = sc.nextInt();

            if (totalFloors>0){
             int[] floors= new int[totalFloors];

                for(int i=0; i<totalFloors; i++)
                {
                    System.out.println("Enter the floor size delivered on day "+ (i+1) + ": ");
                    floors[i] = sc.nextInt();
                }
                System.out.println();

             FloorScheduling fs = new FloorScheduling();
             fs.scheduling(totalFloors, floors);
            }
            else
            {
                System.out.println("Minimum one floor is required for constructing the building..");
            }
        }
    }

