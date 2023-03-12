package services;

import interfaces.IServico;

public class ServicoEmissaoNotaFiscal implements IServico {
    public String executar() {
        return "Nota emitida.";
    }
    public String cancelar() {
        return "Emissão de nota cancelada.";
    }
}
