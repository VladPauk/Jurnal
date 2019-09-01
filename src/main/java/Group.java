
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "nameGroup")
    String nameGroup;
    @OneToMany
    @JoinColumn (name = "STUDENT_ID")
    List<Student> students;


    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Group() {
    }

    public int getId() {
        return id;
    }

    public void setId(int groupId) {
        this.id = groupId;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public List<Student> getStudents() { return students; }

    public void setStudents(List<Student> students) { this.students = students; }

    public void addStudents(Student student) { students.add(student); }


}
