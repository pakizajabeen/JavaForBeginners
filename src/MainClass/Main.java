package MainClass;

import Interface.Irepository;
import Repositry.DepartmentRepo;
import Repositry.EmployeeRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args)
    {
        Irepository<Employee> emprepo = new EmployeeRepo();

        Employee emp = new Employee("1234", "qasim", "Lahore");
        Employee emp1 = new Employee("12345", "Ali", "Karachi");
        Employee emp2 = new Employee("123456", "mahnoor", "Lahore");

        // ADDING DATA
        emprepo.create(emp);
        emprepo.create(emp1);
        emprepo.create(emp2);


        // DISPLAYING DATA
        Collection<Employee> arr = emprepo.read();
        for (Employee e : arr) {
            System.out.println(e.getName() + " " + e.getEmp_number());
        }

        //UPDATING DATA
        emprepo.update(1, new Employee("E22", "faheem", "karachi"));


        // DELETING DATA
      emprepo.delete(2);


        // Department repo
        Irepository<Department> deptrepo = new DepartmentRepo();

        Department dept = new Department("H12", "HR");
        Department dept1 = new Department("J22", "Java");

        deptrepo.create(dept);
        deptrepo.create(dept1);

    }
}
