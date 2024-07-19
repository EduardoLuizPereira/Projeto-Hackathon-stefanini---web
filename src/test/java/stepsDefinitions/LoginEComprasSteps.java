package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginEComprasPage;

public class LoginEComprasSteps {

	@Dado("que eu o usuario esteja fazendo login")
	public void queEuOUsuarioEstejaFazendoLogin() {

	}

	@Quando("eu clico no botao sing in")
	public void euClicoNoBotaoSingIn() {
		Na(LoginEComprasPage.class).clicandoCampoBotaoEntrar();
	}

	@Quando("informar no campo email {string}")
	public void informarNoCampoEmail(String string) {
		Na(LoginEComprasPage.class).informandoCampoEmail(string);
	}

	@Quando("informar no campo senha {string}")
	public void informarNoCampoSenha(String string) {
		Na(LoginEComprasPage.class).informandoCampoSenha(string);
	}

	@Quando("clico botao entrar")
	public void clicoBotaoEntrar() {
		Na(LoginEComprasPage.class).clicandoBotaoLogin();
	}

	@Entao("a conta foi logada com sucesso")
	public void aContaFoiLogadaComSucesso() {
		Na(LoginEComprasPage.class).campoLoginSucesso();
	}

	@Quando("clico botao lista de desejos")
	public void clicoBotaoListaDeDesejos() {
		Na(LoginEComprasPage.class).clicandoBotaoDesejo();
	}

	@Quando("clico em vestido de chiffon")
	public void clicoEmVestidoDeChiffon() {
		Na(LoginEComprasPage.class).clicarBotaoVestidoChiffon();
	}

	@Quando("clico no add lista de desejos")
	public void clicoNoAddListaDeDesejos() {
		Na(LoginEComprasPage.class).clicarBotaoAddListaDesejos();
	}

	@Quando("clico botao fechar")
	public void clicoBotaoFechar() {
		Na(LoginEComprasPage.class).clicarcampofechar();
	}

	@Quando("clico em add carrinho")
	public void clicoEmAddCarrinho() {
		Na(LoginEComprasPage.class).clicarcampoAddCarrinho();
	}

	@Quando("clico botao continuar")
	public void clicoBotaoContinuar() {
		Na(LoginEComprasPage.class).clicandoBotaoContinuar();
	}

	@Quando("clico botao fazer o check-out")
	public void clicoBotaoFazerOCheckOut() {
		Na(LoginEComprasPage.class).clicarBotaoFazerCheckOut();
	}

	@Quando("clico confirmar endereco")
	public void clicoConfirmarEndereco() {
		Na(LoginEComprasPage.class).clicarBotaoConfirmarEndereco();
	}

	@Quando("clico em aceito os termos e condicoes")
	public void clicoEmAceitoOsTermosECondicoes() {
		Na(LoginEComprasPage.class).clicarBotaoTermosECondicao();
	}

	@Quando("clico em leia os termos de servico")
	public void clicoEmLeiaOsTermosDeServico() {
		Na(LoginEComprasPage.class).clicarBotaoLerTermosECondicao();
	}

	@Quando("clico em avancar")
	public void clicoEmAvancar() {
		Na(LoginEComprasPage.class).clicarBotaoBotaoAvanco();
	}

	@Quando("clico botao Pay by bank wire")
	public void clicoBotaoPayByBankWire() {
		Na(LoginEComprasPage.class).botaoPagamento();
	}

	@Quando("clico confirmar compra")
	public void clicoConfirmarCompra() {
		Na(LoginEComprasPage.class).compraFinalizada();
	}

	@Quando("clico botao de voltar as encomendas")
	public void clicoBotaoDeVoltarAsEncomendas() {
		Na(LoginEComprasPage.class).voltandoAosPedidos();
	}

	@Quando("clico no campo home")
	public void clicoNoCampoHome() {
		Na(LoginEComprasPage.class).botaoHome();
	}

	@Quando("clico adicionar no carrinho item")
	public void clicoAdicionarNoCarrinhoItem() {
		Na(LoginEComprasPage.class).AddCarrinho();
	}

	@Quando("clico em remover do carrinho")
	public void clicoEmRemoverDoCarrinho() {
		Na(LoginEComprasPage.class).removerRoupaCarrinho();
	}

	@Entao("aparece a quantidade de itens")
	public void apareceAQuantidadeDeItens() {
		Na(LoginEComprasPage.class).campoBuascaApresentaQuantidadeProduto();
	}
	@Quando("informo na barra {string}")
	public void informoNaBarra(String string) {
		Na(LoginEComprasPage.class).campoBusca(string);
	}

	@Quando("verificar a quantidades de roupas no carrinho")
	public void verificarAQuantidadesDeRoupasNoCarrinho() {
		Na(LoginEComprasPage.class).quantidadeRoupas();;
	}
}