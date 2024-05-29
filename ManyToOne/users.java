package ManyToOne;

import javax.persistence.*;

@Entity
@Table(name = "users_Table")
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;
    private String firstName;
    private String lastName;
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    private address address;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public address getAdd() {
        return address;
    }

    public void setAdd(address address) {
        this.address = address;
    }
}
