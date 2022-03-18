
public class HelloWorld {

    public static String getGreeting() {

        String message = "";
        //#if currentJava == 8
        message += "Currently Java 8!";
        //#endif
        //#if currentJava == 11
        message += "Currently Java 11!";
        //#endif
        //#if currentJava == 16
        message += "Currently Java 16!";
        //#endif

        return message;
    }

}

// to write tests