package src.Lesson3;

public class StartLessonThree {

    static void workWithText(User us) {

        String tmp = ((User) us).writeText();
        if (us instanceof Support) {
            ((Support) us).setCheckText(tmp);

            ((Support) us).checkText(((Support) us).getCheckText());

        }

        if (us instanceof Admin) {
            ((Admin) us).deleteText();

        }

    }

    public static void main(String[] args) {

        workWithText(new User());
        workWithText(new Support());
        workWithText(new Admin());

    }

}
