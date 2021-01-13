package MainClass;

public class Employee {

    private String emp_number;
    private String name;
    private String city;

    public Employee(String emp_number, String name, String city) {
        this.emp_number = emp_number;
        this.name = name;
        this.city = city;
    }

    public String getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(String emp_number) {
        this.emp_number = emp_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_number='" + emp_number + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
