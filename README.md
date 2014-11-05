#Tutorial sobre o Gradle, Hamcrest e Mockito

  Neste tutorial iremos explicar como configurar o eclipse para utilizar o Gradle, o Hamcrest e o Mockito. Além disso, mostraremos alguns exemplos desses frameworks. O eclipse que estamos usando é a versão para Web Developers (Kepler Service Release 2). Se você não tem o eclipse, você poderá baixa-lo diretamente do site do eclipse (https://www.eclipse.org/downloads/).

  O código deste tutorial esta disponível em um repositório no Github (https://github.com/karlambsilva/exemplo-if1009), utilizaremos como exemplo um projeto Gradle criado no eclipse com 4 classes.
  
##Instalação  
  
### Gradle

O Gradle é um sistema de builds baseado no groovy que tem se tornando bastante popular nos últimos dias. O processo de instalação e bem simples. Primeiramente, você deve clicar no menu Help e em seguida Eclipse Marketplace como na figura 1.



Na janela de pesquisa, você pode pesquisar por Gradle e clicar no botão “Go”. Logo em seguida, você devera clicar em “Install” para o pacote desejado.

//Figura 2

Após clicar no botão Install, você deve selecionar os pacotes desejados e concordar com os termos de uso. Caso não tenha conhecimento sobre quais pacotes utilizar, você poderá deixar tudo marcado como na figura 3.

//Figura 3

Por fim, você deverá ser solicitado a reiniciar o eclipse para que as alterações tenham efeito. Após reinicia-lo você poderá criar o seu projeto Gradle.

//Explicar como criar um projeto

### Hamcrest
Dentro da secao de dependencias do build.gradle,  eh necessario especificar a versao e o pacote de dependencia que iremos utilizar. Voce pode adicionar o pacote all que contem todas as bibliotecas de Matchers do Hamcrest, conforme a figura XXX.

### Mockito


##Demonstração
Dentro da classe Conta temos os métodos Get e set, além de outros métodos especiais como o “debitar” e o “creditar”. O método “debitar” verifica se o valor a ser debitado é maior que o saldo conta, se isso acontecer, ele pode lançar uma exceção, a qual chamamos de OperaçãoIlegalException. Já o método creditar recebe um valor double e adiciona esse valor ao saldo da conta. Adicionalmente, temos a classe banco que possui uma lista de contas, descrição, telefone e um construtor.


###Hamcrest
O hamcrest é um framework que trabalha muito bem o JUnit. Ele foi desenvolvido para melhorar a legibilidade dos testes, tornando a execução mais detalhada e concisa. Para isto, ele possui uma serie de Matchers que estão divididos em bibliotecas. Os testes realizados com o framework Hamcrest podem ser encontrados no pacote org.gradle, na classe TestesHamcrest.java.

**Teste 1**

Na função creditarValor, utilizamos o método assertThat que recebe como parâmetro um objeto e uma Implementação de Matcher para fazer a verificação. Por exemplo, ele vai verificar se o saldo da contaPessoa1 é igual a 20.0. 

**Teste 2**


**Teste 3**


**Teste 4**


###Mockito
Um framework Open source que permite a criação de objetos mocks e spies, enquanto provê controle de todo o processo.

**Teste 1**



**Teste 2**


**Teste 3**


**Teste 4**
