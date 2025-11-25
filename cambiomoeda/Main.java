package cambiomoeda;

import java.util.*;

public class Main {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        Moeda dolar = new Moeda( "USD", 5.39 );
        Moeda euro = new Moeda( "EUR", 6.21  );
        
        System.out.println("Digite a moeda para qual voce quer converter");
        
        Map<String, Moeda> mapaMoedas = new HashMap<>();
        
        mapaMoedas.put("USD", dolar);
        mapaMoedas.put("EUR", euro);
        
        Moeda selecioda = mapaMoedas.get(input.nextLine());
        
        System.out.println("Digite a quantidade");
        Double valor = input.nextDouble();
        Moeda real = new Moeda( "BRL", valor);

        System.out.println( real.converterMoeda(selecioda) + " " + selecioda.sigla );

        input.close();

    }
    
}
