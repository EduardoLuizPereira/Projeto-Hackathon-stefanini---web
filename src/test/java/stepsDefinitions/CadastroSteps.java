package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroPage;
import static utils.Utils.Na;

public class CadastroSteps {

	@Dado("que eu esteja acessando my store")
	public void queEuEstejaAcessandoMyStore() {

	}

	@Quando("eu clico no botao sign in")
	public void euClicoNoBotaoSignIn() {
		Na(CadastroPage.class).clicandoBotaoEntrar();

	}

	@Quando("informo o email {string}")
	public void informoOEmail(String string) {
		Na(CadastroPage.class).campoCadastroEmail(string);
	}

	@Quando("clico botao Crie sua conta aqui")
	public void clicoBotaoCrieSuaContaAqui() {
		Na(CadastroPage.class).clicandoBotaoCriar();
	}

	@Quando("clico botao mr.")
	public void clicoBotaoMr() {
		Na(CadastroPage.class).clicandoBotaoSenhor();
	}

	@Quando("informo nome {string}")
	public void informoNome(String string) {
		Na(CadastroPage.class).colocandoNome(string);
	}

	@Quando("informo sobrenome {string}")
	public void informoSobrenome(String string) {
		Na(CadastroPage.class).colocandoSobreome(string);
	}

	@Quando("informo uma senha {string}")
	public void informoUmaSenha(String string) {
		Na(CadastroPage.class).colocandoSenha(string);
	}

	@Quando("adicionar a data de nacimento")
	public void AdicionarADataDeNacimento() {
		Na(CadastroPage.class).mostrarDataNacimento();

	}

	@Quando("clico nossa newsletter")
	public void clicoNossaNewsletter() {
		Na(CadastroPage.class).clicandoBotaoAssinarNewsletter();

	}

	@Quando("clico botao receba ofertas")
	public void clicoBotaoRecebaOfertas() {
		Na(CadastroPage.class).clicandoBotaoOfertas();
	}

	@Quando("informo {string}")
	public void informo(String string) {
		Na(CadastroPage.class).colocandoCampoNome(string);
	}

	@Quando("informo companhia {string}")
	public void informoCompanhia(String string) {
		Na(CadastroPage.class).colocandoCampoSobrenome(string);

	}

	@Quando("informo o endereco {string}")
	public void informoOEndereco(String string) {
		Na(CadastroPage.class).colocandoCampoEndereco(string);
	}

	@Quando("informo endereco dois {string}")
	public void informoEnderecoDois(String string) {
		Na(CadastroPage.class).colocandoCampoEndereco2(string);

	}

	@Quando("informo cidade {string}")
	public void informoCidade(String string) {
		Na(CadastroPage.class).colocandoCampoCidade(string);

	}

	@Quando("clico botao estado Novo Mexico")
	public void clicoBotaoEstadoNovoMexico() {
		Na(CadastroPage.class).apresentarEstado();
	}

	@Quando("informo Cep {string}")
	public void informoCep(String string) {
		Na(CadastroPage.class).colocandoCampoPostal(string);
	}

	@Quando("informo informacao adicional {string}")
	public void informoInformacaoAdicional(String string) {
		Na(CadastroPage.class).colocandoInformacaoadicional(string);
	}

	@Quando("informo telefone residencial {string}")
	public void informoTelefoneResidencial(String string) {
		Na(CadastroPage.class).colocandoNumeroTelefone(string);
	}

	@Quando("informo celular {string}")
	public void informoCelular(String string) {
		Na(CadastroPage.class).colocandoNumeroDoCelular(string);
	}

	@Quando("informo endereco alternativo {string}")
	public void informoEnderecoAlternativo(String string) {
		Na(CadastroPage.class).colocandoEnderecoAlternativo(string);
	}

	@Quando("clico botao Registro")
	public void clicoBotaoRegistro() {
		Na(CadastroPage.class).clicandoBotaoRegistro();
	}

	@Entao("a conta foi criada")
	public void aContaFoiCriada() {
		Na(CadastroPage.class).campoTesteFinalizado();
	}

	@Entao("o sistema tera preenchido o cadastro no intuto do erro")
	public void oSistemaTeraPreenchidoOCadastroNoIntutoDoErro() {
		Na(CadastroPage.class).erroCadastro();
	}
}
