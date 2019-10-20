package com.company;

public class Main {
// part1
    public static void main(String[] args) {
	    Monitor monitor1 = new Monitor("Samsung", "Black", 30, 50, "1080p" );

	    monitor1.setName("Apple");
	    monitor1.getName();

	    monitor1.setColor("White");
	    monitor1.getName();

	    monitor1.setHeight(20);
	    monitor1.getHeight();

	    monitor1.setWidth(65);
	    monitor1.getHeight();

	    monitor1.setResolution("4K");
	    monitor1.getResolution();

	    Monitor monitor2 = new Monitor("LG", "Pink", 45, 60, "1440p");

		if (monitor1.getHeight() > monitor2.getHeight()) {
			System.out.println("Monitor " + monitor1.getName() + " is higher than  Monitor " + monitor2.getName());
		} else {
			System.out.println("Monitor " + monitor2.getName() + " is higher than  Monitor " + monitor1.getName());
		}
		if (monitor1.getWidth() > monitor2.getWidth()) {
			System.out.println("Monitor " + monitor1.getName() + " is widder than  Monitor " + monitor2.getName());
		} else {
			System.out.println("Monitor " + monitor2.getName() + " is widdher than  Monitor " + monitor1.getName());
		}

		System.out.println("-----------------------------------------------");

		//Part2

		University uni1 = new University("UTM", 1964);
		Student stud1 = new Student("Mihai",19,8);
		Student stud2 = new Student("Ion",20,10);
		Student stud3 = new Student("Alex",19,9);
		uni1.addStudent(stud1);
		uni1.addStudent(stud2);
		uni1.addStudent(stud3);

		University uni2 = new University("USM", 1946);
		Student stud4 = new Student("Cornel",20,7);
		Student stud5 = new Student("Sanda",20,10);
		Student stud6 = new Student("Anastasia",19,9);
		uni2.addStudent(stud4);
		uni2.addStudent(stud5);
		uni2.addStudent(stud6);

		University uni3 = new University("USEM", 1992);
		Student stud7 = new Student("Liviu",20,8);
		Student stud8 = new Student("Iana",20,6);
		Student stud9 = new Student("Dina",20,9);
		uni3.addStudent(stud7);
		uni3.addStudent(stud8);
		uni3.addStudent(stud9);

		System.out.println(" UTM Avg:  " + uni1.getAverageMedia());
		System.out.println(" USM Avg: " + uni2.getAverageMedia());
		System.out.println("USEM Avg: " + uni3.getAverageMedia());
    }
}
