package edu.Alexandre.FundamentosPOO.POOFundamentos.Lanchonete;

import edu.Alexandre.FundamentosPOO.POOFundamentos.Lanchonete.area.cliente.Cliente;
import edu.Alexandre.FundamentosPOO.POOFundamentos.Lanchonete.atendimento.Atendente;
// import edu.Alexandre.FundamentosPOO.POOFundamentos.Lanchonete.atendimento.cozinha.Almoxarife;
// import edu.Alexandre.FundamentosPOO.POOFundamentos.Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		// Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		// cozinheiro.lavarIngredientes();
		// cozinheiro.baterVitaminaLiquidificador();
		// cozinheiro.selecionarIngredientesVitamina();
		// cozinheiro.prepararLanche();
		// cozinheiro.prepararVitamina();
		// cozinheiro.prepararVitamina();
		
		//ações que estabelecimento precisa ter ciência
		// cozinheiro.adicionarSucoNoBalcao();
		// cozinheiro.adicionarLancheNoBalcao();
		// cozinheiro.adicionarComboNoBalcao();
		
		// Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		// almoxarife.controlarEntrada();
		// almoxarife.controlarSaida();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// almoxarife.entregarIngredientes();
		// almoxarife.trocarGas();
		
		// atendente.pegarLancheCozinha();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// atendente.trocarGas();
		
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		// cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		// cliente.consultarSaldoAplicativo();
		
		//já pensou os clientes ouvindo que o gás acabou ?
		// cozinheiro.pedirParaTrocarGas(atendente);
		// cozinheiro.pedirParaTrocarGas(almoxarife);
	}
}
