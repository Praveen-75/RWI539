package ManyToOne;

public class AppManyToOne {
    public static void main(String[] args) {
        SaveDataManyToOne saveDataManyToOne = new SaveDataManyToOne();
        users user = new users();
        user.setFirstName("Praveen");
        user.setLastName("Kumar");
        user.setAge(22);

        users user2 = new users();
        user2.setFirstName("Priya");
        user2.setLastName("Verma");
        user2.setAge(20);

        address add = new address();
        add.setCity("Bhopal");
        add.setPinCode(462010);
        add.setAddressLine("Semra");

        user.setAdd(add);
        user2.setAdd(add);

        saveDataManyToOne.saveUser(user);
        saveDataManyToOne.saveUser(user2);

        System.out.println("Done");
    }
}
