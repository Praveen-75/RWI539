package Model;

import javax.persistence.*;

@Entity
@Table(name = "EmployeesDetail")
public class EmployeesDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "office_name")
    private String officeName;

    @Column(name = "no_of_employees")
    private int noOfEmployees;

    public EmployeesDetail() {
    }

    public EmployeesDetail(String officeName, int noOfEmployees) {
        this.officeName = officeName;
        this.noOfEmployees = noOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String office) {
        this.officeName = officeName;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void
    setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    public String toString() {
        return "StudentGfgDetail{"
                + "id=" + id + ", officeName='" + officeName + '\''
                + ", noOfEmployees=" + noOfEmployees
                + '}';
    }
}

