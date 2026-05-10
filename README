# Projeto FiapRide - Guilherme Martins Rezende

## Informações do Aluno

- **Nome:** Guilherme Martins Rezende
- **RM:** 563500
- **Turma:** 2CCPO
- **Curso:** Ciências da computação
- **GitHub:** https://github.com/Rezenderzd

---

## Descrição do Projeto
Este projeto é o resultado do aprendizado nas aulas 1-9 de Progra
mação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).
---
## Checklist de Implementação
- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces
---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`?  Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"

**Resposta:** 
A orientação a objeto serve para facilitar a manutenção do código. Em um código simples, essa implementação pode ser funcional até um certo ponto, caso houvessem centas de milhares de usuários, seria muito trabalhosa a manutenção, levando tempo que poderia ser investido em melhorias em outras áreas.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo+ 100` diretamente no código principal, porque dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Resposta:**
É necessário criar métodos para a proteção do código, pois se essa funcionalidade estivesse disponível diretamente no main, qualquer usuário poderia adicionar uma quantidade x de saldo a sua conta, podendo utilizar o aplicativo com um dinheiro "inexistente". Para isso, é necessário a criação de um método que realize a função desejada.

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?

**Resposta:**
Pois com o atributo original público, é simples de realizar alguma alteração, deixando o código vulnerável. Com os getters públicos, o que é retornado é apenas o valor daquele atributo, sendo impossível alterá-lo com aquela função pública, deixando o atributo seguro para não ser alterado facilmente.

---

### Aula 4 - Construtores

**Pergunta:** Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método `setModelo()`
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"

_Dica: Pense sobre o que pode ou não mudar fisicamente em um carr
o, e a diferença entre "alterar um dado no banco" e "executar um
processo real no Detran_

**Resposta:**

É um erro grave pois muitas vezes essas funções podem não ser utilizadas no decorrer do código e assim se tornam métodos inúteis, dificultando a manutenção e deixando-o poluído sem qualquer necessidade. Os métodos setters devem ficar privados pelo mesmo motivo dos atributos: para não serem alterados de forma a usuários encontrarem vulnerabilidades e se beneficiarem de tais falhas, além disso, com o méotodo atualizar placa, também ocorre uma verificação antes que o atributo seja realmente alterado.

---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?_

**Resposta:**

Seria mais simples, mas na classe Viagem também poderia utilizar do objeto Passageiro em outros métodos, ficando mais simples chamá-lo por completo para esse tipo de situação em comparação a chamar apenas a String nomeDoPassageiro. Poderia possuir um método que pedisse seu saldo, seria mais um atributo a ser criado sendo que poderia apenas criar um pegando todos os atributos da classe Passageiro.

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Resposta:**

O Java não permite essa alteração para que apenas as próprias classes consigam alterar seus atributos. Assim, apenas a classe Veículo pode alterar os valores de atributos presentes na classe Veículo e a classe Carro só pode alterar os valores de atributos presentes na classe Carro.

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Resposta:**
Não seria possível chamar pois como a lista é feita através da classe Veiculo, ela só consegue acessar atributos e métodos presentes na classe veículo. Por mais que em ambas as classes (Carro e Moto) possuissem calcularAutonomia() não seria possível acessar por não estar presente na classe da lista (Veiculo).

---

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho? 

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Resposta:**
O Java exige o modificador abstract porque, sem ele, a classe é considerada concreta e o sistema permitiria instanciar um new Veiculo(). Como um 'veículo' genérico não existe fisicamente, apenas como conceito, a palavra-chave serve como uma trava de segurança. Isso impede a criação de objetos incompletos, garantindo que o software utilize apenas classes específicas e válidas, como Carro ou Moto, mantendo a integridade das regras de negócio.

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`? 

Como as interfaces resolvem esse problema?

**Resposta:**
Pois um CarroEletrico não é um tipo de bateria, então ele não poderia ser herdado dessa classe. Ainda assim, caso chamasse o método ligar, haveria uma confusão no código. As interfaces servem para isso: implementar métodos que podem estar presentes em mais de uma classe mas que não possuam relação (como o método ligar pode estar presente tanto em CarroEletrico quanto em Celular).

---
## Desafios Técnicos Implementados

### Desafio Pessoal (Meu projeto)

*Qual foi o domínio que você escolheu para seu projeto pessoal?*

R: Eletrodométicos

*Quais classes você criou?*

R: Televisao, Eletrodomestico, VideoGame

*Qual foi o maior desafio técnico que você enfrentou?*

R: Realizar a implementação de uma interface que estivesse presente em múltiplas classes mas que não existisse relação entre elas. Para essa resolução, considerei que poderia existir um método interpretando se o objeto daquela respectiva classe pode ser deslocado de um local para o outro ou se ele é estático. Para implementá-la, utilizei a classe Carro, Predio e Celular. Com isso, apliquei o método em @Override e determinei que em Carro e Celular a função retornaria true e para Predio retornaria false. Dessa forma, é possível descobrir se cada um dos objetos é deslocável mesmo que as suas classes não possuam nenhuma relação (nem métodos e nem atributos compartilhados ou semelhantes). Fora esse desafio, tive dificuldade em compreender a identificar quando uma classe seria abstrata ou não, entretanto conforme foram sendo citados os exemplos durante a aula e em dúvidas tiradas com o professor, ficou mais claro quando devo utilizá-las.

## Conclusão

*O que você aprendeu nestas 9 aulas?*

Com estas 9 aulas tive uma boa base de como funciona a programação orientada a objetos e já comecei a aplica-la em projetos pessoais para continuar meu desenvolvimento. Com essas aulas, por mais que muitas funções estejam presentes apenas na linguagem Java, já da o necessário para poder aplica-la em outras linguagens, como Python e JavaScript.

*Qual conceito foi mais difícil de entender?*

Considero que o conceito mais difícil foi a classe abstrata, mas como já foi citado a cima, no decorrer da explicação e após tirar dúvidas com o professor ficou mais claro quando é ideal utiliza-la e quando devemos manter a classe normal.

*O que você melhoraria no seu projeto se pudesse refazer?*

Considero que minha classe Televisão possuiu muitos atributos que poderiam ser repartilhados em classes menores para melhor organização do código.
