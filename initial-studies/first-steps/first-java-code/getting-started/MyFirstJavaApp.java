public class MyFirstJavaApp {
    void main() {
        IO.println(
            "\nHello, World!\n"
        );

        var name_user = IO.readln(
            "What is your name? "
        );

        IO.println(
            "Hello " + name_user
        );
        
    }    
}
