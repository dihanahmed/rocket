package Type;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Main o=new Main();
        Scanner input=new Scanner(System.in);
        o.name=input.next();
        o.age=input.nextInt();
        o.setinfo(o.name,o.age);
        o.displayinfo();
    }
}
