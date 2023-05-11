/************************************************************************************************************************************************
In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

In this problem we will test your knowledge on Java Priority Queue.

There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

The Student class should implement:
The constructor Student(int id, String name, double cgpa).
The method int getID() to return the id of the student.
The method String getName() to return the name of the student.
The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.
Input Format

The first line contains an integer, n, describing the total number of events. Each of the n subsequent lines will be of the following two forms:

ENTER name CGPA id: The student to be inserted into the priority queue.
SERVED: The highest priority student in the queue was served.
The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities classes implementation.
*************************************************************************************************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private int id;
    private String name;
    private double cgpa;
    
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    
    public double getCGPA() {
        return this.cgpa;
    }
    
}

class Priorities {
    
    public List<Student> getStudents(List<String> events) {
        
        PriorityQueue<Student> pq = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getId)
        );
        
        for (String event : events) {
            if (event.equals("SERVED")) {
                pq.poll();
            } else {
                String[] tokens = event.split(" ");
                // No exception handling added :)
                pq.add(new Student(Integer.parseInt(tokens[3]), tokens[1], Double.parseDouble(tokens[2])));
            }
        }
        
        return Stream.generate(pq::poll)
            .limit(pq.size())
            .collect(Collectors.toList());
        
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
