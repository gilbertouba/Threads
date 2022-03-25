package threads.aplicacao;

public class TarefaImprimirLista implements Runnable {
    private Lista lista;

    public TarefaImprimirLista(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        synchronized (lista) {
            if (!lista.estaCheia()) {
                try {
                    System.out.println("Aguardando encher lista.");
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.pegaElemento(i));
        }
    }
}
