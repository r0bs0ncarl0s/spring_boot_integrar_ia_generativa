# 💰 Financeiro - API de Gestão de Gastos com Inteligência Artificial

> Uma aplicação desenvolvida em **Spring Boot** utilizando **Spring AI** para processamento de áudio (transcrição de gastos com Whisper) e geração de respostas inteligentes baseadas em linguagem natural, estruturada em arquitetura limpa e Maven.

---

## 🚀 Tecnologias Utilizadas

* **Java 21** (LTS)
* **Spring Boot 4.0.5**
* **Spring AI** (Integração com OpenAI - Whisper e Chat Models)
* **Maven** (Gerenciamento de dependências e build)
* **Spring Data JPA / Hibernate**
* **IntelliJ IDEA Community**

---

## 📋 Funcionalidades

* 🎙️ **Transcrição de Áudio (Speech-to-Text):** Processa áudios contendo descrições de despesas financeiras utilizando o modelo **Whisper-1** da OpenAI.
* 🤖 **Processamento de Linguagem Natural (LLM):** Utiliza o modelo **GPT-4o-mini** em conjunto com prompts customizados do sistema para extração e categorização inteligente de gastos.
* 🔊 **Síntese de Voz (Text-to-Speech):** Capacidade de converter textos em áudio usando os modelos da OpenAI.
* 💾 **Persistência de Dados:** Integração com banco de dados relacional via Spring Data JPA para salvar e listar as transações financeiras.

---

## ⚙️ Pré-requisitos

Certifique-se de ter instalado em sua máquina:
* **JDK 21** configurado no PATH.
* **Maven 3.x**.
* Uma chave de API válida da OpenAI (`OPENAI_API_KEY`).

---

## 🔑 Configuração de Ambiente

Para que a aplicação consiga acessar os serviços de IA, é necessário configurar a sua chave da OpenAI como uma **variável de ambiente** no seu sistema operacional ou IDE:

```bash
# No Windows (Prompt de Comando / PowerShell)
set OPENAI_API_KEY=sua-chave-aqui

# No Linux / macOS
export OPENAI_API_KEY="sua-chave-aqui"