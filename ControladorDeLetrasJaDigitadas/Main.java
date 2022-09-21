public class Main
{
    public static void main (String[] args) throws Exception {
        ControladorDeLetrasJaDigitadas t1 = new ControladorDeLetrasJaDigitadas();


        t1.registre('a');
        t1.registre('b');
        // t1.registre('b'); // exception

        System.out.println(t1.isJaDigitada('a')); // true
        System.out.println(t1.isJaDigitada('b')); // true
        System.out.println(t1.isJaDigitada('c')); // false

        System.out.println(t1); // a, b

        ControladorDeLetrasJaDigitadas copia = new ControladorDeLetrasJaDigitadas(t1);
        ControladorDeLetrasJaDigitadas copia1 = new ControladorDeLetrasJaDigitadas(t1);
        ControladorDeLetrasJaDigitadas copia2 = (ControladorDeLetrasJaDigitadas) t1.clone();

        copia.registre('q');
        copia1.registre('w');
        copia2.registre('e');


        System.out.println(t1);      // a, b
        System.out.println(copia);   // a, b, q
        System.out.println(copia1);  // a, b, w
        System.out.println(copia2);  // a, b, e

    }
}