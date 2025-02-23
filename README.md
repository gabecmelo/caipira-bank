# 🏦 Caipira Bank - Sistema Bancário Simples

Um projeto Java que simula operações bancárias básicas em contas corrente e poupança, com uma interface simples via terminal. Desenvolvido com humor e simplicidade, no estilo "caipira".

## 📋 Descrição

O **Caipira Bank** é um sistema bancário fictício que permite:
- Criação de contas corrente e poupança
- Consulta de saldo
- Depósitos
- Transferências entre contas
- Troca de conta ativa
- Interface amigável com mensagens no estilo interiorano

## ⚙️ Funcionalidades

- **Duas Contas Disponíveis:**
   - `Conta Corrente`: Depósitos sem taxas
   - `Conta Poupança`: Taxa de 1% em cada depósito

- **Operações:**
   - 👀 Ver saldo
   - 💰 Depositar valores
   - 🔄 Transferir entre contas
   - 🔁 Trocar de conta ativa
   - 🚪 Sair do sistema

## 🛠️ Pré-requisitos

- Java JDK 11 ou superior
- Git (opcional para clonar repositório)

## 🚀 Como Executar

### 1. Via Terminal:
```bash
# Clone o repositório (se aplicável)
git clone https://github.com/gabecmelo/caipira-bank.git

# Navegue até o diretório
cd caipira-bank/src

# Compile o projeto
javac Main.java Conta.java ContaBancaria.java ContaCorrente.java ContaPoupanca.java TipoConta.java

# Execute
java Main 
```

### 2. Usando IDE:

1. Abra o projeto no Eclipse/IntelliJ
2. Localize o arquivo Main.java
3. Execute como Java Application


### 📦 Compilando um Executável .jar

Para criar um arquivo .jar executável:

### Usando Linha de Comando:

```bash
# Compile todas as classes
javac -d bin src/*.java

# Crie o JAR com manifest
jar cfe CaipiraBank.jar Main -C bin .

# Execute
java -jar CaipiraBank.jar
```

## 📂 Estrutura do Projeto
```
src/
├── Main.java            - Classe principal
├── Conta.java           - Interface das operações
├── ContaBancaria.java   - Classe abstrata base
├── ContaCorrente.java   - Implementação conta corrente
├── ContaPoupanca.java   - Implementação conta poupança
└── TipoConta.java       - Enum para tipos de conta
```

## 💡 Observações Importantes
1. **Primeira Execução:**
   - As contas começam com saldo zero
   - Escolha qual conta usar inicialmente
2. **Fluxo de Operações**:
   - Use números para navegar no menu
   - Valores monetários devem usar . para decimais (ex: 100.50)
3. **Transferências:**
   - A transferência é sempre para a outra conta
   - Verificação automática de saldo
4. **Troca de Contas:**
   - Alterna imediatamente entre corrente/poupança

## 🤝 Contribuição
Contribuições são bem-vindas! Siga estes passos:

1. Fork o projeto
2. Crie uma branch (git checkout -b feature/nova-feature)
3. Commit suas mudanças (git commit -m 'Adiciona nova feature')
4. Push para a branch (git push origin feature/nova-feature)
5. Abra um Pull Request

## 📄 Licença
Este projeto está sob licença MIT - veja o arquivo [LICENSE](https://github.com/gabecmelo/caipira-bank/blob/main/LICENSE) para detalhes.

### **Divirta-se gerenciando seu dinheiro no estilo caipira! 🧑🌾🚜**
