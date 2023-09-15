package chapter9;

import java.sql.SQLOutput;

public class Employee extends Person {
    private String employeeID;
    private String employeeTitle;

    public Employee(){
        super("Tilmar");
        System.out.println("Employee Default Construct");
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }


}
