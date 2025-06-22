# 🔒 Singleton – Padrão de Projeto **Criacional**

## 💡 O que é?

O Singleton é um padrão de projeto **criacional** que assegura que **uma classe tenha apenas uma instância**, além de oferecer um **ponto de acesso global** a essa instância.

---

## 🎯 Problema que resolve

1. **Garantir instância única** — necessário quando mais de uma instância causaria inconsistência ou uso excessivo de recursos (ex: conexão de banco ou arquivo).  
2. **Ponto global de acesso** — substitui variáveis globais inseguras, protegendo a instância contra sobrescrita.

---

## 🧠 Estrutura do padrão (implementação típica em Java)

1. **Construtor privado**
2. **Campo estático** para armazenar a instância
3. **Método estático** `getInstance()` que instancia de forma *lazy* e retorna a mesma instância 

```java
public class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        System.out.println("Configuração criada.");
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}


| ✅ Pontos Fortes                         | ⚠️ Pontos Fracos                                                                               |
| --------------------------------------- | ---------------------------------------------------------------------------------------------- |
| Garante uma única instância             | Viola o princípio da **responsabilidade única** 
| Fornece ponto de acesso global          | Pode ocultar baixo acoplamento e dificultar testes                                             |
| Inicialização *lazy* economiza recursos | Exige atenção em ambiente multithread                                                          |


