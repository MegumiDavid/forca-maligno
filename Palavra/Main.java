public class Main
{
    public static void main (String[] args)
    {   
        Palavra pal1 = null;
        Palavra pal2 = null;
        Palavra pal3 = null;
		try
		{
            pal1 = new Palavra ("david");
            pal2 = new Palavra ("david");
            pal3 = new Palavra ("miguel");
        }
        catch (Exception erro)
        {
			System.err.println (erro.getMessage());
		}

		// Teste getTamanho()
		System.out.println (pal1.getTamanho());   // 5

		// Teste getQuantidade()
		System.out.println (pal1.getQuantidade('d'));  // 2
		System.out.println (pal1.getQuantidade('a'));  // 1
		System.out.println (pal1.getQuantidade('v'));  // 1
		System.out.println (pal1.getQuantidade('i'));  // 1
		
		// Teste equals()
		System.out.println (pal1.equals(pal1));  // true
		System.out.println (pal1.equals(pal2));  // true
		System.out.println (pal1.equals(pal3));  // false

		// Teste compareTo()		
		System.out.println (pal1.compareTo(pal1));  // 0
		System.out.println (pal1.compareTo(pal2));  // 0
		System.out.println (pal1.compareTo(pal3));  // -9
		
		
		// Teste getPosicaoDaIezimaOcorrencia()
		try {
		    System.out.println (pal1.getPosicaoDaIezimaOcorrencia(0 , 'g'));  // erro
		} catch (Exception erro) {
			System.err.println (erro.getMessage());		    
		}
		
		try {
		    System.out.println (pal1.getPosicaoDaIezimaOcorrencia(0 , 'd'));  // 0
		} catch (Exception erro) {
			System.err.println (erro.getMessage());		    
		}
		
		try {
		    System.out.println (pal1.getPosicaoDaIezimaOcorrencia(1 , 'd'));  // 4
		} catch (Exception erro) {
			System.err.println (erro.getMessage());		    
		}
		
		try
		{
    		System.out.println (pal1.getPosicaoDaIezimaOcorrencia(2 , 'd'));  // erro
        }
        catch (Exception erro)
        {
			System.err.println (erro.getMessage());
		}
    }
}