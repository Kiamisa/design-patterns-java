# Padrões de Design em Java

Este repositório contém implementações de diversos padrões de design em Java, organizados em três categorias principais: Comportamentais, Criacionais e Estruturais.

## Índice

1. [Padrões Comportamentais](#padrões-comportamentais)
   - [Chain of Responsibility](#chain-of-responsibility)
   - [Command](#command)
   - [Template Method](#template-method)
2. [Padrões Criacionais](#padrões-criacionais)
   - [Builder](#builder)
   - [Factory Method](#factory-method)
   - [Prototype](#prototype)
3. [Padrões Estruturais](#padrões-estruturais)
   - [Adapter](#adapter)
   - [Flyweight](#flyweight)
   - [Proxy](#proxy)

## Padrões Comportamentais

### Chain of Responsibility

O padrão Chain of Responsibility permite que um pedido passe por uma cadeia de objetos receptores até que um deles trate o pedido. Isso permite que os objetos se comuniquem sem saber nada sobre os outros.

- **Localização:** `behavioral/ChainOfResponsibility`
- **Descrição:** Implementação do padrão Chain of Responsibility em Java.

### Command

O padrão Command transforma uma solicitação em um objeto, encapsulando todos os detalhes sobre a solicitação. Isso permite parametrizar objetos com operações, enfileirar operações e suportar operações desfazíveis.

- **Localização:** `behavioral/Command`
- **Descrição:** Implementação do padrão Command em Java.

### Template Method

O padrão Template Method define o esqueleto de um algoritmo na classe base, permitindo que subclasses implementem partes específicas do algoritmo sem alterar sua estrutura.

- **Localização:** `behavioral/TemplateMethod`
- **Descrição:** Implementação do padrão Template Method em Java.

## Padrões Criacionais

### Builder

O padrão Builder fornece uma maneira de construir um objeto complexo passo a passo. Ele separa a construção de um objeto da sua representação, permitindo criar diferentes representações com o mesmo processo de construção.

- **Localização:** `creational/Builder`
- **Descrição:** Implementação do padrão Builder em Java.

### Factory Method

O padrão Factory Method define uma interface para criar um objeto, mas permite que subclasses alterem o tipo de objeto que será criado.

- **Localização:** `creational/FactoryMethod`
- **Descrição:** Implementação do padrão Factory Method em Java.

### Prototype

O padrão Prototype permite criar novos objetos copiando um objeto existente, conhecido como protótipo. Isso é útil quando a criação de um objeto é cara ou complexa.

- **Localização:** `creational/Prototype`
- **Descrição:** Implementação do padrão Prototype em Java.

## Padrões Estruturais

### Adapter

O padrão Adapter permite que interfaces incompatíveis trabalhem juntas, convertendo a interface de uma classe em outra interface que um cliente espera.

- **Localização:** `structural/Adapter`
- **Descrição:** Implementação do padrão Adapter em Java.

### Flyweight

O padrão Flyweight usa o compartilhamento para suportar grandes quantidades de objetos de forma eficiente. Ele divide um objeto em uma parte intrínseca e uma parte extrínseca, compartilhando a parte intrínseca.

- **Localização:** `structural/Flyweight`
- **Descrição:** Implementação do padrão Flyweight em Java.

### Proxy

O padrão Proxy fornece um substituto ou representante para outro objeto, controlando o acesso a ele. Isso pode ser usado para adiar a criação de objetos caros ou para adicionar funcionalidades adicionais.

- **Localização:** `structural/Proxy`
- **Descrição:** Implementação do padrão Proxy em Java.
