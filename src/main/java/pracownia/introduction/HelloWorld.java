package pracownia.introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    public static void main(String [ ] args) {
        Logger log = Logger.getLogger(HelloWorld.class);
        log.info("message");
        System.out.println("Hello World");
    }
}