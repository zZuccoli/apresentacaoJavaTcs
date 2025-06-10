# Sistema de Gestão Empresarial para Empresa Farmacêutica

## Colaboradores do Projeto

1. Victor Scheller Zuccoli 
2. Pedro Firmani
3. Igor Duim Moro
4. Caio Alves Galassi 
5. Arion Teixeira

---

## Apresentação do Projeto

Este projeto foi desenvolvido como parte da disciplina de Gestão de Projetos, com o objetivo de criar uma solução de software para gerenciar os setores, colaboradores, recursos financeiros e logísticos de uma empresa farmacêutica em expansão.

A aplicação será totalmente desenvolvida em Java, sem o uso de frameworks externos, utilizando princípios de programação orientada a objetos, modularidade e boas práticas de codificação.

---

## Contextualização da Empresa

A empresa contratante possui atualmente 20 funcionários, distribuídos em 7 setores, conforme descrito abaixo:

| Setor                   | Quantidade de Funcionários |
|-------------------------|-----------------------------|
| Gerente de Filial       | 1                           |
| Atendimento ao Cliente  | 4                           |
| Gestão de Pessoas       | 4                           |
| Financeiro              | 3                           |
| Vendas                  | 5                           |
| Almoxarifado            | 3                           |
| Transportadoras         | Parceiros externos          |

A empresa enfrenta dificuldades em controlar adequadamente:

- Funcionários e setores;
- Controle de vendas e estoque;
- Logística de entrega;
- Dados financeiros (fluxo de caixa e lucros).

---

## Objetivo

O projeto visa fornecer um sistema de gestão integrado que permita:

- Gerenciar os dados dos funcionários, incluindo: nome completo, ID na empresa, idade e gênero.
- Controlar e calcular os salários com:
  - Impostos;
  - Vale transporte;
  - Vale refeição e alimentação;
  - Plano de saúde e odontológico;
  - Bonificações por participação nos lucros.
- Gerenciar o catálogo de produtos com:
  - Mínimo de 10 produtos diferentes;
  - Preço de compra e venda;
  - Quantidade em estoque.
- Registrar e atualizar entradas e saídas de caixa.
- Gerenciar transportadoras parceiras com locais de atendimento (mínimo de 3).
- Apresentar o caixa total da empresa.
- Gerar estimativas de lucros mensais e anuais com base nas vendas.
- Controlar negócios em andamento, incluindo vendedores e almoxarifado envolvidos.

---

## Informações Financeiras Padrão

- Caixa Inicial da Empresa: R$ 200.000,00  
- Vale Refeição/Alimentação: R$ 300,00 cada (progressivo por cargo)  
- Plano de Saúde: R$ 3.000,00 (progressivo por cargo)  
- Plano Odontológico: R$ 3.000,00  

### Tabela do Imposto de Renda (IRRF)

| Base de Cálculo (R$)                   | Alíquota (%) | Dedução do IR (R$) |
|----------------------------------------|--------------|---------------------|
| Até R$ 2.428,80                         | zero         | zero                |
| De R$ 2.428,81 até R$ 2.826,65          | 7,5%         | R$ 182,16           |
| De R$ 2.826,66 até R$ 3.751,05          | 15%          | R$ 394,16           |
| De R$ 3.751,06 até R$ 4.664,68          | 22,5%        | R$ 675,49           |
| Acima de R$ 4.664,68                    | 27,5%        | R$ 908,75           |

---

## Estrutura Esperada

A aplicação deverá conter classes principais como:

- Funcionario
- Setor
- Produto
- Estoque
- Venda
- Transportadora
- Financeiro
- Negocio

---

## Estimativas e Resultados Esperados

O sistema será capaz de:

- Gerar relatórios de desempenho financeiro;
- Controlar o fluxo de caixa em tempo real;
- Estimar os lucros mensais e anuais;
- Fornecer dados atualizados de estoque;
- Agilizar a logística de transporte.
