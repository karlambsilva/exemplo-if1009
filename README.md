#Tutorial sobre o Gradle, Hamcrest e Mockito

  Neste tutorial iremos explicar como configurar o eclipse para utilizar o Gradle, o Hamcrest e o Mockito. Além disso, mostraremos alguns exemplos desses frameworks. O eclipse que estamos usando é a versão para Web Developers (Kepler Service Release 2). Se você não tem o eclipse, você poderá baixa-lo diretamente do site do eclipse (https://www.eclipse.org/downloads/).

  O código deste tutorial esta disponível em um repositório no Github (https://github.com/karlambsilva/exemplo-if1009), utilizaremos como exemplo um projeto Gradle criado no eclipse com 4 classes.
  
##Instalação  
  
### Gradle

O Gradle é um sistema de builds baseado no groovy que tem se tornando bastante popular nos últimos dias. O processo de instalação e bem simples. Primeiramente, você deve clicar no menu Help e em seguida Eclipse Marketplace como na figura 1.

//Figura 1

Na janela de pesquisa, você pode pesquisar por Gradle e clicar no botão “Go”. Logo em seguida, você devera clicar em “Install” para o pacote desejado.

//Figura 2

Após clicar no botão Install, você deve selecionar os pacotes desejados e concordar com os termos de uso. Caso não tenha conhecimento sobre quais pacotes utilizar, você poderá deixar tudo marcado como na figura 3.

//Figura 3

Por fim, você deverá ser solicitado a reiniciar o eclipse para que as alterações tenham efeito. Após reinicia-lo você poderá criar o seu projeto Gradle.

### Hamcrest
Dentro da secao de dependencias do build.gradle,  eh necessario especificar a versao e o pacote de dependencia que iremos utilizar. Voce pode adicionar o pacote all que contem todas as bibliotecas de Matchers do Hamcrest, conforme a figura XXX.

