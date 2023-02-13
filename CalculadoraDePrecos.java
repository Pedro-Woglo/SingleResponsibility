package SingleResponsability;

import SingleResponsability.model.Produto;

public class CalculadoraDePrecos {

    private final CalculadoraDeFrete calculadoraDeFrete;
    private final CalculadoraDeDesconto calculadoraDeDesconto;

    public CalculadoraDePrecos(CalculadoraDeFrete calculadoraDeFrete, CalculadoraDeDesconto calculadoraDeDesconto) {
        this.calculadoraDeFrete = calculadoraDeFrete;
        this.calculadoraDeDesconto = calculadoraDeDesconto;
    }

    public Double calcular(Produto produto, Double km){
        
        Double frete = calculadoraDeFrete.calcular(produto, km);
        Double desconto = calculadoraDeDesconto.calcular(produto);
        return produto.getPreco() + frete - desconto;
    }

}