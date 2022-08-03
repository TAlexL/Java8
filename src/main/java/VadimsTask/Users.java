package VadimsTask;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Users {

    static List<User> userList1 = new ArrayList<>();

        User user1 = new User(23, "Vova", 76, true, "engineer");
        User user2 = new User(34, "Misha", 67, true, "lawyer");
        User user3 = new User(54, "Sasha", 87, true, "teacher");
        User user4 = new User(14, "Valentin", 98, true, "seaman");
        User user5 = new User(43, "Sergiy", 67, true, "cowboy");
        User user6 = new User(33, "Sevastian", 66, true, "engineer");
        User user7 = new User(42, "Evgenii", 80, true, "medical");
        User user8 = new User(32, "Boris", 68, true, "fireman");
        User user9 = new User(46, "Vladislav", 88, true, "lawyer");
        User user10 = new User(23, "Leonid", 99, true, "military");
        User user11 = new User(31, "Ivan", 120, true, "engineer");
        User user12 = new User(30, "Timofei", 101, true, "policeman");
        User user13 = new User(100, "Grigorii", 109, true, "teacher");
        User user14 = new User(57, "Feodor", 76, true, "fireman");
        User user15 = new User(45, "Vova", 100, true, "engineer");

        List<User> userList = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9,
                user10, user11, user12, user13, user14, user15);

    public static List<User> filtrUsers(List<User> userList, CheckingUsers checkingUsers) {
        for (User user : userList) {
            if (checkingUsers.checksUser(user)) {
                userList1.add(user);
            }
        }
        return userList1;
    }

    @Test
    public void userListTestByAge(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.age > 40;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.age > 40);
        }
    }
    @Test
    public void userListTestByName(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.name.length() == 4;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( 4 == user.name.length());
        }
    }
    @Test
    public void userListTestByWeight(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.weight>= 100;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.weight >=100);
        }
    }
    @Test
    public void userListTestBySex(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.sex;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.sex);
        }
    }
    @Test
    public void userListTestBySpeciality(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.speciality.contains("engineer") ;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.speciality.contains("engineer"));
        }
    }
    @Test
    public void userListTestByAgeAndName(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.age < 40 && user.name.length()>5;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.age < 40 && user.name.length()>5);
        }
    }
    @Test
    public void userListTestByNameAndWeight(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.name.length() > 5 && user.weight > 60;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.name.length() > 5 && user.weight > 60);
        }
    }
    @Test
    public void userListTestByWeightAndSex(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.weight < 100 && user.sex;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.weight < 100 && user.sex);
        }
    }
    @Test
    public void userListTestBySexAndSpesiality(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.sex && user.speciality.contains("lawyer");
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.sex && user.speciality.contains("lawyer"));
        }
    }
    @Test
    public void userListTestBySpecialityAndAge(){
        userList1 = filtrUsers(userList, new CheckingUsers() {
            @Override
            public boolean checksUser(User user) {
                return user.speciality.contains("fireman") && user.age < 60;
            }
        });
        Assert.assertTrue(userList1.size()>0);
        for(User user : userList1){
            Assert.assertTrue( user.speciality.contains("fireman") && user.age < 60);
        }
    }
}



