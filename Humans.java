import java.util.Scanner;

public class Humans {

    static String planet="Earth";
    int age;
    String name;

    public static void main(String[] args) {
        Humans h1=new Humans();
        h1.age=18;
        h1.name="Nisha";

        h1.isEven(20);

        System.out.println(planet);

        Humans h2=new Humans();
        Humans h3=new Humans();
        System.out.println(planet);

    }

    public boolean isEven(int num){
        boolean flag=false;
        if(num%2==0){
            flag=true;
        }
        return flag;
    }
}
