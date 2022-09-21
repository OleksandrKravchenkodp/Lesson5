package src.Lesson3;

public class Support extends User {

    String checkText;
    boolean flag = false;


    static final String VERSETEXT = "From fairest creatures we desire increase,\r\n"
            + "That thereby beauty's rose might never die,\r\n"
            + "But as the riper should by time decease,\r\n"
            + "His tender heir might bear his memory:\r\n"
            + "But thou, contracted to thine own bright eyes";



    public String getCheckText() {
        return checkText;
    }



    public void setCheckText(String checkText) {
        this.checkText = checkText;
    }



    boolean checkText (String checkText) {
        System.out.println(VERSETEXT.equals(checkText));
        flag = VERSETEXT.equals(checkText);
        return flag;

    }

}
