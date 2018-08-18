package com.company;

public class Vertex {
    int status;
    int predecessor;
    int pathLength;

    Vertex (String name){
        this.name = name;
    }
    public String toString()
    {
        return name;
    }
}
