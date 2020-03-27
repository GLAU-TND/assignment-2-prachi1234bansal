/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
  public static void main(String args[])
  {
    MyPriorityQueue obj=new PriorityQueue();
    obj.insert("kopl",1);
    obj.insert("mahi",4);
    obj.insert("poli",3);
    obj.insert("iol",2);
    obj.insert("john",5);
    obj.display();
  }
}
