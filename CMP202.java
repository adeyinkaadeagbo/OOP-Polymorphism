public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 23;
        height = 172;
        name = "DIO-Codes";
        name.length();
        password = "USER@12345";
        if (password.contains("12345") || password.contains("USER")) {
            System.out.println("Password is weak");
        }
    }    
}