package leatnwithchatgpt.teachers;

public class Teachers {

    public String name;
    private String department;
    int age;
    protected String designation;

    public Teachers() {
    }

    public Teachers(String name, String department, int age, String designation) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Teachers{" + "name=" + name + ", department=" + department + ", age=" + age + ", designation=" + designation + '}';
    }
    
    
    
    
    
    
}
