package com.company;

public class Main {
    public static void main(String[] args) {

        Box box_1 = new Box();
        Box box_2 = new Box(25);
        Box box_3 = new Box(5, 25, 33);

        System.out.println( "area = " + box_1.calculateA() + " volume = " + box_1.calculateV());
        System.out.println( "area = " + box_2.calculateA() + " volume = " + box_2.calculateV());
        System.out.println( "area = " + box_3.calculateA() + " volume = " + box_3.calculateV());

        // part 2
        System.out.println( "====================part 2====================");
        Queue queue1 = new Queue();
        queue1.push(5);
        queue1.push(25);
        queue1.push(125);
       //queue1.pop();
        System.out.println("first queue " + queue1.list);

        Queue queue2 = new Queue(1000);
        queue2.push(5);
        queue2.push(25);
        queue2.push(125);
        //queue2.pop();
        System.out.println("second queue " + queue2.list);

    }


}