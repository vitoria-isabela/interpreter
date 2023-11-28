package interpreter;

public class AssistenteVirtual {
    private InterpretadorComandos interpretador;

    public void setInterpretador(InterpretadorComandos interpretador) {
        this.interpretador = interpretador;
    }

    public String executarComando(String comando) {
        if (interpretador == null) {
            throw new IllegalStateException("Interpretador não definido");
        }
        return interpretador.interpretarComando(comando);
    }
}
