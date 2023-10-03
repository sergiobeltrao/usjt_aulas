# Diretrizes de contribuição :handshake:

Observação: Este documento ainda está em construção. Novas diretrizes serão adicionadas, e algumas diretrizes atuais podem ser removidas ou modificadas com base no feedback de vocês.

No projeto, estamos desenvolvendo em Java 17 e utilizando MySQL 8.0 para o banco de dados. Durante os testes e o desenvolvimento, o servidor do banco estará configurado com o usuário 'root' e a senha '12345', e estará operando na porta padrão 3306. Sempre que for codificar, lembre-se de usar as convenções de nomenclatura do Java, onde camelCase é usado em variáveis, atributos e métodos. PascalCase é utilizado para classes, enums e interfaces. SCREAMING_SNAKE_CASE é reservado para constantes. Em caso de dúvida, consulte o artigo [Java Naming Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)


## Mensagens de commit

As mensagens dos commits vão ser feitas com base na *Commit Message Format* do projeto do Angular com algumas modificações e adaptações.

[Leia mais aqui](https://github.com/angular/angular/blob/main/CONTRIBUTING.md)

```
<tipo>(<escopo>): <pequeno resumo>
  │       │             │
  │       │             └─⫸ Resumo em tempo presente. Sem letras maiúsculas, acentuação e ponto final.
  │       │
  │       └─⫸ Escopo do commit: readme|gitignore|nbproj|login|home|database|contributing
  │
  └─⫸ Tipo do commit: build|docs|feat|fix|perf|refactor|gitres
```

Tipo

* build: Alterações que afetam a construção do sistema.
* docs: Alterações na documentação.
* feat: Uma nova funcionalidade.
* fix: Uma correção de bug.
* perf: Uma alteração de código que melhora o desempenho.
* refactor: Uma alteração de código que não corrige um bug nem adiciona uma funcionalidade.
* gitres: Uma modificação em algum arquivo do Git que será enviado para o repositório (gitignore por exemplo).


Escopo

* readme: Relacionado ao arquivo README.md.
* gitignore: Relacionado ao arquivo .gitignore.
* nbproj: Relacionado a algum arquivo de configuração do projeto do NetBeans.
* login: Relacionado à tela de login do programa.
* home: Relacionado à tela principal do programa.
* database: Relacionado ao banco de dados.
* contributing: Relacionado ao arquivo das diretrizes de contribuição.

Exemplos de mensagem:

- "build(login): tela de login incluida"
- "build(nbproj): sistema de construcao migrado de ant para maven"

A inserção do tipo e do resumo do commit é obrigatória, mas o escopo é opcional. No entanto, recomendo que seja incluído para tornar a descrição do que foi feito ainda mais sucinta.


## Branch

Sempre que for fazer um commit, utilize a branch 'develop'. O código só será mesclado na 'main' quando uma funcionalidade estiver completa e for considerada estável.


## Imagens utilizadas

Para as imagens que serão incluídas no projeto, tome cuidado com imagens protegidas por direitos autorais. Recomendo o uso de sites como [PixaBay](https://pixabay.com/), [Pexels](https://www.pexels.com/pt-br/), [Unsplash](https://unsplash.com/pt-br) ou similares, que permitem o uso das imagens livremente. Nada de imagem do Google... :pinched_fingers: