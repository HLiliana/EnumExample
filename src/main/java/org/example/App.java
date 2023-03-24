package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Employee employee1 = new Employee();
        employee1.gender = Gender.NON_BINARY;
        System.out.println(employee1.gender.name());
    }
}
