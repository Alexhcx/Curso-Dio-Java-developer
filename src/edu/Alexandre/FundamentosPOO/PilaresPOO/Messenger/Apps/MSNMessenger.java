package edu.Alexandre.FundamentosPOO.PilaresPOO.Messenger.Apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSNMessenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSNMessenger");
    }

    public void salvarHistoricoMensagem(){}

}
