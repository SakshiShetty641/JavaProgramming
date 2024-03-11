package Inheritance;

class Person{

    private String name;

    private int phone;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class Employee extends Person{

    private String title;

    private String employerName;

    private char employeeGrade;

    private int salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  String toString(){
        return String.format("Title - %s Name - %s Email - %s  phone - %d salary - %d", title, employerName, getEmail(), getPhone(), salary);
    }



    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setTitle("Title");
        employee.setEmployeeGrade('A');
        employee.setEmployerName("Sakshi");
        employee.setSalary(2000);
        employee.setEmail("abc@gmail.com");
        System.out.println(employee);

    }


}
