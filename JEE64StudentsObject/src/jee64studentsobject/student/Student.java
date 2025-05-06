
package jee64studentsobject.student;


public class Student {
    public String name;
    public int id;
    public String country;

    public Student() {
    }

    public Student(String name, int id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Name= " + name +"\n"+ "ID= " + id+"\n"+ "Country= " + country;
    }
    
    
    
    
    
    
    
}
