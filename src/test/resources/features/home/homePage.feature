#language: pt
@home
Funcionalidade: Testar a página home
Como usuário
Eu quero acessar a página home
Para validar os elementos.

@TC0001
Cenário: Acessa a página home e valido o texto "Nossas soluções_"
Dado que realizo o acesso ao endereço "home"
Então visualizo o titulo "Nossas soluções_"

@TC0002
Cenário: Acessa a página home e valido o texto "Culture e Tech"
Dado que realizo o acesso ao endereço "home"
Então visualizo o titulo "Culture e Tech"