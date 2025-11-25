package cambiomoeda;

public class Moeda {

    public String sigla;
    private Double valor;

    public Moeda ( String sigla, Double valor)  {

        this.sigla = sigla;
        this.valor = valor;
        
    }

    public String converterMoeda ( Moeda moedaParaConverter ) {

        double resultado = this.valor / moedaParaConverter.valor;
        return String.format("%.2f", resultado);

    }
}
