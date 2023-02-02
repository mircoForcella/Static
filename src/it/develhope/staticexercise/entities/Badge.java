package it.develhope.staticexercise.entities;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees += 1;
    }

    private String generateBadgeIdCode() {
        Random randomized = new Random();
        String randomStr = "";
        Pattern pattern = Pattern.compile("[a-zA-Z]");

        for (int i = 0; i < 3; i++) {
            char letter = (char) (randomized.nextInt(52) + 'A');
            Matcher matcher = pattern.matcher(String.valueOf(letter));
            if (matcher.matches()) {
                randomStr += letter;
            } else {
                i--;
            }
        }
        return randomStr + employee.getName() + employee.getSurname() + randomStr;
    }

    public void showBadgeDetails() {
        System.out.println("Total Number of Employees: " + totalNumberOfEmployees);
        System.out.println("Employee: " + employee.toString());
        System.out.println("Badge ID: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
