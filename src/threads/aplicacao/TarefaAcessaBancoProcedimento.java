package threads.aplicacao;

public class TarefaAcessaBancoProcedimento implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao gerenciadorDeTransacao;

    public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.gerenciadorDeTransacao = tx;
    }

    @Override
    public void run() {
        synchronized (pool) {
            System.out.println(this.toString() + " Comecando a tX");
            pool.getConnection();
            synchronized (gerenciadorDeTransacao) {
                System.out.println(this.toString() + " Peguei a conexão");
                gerenciadorDeTransacao.begin();
            }
        }
    }
}
