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

**Saiba mais sobre o Hamcrest**: <https://www.youtube.com/watch?v=_9VDHdBorIA> e <https://www.youtube.com/watch?v=F9JDwxTHa5Y>

**Teste 1**
Na função creditarValor, utilizamos o método assertThat que recebe como parâmetro um objeto e uma Implementação de Matcher para fazer a verificação. Por exemplo, ele vai verificar se o saldo da contaPessoa1 é igual a 20.0. 

**Teste 2**
O segundo teste validará se a exceção **OperacaoIlegalException** foi levantada. Para fazer esse verificação precisamos adicionar a classe da exceção que o teste deve esperar dentro da notação de test. A linha 40 da classe TestesHamcrest demonstra essa operação. 
No nosso exemplo, o teste passará apenas se a exceção for levantada.

**Teste 3**
Na função encontrarCLienteRico, através do método assertThat testaremos se o cliente possui mais de 1000 reais na conta.

**Teste 4**
O test 4 demonstra o uso do método _containsString_ que faz parte da biblioteca Text que valida o matching para strings. No nosso exemplo (linhas 57 - 65), validamos se a string "2" está contida no nome da conta. 

**Teste 5**
Na função validarJurosAdicionados, utilizaremos o método assertThat para verificar se o os juros foram creditados corretamente na conta do cliente

###Mockito
Um framework Open source que permite a criação de objetos mocks e spies, enquanto provê controle de todo o processo. Permite integração com o Maven, o Gradle, o JUnit, o TestNG,  o Hamcrest, o Jenkins, entre outros.

**Saiba mais sobre o Mockito**: <https://www.youtube.com/watch?v=bBiR6x7RqZc> e <https://www.youtube.com/watch?v=Vind9YEUyLM> 

**Teste 1**
O 1º teste demostra o uso da **função verify** para mocks. Como passo inicial para criação desse código cria-se um mock da classe Banco para então utilizar o verify. A função verify é importante para validar se determinadas funções declaradas no mock foram chamadas. 
Nas linhas 21 e 22 da classe TestesMockito são declarados os métodos que serão chamados e os parâmetros que eles receberão. Nas linhas 26 e 27, é validado se os métodos informados foram chamados e verifica se a informação retornada foi a criada para o mock.

**Teste 2**
O 2º teste também demonstra a **função verify**, contudo foi escrito para gerar uma falha. Novamente, o primeiro passo para descrição desse código de teste é criar um mock do tipo Banco. Nas linhas 42 e 43 da classe TestesMockito é declarado que a descrição do Banco será "Banco Recife". Esse é o resultado que estamos defenindo para o nosso mock.  
O teste deverá falhar, pois apesar de colocarmos o mock com a descrição "Banco do Recife", ao utilizar o verify estamos verificando se a descrição é "Banco Olinda".

**Teste 3**
O 3º teste demosntra a criação de um mock do tipo Conta. Onde, após criado o mock, que foi chamado de mockedConta, definimos que todas as vezes que pegarmos a variável saldo o mock deve retorna com o saldo no valor 0.0. Para testar se isto realmente acontece, utilizamos o **assertEquals** para verificar se o saldo do mockedConta é realmente 0.0.




