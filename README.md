# Projeto Integrador IV-A – Calculadora Java com Testes Automatizados

Este repositório contém o desenvolvimento do Projeto Integrador IV-A do curso de **Análise e Desenvolvimento de Sistemas (EaD) da PUC Goiás**. O objetivo do projeto é aplicar, na prática, os conceitos aprendidos nas disciplinas de **Gerência de Configuração de Software** e **Gerência de Qualidade de Software**, por meio da construção de uma aplicação Java simples, com versionamento no Git e testes unitários utilizando JUnit 5.

## 🛠 Tecnologias Utilizadas

- Java (JDK 21 ou superior)
- JUnit 5
- Git e GitHub
- Visual Studio Code
- Terminal / PowerShell
- Scripts `.bat` para compilação e execução

## 📂 Estrutura do Projeto

```bash
calculadora/
├── bin/                         # Arquivos compilados (.class)
├── lib/
│   └── junit-platform-console-standalone-1.10.0.jar
├── src/
│   ├── main/java/Calc.java      # Classe principal da calculadora
│   ├── main/java/TesteCalc.java # Teste manual simples
│   └── test/java/CalcTest.java  # Testes automatizados com JUnit
├── compile.bat                 # Script para compilar o projeto
├── run-tests.bat              # Script para rodar os testes
└── README.md
