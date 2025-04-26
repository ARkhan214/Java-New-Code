
package liveclass;

public class studentClass {
    String name;
    String mail;
    int marks;

    public studentClass() {
    }

    public studentClass(String name, String mail, int marks) {
        this.name = name;
        this.mail = mail;
        this.marks = marks;
    }

    public studentClass(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public studentClass(int marks) {
        this.marks = marks;
    }
    
    public String getResult(){
        if (marks>=33) {
            return name+" Pass and Marks is "+marks;
        }
        else{
         return name+" Fail and Marks is "+marks;}
    }
}

