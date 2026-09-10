# Evidências e Documentação - Aula 05

## Etapa 1: Diagnóstico da Violação do OCP e Acoplamento
O método original da classe `GerenciadorLogin` utilizava blocos condicionais (`if/else`) com instanciação direta (`new`):

- **Violação do OCP:** Toda inclusão de perfil exige alteração no código do `GerenciadorLogin`.
- **Alto Acoplamento:** A classe cliente depende diretamente de todas as implementações concretas dos painéis.