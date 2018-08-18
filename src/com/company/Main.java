package com.company;

public class Main {

    public static void main(String[] args) {

        Main g = new Main();

        g.insertVertex("Zero");
        g.insertVertex("One");
        g.insertVertex("Two");
        g.insertVertex("Three");
        g.insertVertex("Four");
        g.insertVertex("Five");
        g.insertVertex("Six");
        g.insertVertex("Seven");
        g.insertVertex("Eight");

        g.insertEdge("Zero","Three",2);
        g.insertEdge("Zero", "One", 5);
        g.insertEdge("One", "Four", 8);
        g.insertEdge("Two", "Four", 2);
        g.insertEdge("Two", "One", 3);
        g.insertEdge("Two", "Five", 4);
        g.insertEdge("Three", "Four", 7);
        g.insertEdge("Three", "Six", 8 );
        g.insertEdge("Four", "Five", 9);
        g.insertEdge("Four", "Seven", 4);
        g.insertEdge("Five", "One", 6);
        g.insertEdge("Six", "Seven", 9);
        g.insertEdge("Seven", "Three", 5);
        g.insertEdge("Seven", "Five", 3);
        g.insertEdge("Seven", "Eight", 5);
        g.insertEdge("Eight", "Five", 3);

        g.findPaths("Zero");




    }
}