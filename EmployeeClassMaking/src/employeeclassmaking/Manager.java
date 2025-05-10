
package employeeclassmaking;


public class Manager extends Employee{
  
    public int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(int teamSize, String name, int id, int salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    
    
    
    public void displayAllDetails(){
        System.out.println("Name: "+super.name);
        System.out.println("ID: "+super.id);
        System.out.println("Salary: "+super.salary+" Taka");
        System.out.println("Team Size is: "+getTeamSize());
    } 
    
    
    
}
