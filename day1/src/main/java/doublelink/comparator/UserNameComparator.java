package doublelink.comparator;

import doublelink.module.User;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {
    public int compare(User user1, User user2) {
        if(user1.getName().equals(user2.getName())){
            return 0;
        }
        return -1;
    }
}
