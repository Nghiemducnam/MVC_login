package models;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    private static List<User>users;
    static {
        users = new ArrayList<User>();
        User u1 = new User();
        u1.setName("nam");
        u1.setEmail("nghiemducnam0312@gmail.com");
        u1.setAge(23);
        u1.setAccount("Nam");
        u1.setPassword("abc");
        users.add(u1);

        User u2 = new User();
        u2.setName("dung");
        u2.setEmail("nghiemducdung@gmail.com");
        u2.setAge(18);
        u2.setAccount("Dung");
        u2.setPassword("abc");
        users.add(u2);

    }

    public static User checkLogin(Login login){
        for(User i :users){
            if(i.getAccount().equals(login.getAccount())
                    && i.getPassword().equals(login.getPassword())){
                return i;
            }
        } return null;
    }
}
