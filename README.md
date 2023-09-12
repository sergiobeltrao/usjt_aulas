# Guia de Comandos Git


## Configuração Inicial

```sh
git config --global user.name "Seu Nome"
git config --global user.email seuemail@email.com
git init
git branch -M main
git remote add origin https://github.com/nomedousuario/repositorio_criado.git
```

## Fazer Commits de Mudanças

```sh
git add .
git commit -m "Descrição do commit"
```
Para enviar use:
```sh
git push origin main
```
ou
```sh
git push https://token@github.com/sergiobeltrao/usjt_aulas
```

## Atualizar o Repositório Local

```sh
git pull origin main
```

## Clonar um Repositório Existente

Crie uma nova pasta e navegue até ela com o terminal e por fim:
```sh
git clone https://github.com/sergiobeltrao/usjt_aulas .
```


## Resolvendo Conflitos em Commits Rejeitados

```sh
git pull origin main
```

Após o pull, analise o código-fonte, faça as edições necessárias, salve e siga estas etapas para fazer o commit novamente:

```sh
git add .
git commit -m "Descrição do commit"
```
Para enviar use:
```sh
git push origin main
```
ou
```sh
git push https://token@github.com/sergiobeltrao/usjt_aulas
```

## Aplicando Regras do .gitignore em Arquivos e Pastas Já Rastreados

```sh
git rm -r --cached .
git add .
git commit -m "Corrigindo arquivos não rastreados"
```
