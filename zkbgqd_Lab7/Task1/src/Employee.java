import static java.lang.String.format;

public class Employee {
    //Employee variables
    private String name;
    private String employeeNumber;
    private String hireDate;

    //constructor
    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    //empty constructor
    public Employee() {
        this.name = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public boolean isValidEmpNum(String e) {
        return e.equals(employeeNumber);
    }

    //override the toString function
    public String toString(){
        //return a formated string so it prints how instructions specified
        return format("Name: %s\nEmployee Number: %s\nHire Date: %s", this.getName(), this.getEmployeeNumber(), this.getHireDate());
    }


}
