package Java_practice2.accessmodifier.Criminal;

import Java_practice2.accessmodifier.Police.cop;

public class thief {
    public static void main(String[] args) {
        cop cop1 = new cop(10);
        System.out.println(cop.gun);
        // cop.canIShoot();   // We have protected this so only files inside same folder can access.
    }
}
