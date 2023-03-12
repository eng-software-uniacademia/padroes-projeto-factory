package services;

import interfaces.IServico;

public class ServicoVenda implements IServico {
    public String executar() {
        return "Venda realizada.";
    }
    public String cancelar() {
        return "Venda cancelada.";
    }
}
