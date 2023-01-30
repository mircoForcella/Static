package it.develhope.staticexercise.entities;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees +=1;
    }
    private String generateBadgeIdCode(){
        return "XTZ"+employee.getName()+employee.getSurname()+"XTZ";
    }
    public void showBadgeDetails(){
        System.out.println("Total Numberber of Employees: "+ totalNumberOfEmployees);
        System.out.println("Employee: " + employee.toString());
        System.out.println("Badge ID: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
