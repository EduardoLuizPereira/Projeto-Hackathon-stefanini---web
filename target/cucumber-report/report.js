$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginCliente.feature");
formatter.feature({
  "name": "fazer login e compras",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "apos fazer login fazer compras",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu o usuario esteja fazendo login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginEComprasSteps.queEuOUsuarioEstejaFazendoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao sing in",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginEComprasSteps.euClicoNoBotaoSingIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo email \"Vendas3@SanLorenzoCatholicChurchp.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.informarNoCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo senha \"Eduardo123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.informarNoCampoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a conta foi logada com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginEComprasSteps.aContaFoiLogadaComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao lista de desejos",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoListaDeDesejos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em vestido de chiffon",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoEmVestidoDeChiffon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no add lista de desejos",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoNoAddListaDeDesejos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao fechar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em add carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoEmAddCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao continuar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoContinuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao fazer o check-out",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoFazerOCheckOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico confirmar endereco",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoConfirmarEndereco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em leia os termos de servico",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoEmLeiaOsTermosDeServico()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em aceito os termos e condicoes",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoEmAceitoOsTermosECondicoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em avancar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoEmAvancar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao Pay by bank wire",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoPayByBankWire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico confirmar compra",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoConfirmarCompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao de voltar as encomendas",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoBotaoDeVoltarAsEncomendas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo home",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoNoCampoHome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico adicionar no carrinho item",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoAdicionarNoCarrinhoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em remover do carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoEmRemoverDoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verificar a quantidades de roupas no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.verificarAQuantidadesDeRoupasNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no campo home",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.clicoNoCampoHome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo na barra \"Printed Summer Dress\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginEComprasSteps.informoNaBarra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aparece a quantidade de itens",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginEComprasSteps.apareceAQuantidadeDeItens()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});