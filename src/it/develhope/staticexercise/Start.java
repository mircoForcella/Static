package it.develhope.staticexercise;

import it.develhope.staticexercise.entities.Badge;
import it.develhope.staticexercise.entities.Employee;

public class Start {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lorenzo","Caputo","via della notte 30");
        Employee employee2 = new Employee("Federica", "Angeli", "viale roma");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
