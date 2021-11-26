
# [Mão na massa] - Consumindo API de CEP (ViaCep) usando OpenFeign

O objetivo foi criar uma rota que recebesse um CEP e retornasse os dados da consulta à API do ViaCep.

## Como rodar diretamente no terminal

```
mvn spring-boot:run
```
Após rodar a aplicação, para fazer uma consulta, acesse:

http://localhost:8080/cep/04538133

## Resultado

![resultado da consulta ao CEP](https://user-images.githubusercontent.com/17866411/143645964-b1502f10-9d7c-4f1c-a754-43c142f13efa.png)


## Referências

1. [ViaCEP API](https://viacep.com.br/)
2. [Spring Boot - Spring Cloud OpenFeign - Rodrigo Freitas](https://youtu.be/MA0HQnmPriI)