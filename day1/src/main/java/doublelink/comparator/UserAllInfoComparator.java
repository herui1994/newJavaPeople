package doublelink.comparator;

import doublelink.module.User;
import java.util.Comparator;

public class UserAllInfoComparator implements Comparator<User> {
    public int compare(User user1, User user2) {
        if(user1.getName().equals(user2.getName()) && user1.getAge() == user2.getAge()){
            return 0;
        }
        return -1;
    }
}
