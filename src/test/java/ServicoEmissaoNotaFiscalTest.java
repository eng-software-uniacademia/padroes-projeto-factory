import factories.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoEmissaoNotaFiscalTest {
    @Test
    void deveExecutarEmissao() {
        var servico = ServicoFactory.obterServico("EmissaoNotaFiscal");
        assertEquals("Nota emitida.", servico.executar());
    }

    @Test
    void deveCancelarEmissao() {
        var servico = ServicoFactory.obterServico("EmissaoNotaFiscal");
        assertEquals("Emissão de nota cancelada.", servico.cancelar());
    }
}
