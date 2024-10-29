package app;

import app.models.Employee;
import app.vehicles.Car;

public class SolutionHw12 {
    public static void main(String[] args) {
        Employee employee = new Employee("Ірина Максимова", "Менеджер", "irina@gmail.com", "+380501234567", 35);
        System.out.println(employee);

        Car car = new Car();
        car.start();
    }
}