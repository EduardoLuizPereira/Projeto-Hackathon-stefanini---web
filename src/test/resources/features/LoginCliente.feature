#language:pt
#encondig: UTF-8

Funcionalidade: fazer login e compras

@Login
Cenario: apos fazer login fazer compras
    Dado que eu o usuario esteja fazendo login
    Quando eu clico no botao sing in
    E informar no campo email "Vendas3@SanLorenzoCatholicChurchp.com"
    E informar no campo senha "Eduardo123"
    E clico botao entrar
    Entao a conta foi logada com sucesso
    Quando clico botao lista de desejos 
    E clico em vestido de chiffon
    E clico no add lista de desejos
    E clico botao fechar
    E clico em add carrinho
    E clico botao continuar
    E clico botao fazer o check-out
    E clico confirmar endereco
    E clico em leia os termos de servico
    E clico em aceito os termos e condicoes
    E clico em avancar
    E clico botao Pay by bank wire
    E clico confirmar compra
    E clico botao de voltar as encomendas
    E clico no campo home
    E clico adicionar no carrinho item
    E clico em remover do carrinho
    E verificar a quantidades de roupas no carrinho
    E clico no campo home
    E informo na barra "Printed Summer Dress"
    Entao aparece a quantidade de itens
    