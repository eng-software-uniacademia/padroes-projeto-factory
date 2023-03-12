package factories;

import interfaces.IServico;

public class ServicoFactory {
    public static IServico obterServico(String servico) {
        Class classe;
        Object objeto;
        try {
            classe = Class.forName("services.Servico" + servico);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente.");
        }

        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido.");
        }

        return (IServico) objeto;
    }
}
