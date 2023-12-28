package edu.Alexandre.FundamentosPOO.PilaresPOO.Messenger;

import edu.Alexandre.FundamentosPOO.PilaresPOO.Messenger.Apps.FacebookMessenger;
import edu.Alexandre.FundamentosPOO.PilaresPOO.Messenger.Apps.MSNMessenger;
import edu.Alexandre.FundamentosPOO.PilaresPOO.Messenger.Apps.ServicoMensagemInstantanea;
import edu.Alexandre.FundamentosPOO.PilaresPOO.Messenger.Apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		/*
		 * NÃO SE SABE QUAL APP MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		ServicoMensagemInstantanea smi = null;

		String appEscolhido = "msn";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();

		// abrindo Messenger
		// MSNMessenger msn = new MSNMessenger();
		// Telegram telegram = new Telegram();
		// FacebookMessenger facebookMessenger = new FacebookMessenger();

		// msn.enviarMensagem();
		// msn.receberMensagem();

		// telegram.enviarMensagem();
		// telegram.receberMensagem();

		// facebookMessenger.enviarMensagem();
		// facebookMessenger.receberMensagem();
	}

}
