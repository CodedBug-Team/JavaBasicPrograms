package practise;

public class Constructor {
    String name;
    String email;



    public Constructor(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public static void main(String args[]) {
       // Constructor obj = new Constructor("navin", "n@gmail.com");
       Constructor obj = new Constructor("reddy", "r@gmail.com");
 System.out.println(obj.name);
        System.out.println(obj.email);}}
