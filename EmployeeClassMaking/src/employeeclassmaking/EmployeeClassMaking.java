package employeeclassmaking;

public class EmployeeClassMaking {

    public static void main(String[] args) {
        Manager m = new Manager(5, "Md khan", 1, 999999999);
        m.displayAllDetails();
        System.out.println("----------");
        m.setName("Sadiar");
        m.setId(4);
        m.setSalary(1999948945);
        m.setTeamSize(14);
        m.displayAllDetails();
    }

}
