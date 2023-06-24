package co.develhope.introduction;


import java.util.Random;
import java.util.UUID;

class Employee{
    String name;
    String surname;
    String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return "name : "+name +", Surname :  "+ surname + " address is " + address;
    }
}

class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedsBadge){
    keepTrackOfEmployeesNumber();
    employee = employeeThatNeedsBadge;
    badgeIdCode = generateBadgeIdCode();
    }
    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }
        private String generateBadgeIdCode() {
        //generating a random string of 3 characters long
            String alphabetChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int randomStringLength = 3;

            Random random = new Random();

            StringBuilder stringBuilder = new StringBuilder();

            for (int i =0;i<randomStringLength; i++) {
                int randomIndexNumber = random.nextInt(alphabetChar.length());
                char randomChar = alphabetChar.charAt(randomIndexNumber);
                stringBuilder.append(randomChar);

            }

            return stringBuilder.toString() + employee.name + employee.surname + stringBuilder.toString();
        }

        public void showBadgeDetails(){
            System.out.println(totalNumberOfEmployees+" employees");
            System.out.println(employee.getEmployeeDetails());
            System.out.println(badgeIdCode);
    }
}

public class EmployeeTester {
    public static void main(String[] args){
        Employee employee = new Employee("Maron","Murangiri","200");
        Employee employee1 = new Employee("Newton","Mureti","200");


        Badge badge = new Badge(employee);
        Badge badge2 = new Badge(employee1);

        badge.showBadgeDetails();
        System.out.println();
        badge2.showBadgeDetails();


    }
}
