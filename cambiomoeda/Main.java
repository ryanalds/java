package cambiomoeda;

import java.util.*;

public class Main {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        Moeda dolar = new Moeda( "USD", 5.39 );
        Moeda euro = new Moeda( "EUR", 6.21  );
        Moeda libra = new Moeda("LBR", 7.12);
        Moeda iene = new Moeda("JPY", 0.034);
        Moeda franco_suico = new Moeda("CHF", 6.60);
        Moeda dolar_australiano = new Moeda("AUD", 3.53);
        Moeda dolar_canadense = new Moeda("CAD", 3.81);
        Moeda rublo_russo = new Moeda("RUB", 0.069);
        Moeda dinar_kuwaitiano = new Moeda("KWD", 17.31);
        Moeda peso_argentino = new Moeda("ARS", 0.0037);

        System.out.println("Digite a moeda para qual voce quer converter");

        Map<String, Moeda> mapaMoedas = new HashMap<>();

        mapaMoedas.put("USD", dolar);
        mapaMoedas.put("EUR", euro);
        mapaMoedas.put("LBR", libra);
        mapaMoedas.put("JPY", iene);
        mapaMoedas.put("CHF", franco_suico);
        mapaMoedas.put("AUD", dolar_australiano);
        mapaMoedas.put("CAD", dolar_canadense);
        mapaMoedas.put("RUB", rublo_russo);
        mapaMoedas.put("KWD", dinar_kuwaitiano);
        mapaMoedas.put("ARS", peso_argentino);


        Moeda selecionada = mapaMoedas.get(input.nextLine());

        System.out.println("Digite a quantidade");
        Double valor = input.nextDouble();
        Moeda real = new Moeda( "BRL", valor);

        System.out.println( real.converterMoeda(selecionada) + " " + selecionada.sigla );

        input.close();
    }

}
