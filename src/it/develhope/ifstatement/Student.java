package it.develhope.ifstatement;
import java.util.Random;

public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }
        public void guessingAge(){
            Random random = new Random();
            int genNum = random.nextInt();

            System.out.println("I generated the random number " + genNum + " for student " + this.name);
            if (genNum == this.age) {
                System.out.println("My age is equal to the generated number.");
            } else if (genNum > this.age) {
                System.out.println("My age is lower than the generated number.");
            } else {
                System.out.println("My age is greater than the generated number.");
            }
        }
    }
