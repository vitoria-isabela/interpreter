package interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssistenteVirtualTest {

    @Test
    void testInterpretadorAssistente() {
        InterpretadorComandos interpretador = new InterpretadorAssistente();
        assertEquals("Olá! Como posso ajudar?", interpretador.interpretarComando("olá"));
        assertEquals("Agora são 14:30.", interpretador.interpretarComando("hora"));
        assertEquals("Desligando...", interpretador.interpretarComando("desligar"));
        assertEquals("Desculpe, não entendi o comando.", interpretador.interpretarComando("teste"));
    }

    @Test
    void testAssistenteVirtualComInterpretador() {
        AssistenteVirtual assistente = new AssistenteVirtual();
        assistente.setInterpretador(new InterpretadorAssistente());
        assertEquals("Olá! Como posso ajudar?", assistente.executarComando("olá"));
        assertEquals("Agora são 14:30.", assistente.executarComando("hora"));
        assertEquals("Desligando...", assistente.executarComando("desligar"));
        assertEquals("Desculpe, não entendi o comando.", assistente.executarComando("teste"));
    }

    @Test
    void testAssistenteSemInterpretador() {
        AssistenteVirtual assistente = new AssistenteVirtual();
        assertThrows(IllegalStateException.class, () -> {
            assistente.executarComando("olá");
        });
    }

    @Test
    void testComandoVazio() {
        InterpretadorComandos interpretador = new InterpretadorAssistente();
        assertEquals("Desculpe, não entendi o comando.", interpretador.interpretarComando(""));
    }

    @Test
    void testComandoNulo() {
        InterpretadorComandos interpretador = new InterpretadorAssistente();
        assertEquals("Desculpe, não entendi o comando.", interpretador.interpretarComando(null));
    }
}
