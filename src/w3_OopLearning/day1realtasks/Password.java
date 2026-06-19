package w3_OopLearning.day1realtasks;

public class Password {
    String password;

    public Password(String text) {
        this.password = text;
    }



    public  boolean isStrong () {
        if (password.length() >= 8 ) {
            return true;
        } else {
            return false;
        }
    }


}
