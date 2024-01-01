package oops_encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee sahil = new Employee(-200);
        sahil.setSalary(-200);
        double salary = sahil.getSalary();

        sahil.getTotalSalary();

        System.out.println(salary);
//
//		Employee rithika = new Employee();
//		//rithika.salary = 1000.00
//



    }
}
