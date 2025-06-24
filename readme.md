🔒 Singleton
🎯 Propósito
O Singleton é um padrão de projeto criacional que permite garantir que uma classe tenha apenas uma instância, enquanto fornece um ponto de acesso global para essa instância.

❗ Problema
O padrão Singleton resolve dois problemas principais:

Garantir instância única
Útil para controlar o acesso a recursos compartilhados, como conexões com banco de dados, arquivos, serviços ou configurações globais.

Acesso global controlado
Substitui o uso de variáveis globais inseguras, oferecendo um método seguro e centralizado para acessar a instância.

⚠️ Porém, ele viola o Princípio da Responsabilidade Única ao combinar controle de instância com acesso global.

🛠️ Solução
Todas as implementações Singleton seguem estes passos:

O construtor da classe é privado, impedindo o uso de new fora da própria classe.
Um método estático getInstance() controla o acesso e cria a instância apenas quando necessário (lazy initialization).
Em ambientes multithread, o acesso à instância deve ser sincronizado para evitar duplicações.
🧠 Analogia com o mundo real
Pense em um governo: um país só pode ter um governo legítimo ao mesmo tempo.
Ainda que seus membros mudem, existe apenas um ponto de acesso oficial — o próprio governo.

💻 Implementação (Java)
✔️ Com Singleton — Conexão com Banco de Dados
public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Conexão com banco criada.");
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executando: " + sql);
    }
}

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.query("SELECT * FROM usuarios");

        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM produtos");

        System.out.println(db1 == db2); // true
    }
}
❌ Solução sem Singleton
Problema: múltiplas instâncias e desperdício de recursos
public class Database {
    public Database() {
        System.out.println("Nova instância de Database criada.");
    }

    public void query(String sql) {
        System.out.println("Executando: " + sql);
    }
}

public class Main {
    public static void main(String[] args) {
        Database db1 = new Database(); // Nova instância
        Database db2 = new Database(); // Outra instância
        System.out.println(db1 == db2); // false ❌
    }
}
⚠️ Isso pode causar inconsistência, desperdício de memória e múltiplas conexões desnecessárias.
✅ Aplicabilidade
Use o padrão Singleton quando:
Uma única instância deve ser compartilhada entre diversos módulos.

Deseja-se evitar variáveis globais inseguras.

O controle de acesso e uso de recursos compartilhados é crítico (ex: logs, banco de dados, configuração).

📈 Prós e Contras
✅ Vantagens
Garante uma instância única
Acesso global e controlado
Inicialização tardia (lazy) otimiza memória
Protege contra sobrescritas e múltiplos new
⚠️ Desvantagens
Viola o Princípio da Responsabilidade Única
Pode mascarar um design acoplado demais
Difícil de testar e simular (testes unitários complexos)
Exige tratamento especial em ambientes multithread
