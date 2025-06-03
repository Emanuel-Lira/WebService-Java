# 🏦 Projeto API de Contas Bancárias

Este é um projeto de exemplo desenvolvido em Java usando **Spring Boot**, com integração ao banco de dados **MySQL**, utilizando **JPA** para persistência e **Lombok** para simplificar o código. O sistema simula operações básicas com contas bancárias.

---

## ✅ Funcionalidades

- ✅ Criar uma nova conta bancária
- ✅ Listar todas as contas cadastradas
- ✅ Buscar conta por ID
- ✅ Buscar contas pelo nome do titular (com busca parcial e ignorando maiúsculas/minúsculas)
- ✅ Atualizar parcialmente uma conta (agência, titular ou saldo)

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Swagger (OpenAPI)

---

## 🚀 Executando o Projeto
Clone o repositório:

```
git clone https://github.com/Emanuel-Lira/WebService-Java.git
```

- Abra em sua IDE (IntelliJ, VS Code, etc.)

- Execute a classe AtendimentoApplication.java

- Acesse o Swagger para testar os endpoints:
 ```
http://localhost:8080/swagger-ui/index.html
  ```
  
--- 

## 📦 Exemplos de Requisições
- Criar Conta (POST /contas)
```
{
  "agencia": 123,
  "titular": "Maria da Silva",
  "saldo": 2500.0
}
```
  
--- 


## 👨‍🎓 Sobre
- Este projeto foi desenvolvido como atividade acadêmica para praticar os conceitos de:

- Camadas Controller, Service, Repository, Entity

- Integração com banco de dados relacional

- Boas práticas com Spring Boot

## 🗄️ Estrutura do Banco de Dados
```
CREATE TABLE conta (
    conta INT AUTO_INCREMENT PRIMARY KEY, 
    agencia INT NOT NULL,                  
    titular VARCHAR(100) NOT NULL,         
    saldo DECIMAL(10,2) NOT NULL  
);
```

