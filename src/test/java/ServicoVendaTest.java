import factories.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoVendaTest {
    @Test
    void deveExecutarVenda() {
        var servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda realizada.", servico.executar());
    }

    @Test
    void deveCancelarVenda() {
        var servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda cancelada.", servico.cancelar());
    }
}
