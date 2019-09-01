import javax.persistence.*;
@Entity
@Table (name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column (name = "name")
    String name;
    @Column ( name = "surname")
    String surname;
    @Column (name =  "sratus")
    String status;
    @Column (name = "mark")
    int mark;

    public Student( String name, String surname, String status, int id, int mark) {
        this.id = id;
        this.mark = mark;
        this.name = name;
        this.surname = surname;
        this.status = status;
    }
    public  Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public  String toString() {
     return getName() + " " + getSurname() + " " + getStatus() + " " + getId() + " " + getMark();
    }

}
