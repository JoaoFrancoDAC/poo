public class Transmissao1 implements ITransmiteDados {
    @Override
    public void EnviaJson() {
        System.err.println("enviando .json");
    }

    @Override
    public String recebeMensagem (String protocolo) {
        return "Recebida mensagem usando protocolo" + protocolo;
    }

}
