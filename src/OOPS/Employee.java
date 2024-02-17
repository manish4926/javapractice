package OOPS;

public class Employee {
    private int EmpID;
    private String EmpPhone;
    private String EmpName;
    private Float EmpSalary;

    Employee() {
        setEmpID(1001);
        setEmpName("Manish Arora");
        setEmpPhone("9999393712");
        setEmpSalary(1000f);
    }

    Employee(int id, String name, String phone, float salary) {
        setEmpID(id);
        setEmpName(name);
        setEmpPhone(phone);
        setEmpSalary(salary);
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setEmpPhone(String empPhone) {
        EmpPhone = empPhone;
    }

    public void setEmpSalary(Float empSalary) {
        EmpSalary = empSalary;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpPhone() {
        return EmpPhone;
    }

    public Float getEmpSalary() {
        return EmpSalary;
    }

    public void getEmployeeDetails() {
        System.out.println(getEmpID());
        System.out.println(getEmpName());
        System.out.println(getEmpPhone());
        System.out.println(getEmpSalary());
    }
}
