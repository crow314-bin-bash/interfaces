# Estudo de Caso: Resolução do Problema do Diamante em Java

Este projeto apresenta uma solução prática para o **Problema do Diamante** em Java. O objetivo é demonstrar como a linguagem utiliza **Interfaces** para permitir que uma classe possua múltiplos comportamentos sem os conflitos causados pela herança múltipla de classes.

## 📌 O Problema do Diamante
Em linguagens que permitem que uma classe herde de várias outras, pode ocorrer uma ambiguidade se duas classes "pai" possuírem métodos com a mesma assinatura. O Java evita este problema permitindo apenas a **herança simples** de classes e a **múltipla implementação** de interfaces.

## 🛠️ Estrutura do Sistema

O projeto é dividido em uma hierarquia que separa as definições de estado dos contratos de comportamento:

### 1. Classe Abstrata (`Device`)
A base de todos os dispositivos. Define o campo `doc` e o método `processDoc()`, que deve ser implementado obrigatoriamente por qualquer dispositivo específico.

### 2. Interfaces de Comportamento
Para resolver o problema do diamante, os comportamentos foram isolados em contratos:
*   `Printable`: Define a capacidade de realizar impressões.
*   `Scannable`: Define a capacidade de realizar digitalizações.

### 3. Implementações de Dispositivos
*   `Printer`: Um dispositivo que estende `Device` e implementa apenas `Printable`.
*   `Scanner`: Um dispositivo que estende `Device` e implementa apenas `Scannable`.
*   `MultifunctionalPrinter`: O ponto central do estudo. Esta classe estende `Device` e implementa **ambas** as interfaces (`Printable` e `Scannable`), herdando o comportamento de múltiplas fontes de forma segura e organizada.

## 🧠 Conceitos de POO Aplicados
*   **Abstração:** Uso de uma classe pai abstrata para evitar repetição de atributos.
*   **Interfaces:** Utilizadas para definir "o que um objeto faz", permitindo a composição de comportamentos.
*   **Encapsulamento:** Uso de modificadores de acesso (como `protected`) para proteger o estado do objeto.
*   **Polimorfismo:** A impressora multifuncional pode ser tratada genericamente como um dispositivo, ou especificamente por suas capacidades de impressão ou scanner.

---
*Estudo de caso focado em fundamentos de arquitetura e lógica de Programação Orientada a Objetos.*
