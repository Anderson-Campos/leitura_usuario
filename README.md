<h1>Programa de Leitura de Números com Estruturas while e do-while</h1>
<h2>Descrição</h2>
<p>Este programa em Java lê números inteiros fornecidos pelo usuário até que seja digitado o valor zero, que encerra a execução da estrutura de repetição. O programa é composto por duas seções, onde a primeira usa o laço while e a segunda o laço do-while. Ambas as seções têm o objetivo de ler os números continuamente, parando apenas quando o usuário digitar zero, mas o comportamento de execução inicial das duas estruturas é levemente diferente, o que facilita o aprendizado de controle de fluxo em Java.</p>

<p>Esse projeto é ideal para entender o uso e a diferença entre os laços while e do-while em situações práticas de entrada de dados.</p>

<h2>Estrutura do Código</h2>
<p>O código está dividido em duas partes, uma para cada estrutura de repetição:</p>

<ul>
  <li><strong>Leitura com o laço while</strong><br>
  Nesta seção, a execução do laço while ocorre apenas enquanto o valor digitado pelo usuário for diferente de zero. O laço começa verificando a condição antes de executar o bloco de leitura, ou seja, a primeira execução só acontece caso a condição seja satisfeita. A cada iteração, o usuário é solicitado a digitar um número, que é lido e armazenado em uma variável chamada resp. O laço é interrompido quando o valor de resp é igual a zero, momento em que uma mensagem é exibida para indicar a conclusão do bloco while.</li>

  <li><strong>Leitura com o laço do-while</strong><br>
  A segunda parte do programa utiliza o laço do-while, que, ao contrário do while, executa o bloco de código ao menos uma vez antes de verificar a condição. O laço solicita ao usuário a entrada de um número em cada iteração, armazena o valor em uma variável chamada respDW e executa a leitura até que o valor seja igual a zero. Ao final da execução do laço, é exibida uma mensagem informando que o bloco do-while foi concluído.</li>
</ul>
<p>Cada laço opera de forma independente e possui uma linha divisória entre as seções para facilitar a compreensão e visualização da execução de cada bloco.</p>

<h2>Objetivo do Projeto</h2>
<p>Este projeto foi desenvolvido com fins didáticos e permite:</p>
<ul>
  <li>Compreender o uso de laços while e do-while para o controle de repetição baseado em condições específicas.</li>
  <li>Verificar as diferenças de execução inicial entre as duas estruturas, já que o laço do-while sempre executa ao menos uma vez.</li>
  <li>Praticar a interação com o usuário através de entrada de dados no terminal e o controle de fluxo com base nas respostas recebidas.</li>
</ul>

<h2>Funcionamento</h2>
<p>Ao iniciar o programa, o usuário é solicitado a digitar números inteiros. O laço while realiza a leitura e para quando o valor zero é digitado. Em seguida, o laço do-while é executado, solicitando novamente números até que o valor zero seja inserido, momento em que também é interrompido. Mensagens de término indicam o fim de cada bloco.</p>
