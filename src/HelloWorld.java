import java.util.Scanner;

public class HelloWorld {
    private String greeting="Hello World";

    public void greet(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input your name");
        String name=scanner.nextLine();
        System.out.println(greeting+"\nWelcome! "+name);
    }
}
