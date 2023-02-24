public class Employee extends Worker{

  private   long employeedId;
   private String hireDate;

   private  static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeedId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeedId=" + employeedId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
