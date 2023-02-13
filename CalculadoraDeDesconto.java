package SingleResponsability;

import SingleResponsability.model.Produto;

public class CalculadoraDeDesconto {

    public Double calcular(Produto produto){
        
        return produto.getPreco() * 0.25;
    }

}

