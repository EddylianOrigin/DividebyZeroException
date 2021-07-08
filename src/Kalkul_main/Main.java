package Kalkul_main;

import com.company.DividebyZeroException;
import com.company.Kalkul;

public class Main {

    public static void main(String[] args) throws DividebyZeroException {
        Kalkul kl1;
        Kalkul kl2;
        // write your code here
        kl1 = new com.company.Kalkul(2, 0);//hier muss mein Exception geworfen
        kl2 = new com.company.Kalkul(2, 14);
        Kalkul add;


        System.out.println("TestKalkul");
        System.out.println("Testbeispiel add");

    }
}
