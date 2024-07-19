#language:pt
#encondig: UTF-8


Funcionalidade: Criar usuario 

@CadastrarUsuario
 Cenario:  Criar conta
  Dado que eu esteja acessando my store
   Quando eu clico no botao sign in
    E informo o email "Vendas3@SanLorenzoCatholicChurchp.com"
    E clico botao Crie sua conta aqui
    E clico botao mr.
    E informo nome "Eduardo"
    E informo sobrenome "Luiz"
    E informo uma senha "Eduardo123"
    E adicionar a data de nacimento
    E clico nossa newsletter
    E clico botao receba ofertas
    E informo "Eduardop"
    E informo sobrenome "luizs"
    E informo companhia "igreja Catolica"
    E informo o endereco "Mountainair N:87036 Cep-79836, Igreja Catolica" 
    E informo endereco dois "San Lorenzo Catholic Church"
    E informo cidade "Mountainair"
    E clico botao estado Novo Mexico
    E informo Cep "79836" 
    E informo informacao adicional "Melhor ingreja"
    E informo telefone residencial "19997564836"
    E informo celular "19987524515"
    E informo endereco alternativo "TC N:87036"
    E clico botao Registro
    Entao a conta foi criada

@ErroCadastro
 Cenario:  Criar conta
  Dado que eu esteja acessando my store
   Quando eu clico no botao sign in
    E informo o email "Vendas09@SanLorenzoCatholicChurchp.com"
    E clico botao Crie sua conta aqui
    E clico botao mr.
    E informo nome "Eduardo2"
    E informo sobrenome "Luiz3"
    E adicionar a data de nacimento
    E clico nossa newsletter
    E clico botao receba ofertas
    E informo "Eduardop2"
    E informo sobrenome "luizs3"
    E informo companhia "igreja Catolica53"
    E informo cidade "Mountainair09988"
    E informo Cep "7983676769043" 
    E informo telefone residencial "199975654156164836"
    E informo celular "199875245545415"
    E informo endereco alternativo "TN:87036"
    E clico botao Registro
    Entao o sistema tera preenchido o cadastro no intuto do erro  