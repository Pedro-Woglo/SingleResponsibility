package SingleResponsability;

public class CalculadoraDeFrete {

    public Double calcular(SingleResponsability.model.Produto produto, Double km){
        
        return produto.getPeso() * km;
    }
}