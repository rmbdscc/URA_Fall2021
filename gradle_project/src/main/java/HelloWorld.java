
public class HelloWorld {

    public static String getGreeting() {
        String message = "";
        //#if isJava8==true
        message += "Java8!" + "\n";
        //#elseif isJava11==true
        message += "Java11!" + "\n";
        //#else
        message += "Not Java8 nor Java11" + "\n";
        //#endif
        return message;
    }

    public static void main(String[] args) {
        System.out.println(getGreeting());
    }
}
