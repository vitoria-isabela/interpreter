package interpreter;

public class InterpretadorAssistente implements InterpretadorComandos {
    public String interpretarComando(String comando) {
        if (comando == null || comando.isEmpty()) {
            return "Desculpe, não entendi o comando.";
        } else if (comando.equalsIgnoreCase("olá")) {
            return "Olá! Como posso ajudar?";
        } else if (comando.equalsIgnoreCase("hora")) {
            // Lógica para obter a hora atual
            return "Agora são 14:30.";
        } else if (comando.equalsIgnoreCase("desligar")) {
            return "Desligando...";
        } else {
            return "Desculpe, não entendi o comando.";
        }
    }
}
