package src.Lesson3;

public class Admin extends User {

    Support support = new Support();
    User user = new User();

    boolean check = support.flag;

    void deleteText() {

        if (check == true){
            support.setCheckText(null);
        }

    }

}
