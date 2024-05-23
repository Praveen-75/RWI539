package Model;

import javax.persistence.*;

@Entity
@Table(name = "address")

public class StudentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "Roll_Number")
    private String rollNumber;

    @Column(name = "College")
    private String college;

    @Column(name = "address")
    private String address;

    public StudentAddress() {
    }

    public StudentAddress(String rollNumber, String college, String address) {
        this.rollNumber = rollNumber;
        this.college = college;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "id=" + id +
                ", rollNumber='" + rollNumber + '\'' +
                ", college='" + college + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
