package com.company.lab2;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> elements = new ArrayList<Integer>();
    private Integer limit = null;

    public Queue() {
        System.out.println("Queue initialized without size limit ");
    }

    public Queue(Integer limit) {
        System.out.println("Queue initialized with a size limit of " + limit + " elements");
        this.limit = limit;
    }

    public void push(Integer element) {
        if(limit == null) {
            elements.add(element);
            System.out.println("Element added");
        } else {
            if(elements.size()<limit) {
                elements.add(element);
                System.out.println("Element added");
            } else {
                System.out.println("Maximum queue size exceeded, element not added");
            }
        }
    }

    public void pop() {
        elements.remove(elements.size()-1);
        System.out.println("Element removed! ");
    }

    public void show(){
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println("");
    }

    public void state() {
        if (limit==null) {
            System.out.println("Queue is never full");
        } else {
            if(this.elements.size()==limit) {
                System.out.println("Queue full");
            } else {
                int free = limit - elements.size();
                System.out.println("Queue is not full, it has " + free + " more free spaces");
            }
        }
    }

    public Integer getLimit() {
        return limit;
    }
}
