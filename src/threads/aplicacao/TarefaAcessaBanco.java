package threads.aplicacao;

public class TarefaAcessaBanco implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessaBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run(){

        synchronized (pool){
            for (int i=0;i<=100000000;i++){

            }
            System.out.println(this.toString()+" peguei a chave do pool");
            pool.getConnection();
            synchronized (tx){
                System.out.println(this.toString()+" comecando a gerenciar a tx");
                tx.begin();
            }

        }

    }
}
