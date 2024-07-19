package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {

	@FindBy(css = "a[class=\"login\"]")
	private WebElement signin;

	public void clicandoBotaoEntrar() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(signin));
		signin.click();

	}

	@FindBy(xpath = "//input[@name='email_create']")
	private WebElement campoEmail;

	public void campoCadastroEmail(String email) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(campoEmail));
		campoEmail.click();
		campoEmail.clear();
		campoEmail.sendKeys(email);
	}

	@FindBy(name = "SubmitCreate")
	private WebElement botaoCrieSuaConta;

	public void clicandoBotaoCriar() {
		botaoCrieSuaConta.click();

	}

	@FindBy(name = "id_gender")
	private WebElement clicoBotaoSenhor;

	public void clicandoBotaoSenhor() {
		clicoBotaoSenhor.click();
	}

	@FindBy(name = "customer_firstname")
	private WebElement areaNome;

	public void colocandoNome(String nome) {
		areaNome.sendKeys(nome);
	}

	@FindBy(id = "customer_lastname")
	private WebElement areaSobrenome;

	public void colocandoSobreome(String sobrenome) {
		areaSobrenome.sendKeys(sobrenome);
	}

	@FindBy(id = "passwd")
	private WebElement areaSenha;

	public void colocandoSenha(String senha) {
		areaSenha.sendKeys(senha);
	}

	@FindBy(id = "days")
	private WebElement botaoMostrarDia;

	@FindBy(xpath = "//select[@name='days']//option[@value='22']")
	private WebElement botaoDia;

	@FindBy(id = "months")
	private WebElement botaoMostrarMes;

	@FindBy(xpath = "//select[@name='months']//option[@value='8']")
	private WebElement botaoMes;

	@FindBy(id = "years")
	private WebElement botaoMostrarAno;

	@FindBy(xpath = "//select[@name='years']//option[@value='1956']")
	private WebElement botaoAno;

	public void mostrarDataNacimento() {
		botaoMostrarDia.click();
		botaoDia.click();
		botaoMostrarMes.click();
		botaoMes.click();
		botaoMostrarAno.click();
		botaoAno.click();
	}

	@FindBy(name = "newsletter")
	private WebElement clicoBotaoAssineNewsletter;

	public void clicandoBotaoAssinarNewsletter() {
		clicoBotaoAssineNewsletter.click();
	}

	@FindBy(id = "optin")
	private WebElement clicoBotaoOfertas;

	public void clicandoBotaoOfertas() {
		clicoBotaoOfertas.click();
	}

	@FindBy(id = "firstname")
	private WebElement campoNome;

	public void colocandoCampoNome(String nome) {
		campoNome.sendKeys(nome);
	}

	@FindBy(id = "firstname")
	private WebElement campoSobrenome;

	public void colocandoCampoSobrenome(String sobrenome) {
		campoSobrenome.sendKeys(sobrenome);
	}

	@FindBy(id = "company")
	private WebElement campoCompanhia;

	public void colocandoCampoEmpresa(String Companhia) {
		campoCompanhia.sendKeys(Companhia);
	}

	@FindBy(id = "address1")
	private WebElement campoEndereco;

	public void colocandoCampoEndereco(String endereco) {
		campoEndereco.sendKeys(endereco);
	}

	@FindBy(id = "address2")
	private WebElement campoEndereco2;

	public void colocandoCampoEndereco2(String endereco2) {
		campoEndereco2.sendKeys(endereco2);
	}

	@FindBy(id = "city")
	private WebElement campoCidade;

	public void colocandoCampoCidade(String cidade) {
		campoCidade.sendKeys(cidade);

	}

	@FindBy(id = "id_state")
	private WebElement botaoApresentarEstado;
	@FindBy(xpath = "(//option[@value = '31'])[2]")
	private WebElement botaoEstado;

	public void apresentarEstado() {
		botaoApresentarEstado.click();
		botaoEstado.click();
	}

	@FindBy(id = "postcode")
	private WebElement campoCodigoPostal;

	public void colocandoCampoPostal(String codigoPostal) {
		campoCodigoPostal.sendKeys(codigoPostal);
	}

	@FindBy(id = "other")
	private WebElement campoInformacao;

	public void colocandoInformacaoadicional(String informacao) {
		campoInformacao.sendKeys(informacao);

	}

	@FindBy(id = "phone")
	private WebElement campoTelefone;

	public void colocandoNumeroTelefone(String telefone) {
		campoTelefone.sendKeys(telefone);

	}

	@FindBy(id = "phone_mobile")
	private WebElement campoCelular;

	public void colocandoNumeroDoCelular(String telefone) {
		campoCelular.sendKeys(telefone);
	}

	@FindBy(id = "alias")
	private WebElement campoEnderecoAlternativo;

	public void colocandoEnderecoAlternativo(String endereco) {
		campoEnderecoAlternativo.sendKeys(endereco);
	}

	@FindBy(xpath = "//button[@name='submitAccount']")
	private WebElement clicoNoBotaoRegistro;

	public void clicandoBotaoRegistro() {
		clicoNoBotaoRegistro.click();
	}

	@FindBy(xpath = "//div//h1[contains(.,'My account')]")
	private WebElement campoMyAccount;

	public void campoTesteFinalizado() {
		assertTrue(campoMyAccount.isDisplayed());

	}

	@FindBy(xpath = "//li[contains(.,'lastname')]")
	private WebElement erroLastname;

	@FindBy(xpath = "//li[contains(.,'firstname')]")
	private WebElement erroFirstname;

	@FindBy(xpath = "//li[contains(.,'passwd')]")
	private WebElement erroPasswd;

	@FindBy(xpath = "//li[contains(.,'postcode is too long. Maximum length: 12')]")
	private WebElement erroCodigoPostalCepUm;

	@FindBy(xpath = "//li[contains(.,'The Zip/Postal')]")
	private WebElement erroCodigoPostalCepDois;

	@FindBy(xpath = "//li[contains(.,'This country requires you to choose a State.')]")
	private WebElement erroPaisEstado;

	@FindBy(xpath = "//div//p[contains(.,'There are 7 errors')]")
	private WebElement quantidadeErros;	

	public void erroCadastro() {
		assertTrue(erroLastname.isDisplayed());
		assertTrue(erroFirstname.isDisplayed());
		assertTrue(erroPasswd.isDisplayed());
		assertTrue(erroCodigoPostalCepUm.isDisplayed());
		assertTrue(erroCodigoPostalCepDois.isDisplayed());
		assertTrue(erroPaisEstado.isDisplayed());
		assertTrue(quantidadeErros.isDisplayed());
	}
}
