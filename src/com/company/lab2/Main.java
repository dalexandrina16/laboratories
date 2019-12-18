package com.company.lab2;

public class Main {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3);
        Box b3 = new Box(3, 6, 5);

        Queue q1 = new Queue(3);
        q1.push(3);
        q1.push(2);
        q1.push(1);
        q1.push(0);
        q1.state();
        q1.show();
        q1.pop();
        q1.show();
        q1.state();

        Queue q2 = new Queue();
        q2.push(11);
        q2.push(12);
        q2.push(33);
        q2.show();
        q2.state();

    }
}
