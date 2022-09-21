public class Main {
    public static void main(String[] args)
    {
        // qunatidade invalida
        try {
            ControladorDeErros t = new ControladorDeErros(-5); // quantidade invalidade
        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }

        // numero de erro maior que qtdMax
        try {
            ControladorDeErros t = new ControladorDeErros(5);
            t.registreUmErro();
            t.registreUmErro();
            t.registreUmErro();
            t.registreUmErro();
            t.registreUmErro();
            t.registreUmErro();
        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }


        try {
            ControladorDeErros t1 = new ControladorDeErros(5);
            ControladorDeErros t2 = new ControladorDeErros(5);
            ControladorDeErros t3 = new ControladorDeErros(10);

            t1.registreUmErro();
            t1.registreUmErro();
            t1.registreUmErro();
            t1.registreUmErro();

            // false: 4/5
            System.out.println(t1.isAtingidoMaximoDeErros());
            System.out.println(t1);

            // true: 5/5
            t1.registreUmErro();
            System.out.println(t1.isAtingidoMaximoDeErros());
            System.out.println(t1);

            // equals test
            System.out.println(t1.equals(t2)); // true
            System.out.println(t1.equals(t3)); // false
            System.out.println(t1.equals(t1)); // true

            ControladorDeErros copia = new ControladorDeErros(t3);
            ControladorDeErros copia1 = new ControladorDeErros(t3);
            ControladorDeErros copia2 = (ControladorDeErros) t3.clone();

            copia.registreUmErro();
            copia1.registreUmErro();
            copia1.registreUmErro();
            copia2.registreUmErro();
            copia2.registreUmErro();
            copia2.registreUmErro();

            // t3.qtdErr = 0;
            System.out.println(copia);   // 1/10
            System.out.println(copia1);  // 2/10
            System.out.println(copia2);  // 3/10

        } catch (Exception erro) {
            System.err.println (erro.getMessage());
        }
    }
}