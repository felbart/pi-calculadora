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

```


✅ Funcionalidades
Operações básicas: soma, subtração, multiplicação e divisão

Tratamento de exceção para divisão por zero

Testes automatizados com cobertura de:

Casos comuns

Operações com zero

Valores negativos

Limites de inteiros (Integer.MAX_VALUE e Integer.MIN_VALUE)

Simulação de overflow

Verificação de exceções

Teste propositalmente incorreto para demonstração

🚀 Como Executar
Baixe ou clone o repositório:

```
git clone https://github.com/seu-usuario/pi-calculadora.git
Adicione o JUnit à pasta lib/

```
Baixe o .jar do JUnit 5 aqui:
Download - junit-platform-console-standalone-1.10.0.jar


Compile os arquivos:
Execute o script compile.bat ou rode no terminal:

```
javac -cp lib\junit-platform-console-standalone-1.10.0.jar -d bin src\main\java\Calc.java src\test\java\CalcTest.java
```
Execute os testes:

```
java -jar lib\junit-platform-console-standalone-1.10.0.jar --classpath bin --scan-classpath
```

🔄 Controle de Versão
Branch principal: main

Branch de funcionalidade: feature/calculadora

Commits organizados e merge realizado conforme boas práticas

📚 Projeto Acadêmico
Este projeto faz parte da disciplina Projeto Integrador IV-A do curso de ADS (EaD) da PUC Goiás, com foco prático na aplicação de testes, versionamento e qualidade de código.

Desenvolvido por:
Felipe Leite
linkedin.com/in/felbart
