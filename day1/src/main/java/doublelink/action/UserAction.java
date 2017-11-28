package doublelink.action;

import doublelink.comparator.UserAllInfoComparator;
import doublelink.comparator.UserNameComparator;
import doublelink.linklist.DoubleLink;
import doublelink.module.User;

public class UserAction {
    public static void main(String[] args){
        DoubleLink<User> doubleLink = new DoubleLink<User>();
        User user1 = new User("Mike", 24);
        User user2 = new User("Kelvin", 24);
        User user3 = new User("Jack", 23);
        User user4 = new User("Tom", 23);
        doubleLink.insertFirst(user1);
        doubleLink.insertLast(user2);
        doubleLink.insertFirst(user3);
        doubleLink.insertLast(user4);
        doubleLink.display();
        System.out.println();

        //queryData
        User u = doubleLink.queryData(3);
        if(u != null)
        System.out.println("name is: " + u.getName());

        //remove by same object
        doubleLink.remove(u);
        doubleLink.display();

        //remove by comparator
        System.out.println();
        System.out.println("remove by UserAllInfoComparator:");
        User userCompareAllInfo = new User("Jack", 23);
        //use UserAllInfoComparator
        doubleLink.removeByComparator(userCompareAllInfo, new UserAllInfoComparator());
        doubleLink.display();
        //use UserNameComparator
        System.out.println();
        System.out.println("remove by UserNameComparator:");
        User userCompareByName = new User("Mike", 20);
        doubleLink.removeByComparator(userCompareByName, new UserNameComparator());
        doubleLink.display();
    }
}
