/**
 * Created by Alex on 7/29/2015.
 */
public class Bits {
    public static void main(String[] args) {
        byte b1 = 12;				// 00001100
        System.out.println(b1);
        byte b2 = -12;				// 11110100 (256-12=244)
        System.out.format("%h\n", (char) b2);
        int  n1 = b2;				// 11111111 11111111 11111111 11110100
        System.out.println(n1);
        int  n2 = -1;				// 11111111 11111111 11111111 11111111
        char c1 = (char)n2;			// 11111111 11111111 (=65535)
        System.out.println((int)c1);
        System.out.println(c1+1);
        c1++;						// 00000000 00000000 (=0)
        System.out.println((short)c1);
    }
}
