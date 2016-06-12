package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Select the options\n");
        System.out.println("1-Add teacher\n2-Remove teacher\n3-Display teacher");
        System.out.println("4-Add student\n5-Remove student\n6-Display student");

        int i = (int) System.in.read();

        switch(i)
        {
            case 1:
            {
                System.out.println("Add teacher");
                break;
            }
            case 2:
            {
                System.out.println("Remove teacher");
                break;
            }
            case 3:
            {
                System.out.println("Display teacher");
                break;
            }
            case 4:
            {
                System.out.println("Add student");
                break;
            }
            case 5:
            {
                System.out.println("Remove student");
                break;
            }
            case 6:
            {
                System.out.println("Display student");
                break;
            }
            default:
            {
                System.out.println("error");
            }
        }


    }


}
