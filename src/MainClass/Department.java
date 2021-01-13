package MainClass;

public class Department {

    private String dept_number;
    private String dept_name;

    public Department(String dept_number, String dept_name) {

        this.dept_number = dept_number;
        this.dept_name = dept_name;
    }

    public String getDept_number() {
        return dept_number;
    }

    public void setDept_number(String dept_number) {
        this.dept_number = dept_number;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
