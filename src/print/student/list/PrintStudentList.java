/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package print.student.list;

/**
 *
 * @author Marcus Grau
 */
public class PrintStudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create three Student objects
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setId(1);

        Student s2 = new Student();
        s2.setName("John");
        s2.setId(2);

        Student s3 = new Student();
        s3.setName("James");
        s3.setId(3);

        // Create an array to store the students
        Student[] list = new Student[2];
        list[0] = s1;
        list[1] = s2;
//        list[2] = s3; // Saves the object in the array

        // Print each student's name and ID on separate lines
        for (int i = 0; i < list.length; i++) {
            System.out.println("Name: " + list[i].getName());
            System.out.println("ID: " + list[i].getId());
            System.out.println(); // Add an empty line for separation
        }
    }
    
}
