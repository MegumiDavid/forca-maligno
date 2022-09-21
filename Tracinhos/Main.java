public class Main
{
    public static void main (String[] args)
    {

        try {
            Tracinhos t = new Tracinhos(-5); // quantidade invalidade
        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }

        try {
            Tracinhos t = new Tracinhos(5);
            t.revele(-5, 'a'); // posicao invalida
        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }

        try {
            Tracinhos t = new Tracinhos(6);
            t.revele(7, 'a'); // posicao invalida
        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }

        try {
            Tracinhos t = new Tracinhos(6);
            t.revele(6, 'a'); // posicao invalida
        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }

        try {
            Tracinhos t = new Tracinhos(6);
            t.revele(0, 'a'); // posicao valida
            t.revele(1, 'a'); // posicao valida
            t.revele(2, 'a'); // posicao valida
            t.revele(3, 'a'); // posicao valida
            t.revele(4, 'a'); // posicao valida
            t.revele(5, 'a'); // posicao valida

            System.out.println(t);
            System.out.println(t.isAindaComTracinhos());  // false

        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }

        try {
            Tracinhos x = new Tracinhos(6);
            x.revele(0, 'a'); // posicao valida
            x.revele(1, 'a'); // posicao valida

            System.out.println(x);
            System.out.println(x.isAindaComTracinhos());  // true

            Tracinhos copia = new Tracinhos(x);
            Tracinhos copia1 = new Tracinhos(x);
            Tracinhos copia2 = (Tracinhos) x.clone();

            copia.revele(2, 'a');
            copia1.revele(2, 'a');
            copia1.revele(3, 'a');
            copia2.revele(2, 'a');
            copia2.revele(3, 'a');
            copia2.revele(4, 'a');

            System.out.println(x);       // a a _ _ _ _
            System.out.println(copia);   // a a a _ _ _
            System.out.println(copia1);  // a a a a _ _
            System.out.println(copia2);  // a a a a a _

        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }



        // Tracinhos copia = new Tracinhos(10);
        // Tracinhos copia1 = new Tracinhos(copia);
        // Tracinhos copia2 = (Tracinhos) copia.clone();
    }
}