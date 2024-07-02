package enums;

public class Pedido {
    public enum StatusPedido {
        NOVO("Novo pedido recebido", 01),
        PROCESSANDO("Pedido está sendo processado", 02),
        ENVIANDO("Pedido foi enviado", 03),
        ENTREGUE("Pedido foi entregue", 04);

        private String descricao;
        public int codigo;

        StatusPedido(String descricao, int codigo) {
            this.descricao = descricao;
        }


        public String getDescricao() {
            return descricao;
        }

        public static void main(String[] args) {
            //novo pedido
            StatusPedido statusAtual = StatusPedido.NOVO;
            System.out.println("Status atual: " + statusAtual);
            System.out.println("Descrição: " + statusAtual.getDescricao());

            //pedido processando
            statusAtual = StatusPedido.PROCESSANDO;
            System.out.println("Status atual: " + statusAtual);
            System.out.println("Descrição: " + statusAtual.getDescricao());

            //status enviado
            statusAtual = StatusPedido.ENVIANDO;
            System.out.println("Status atual: " + statusAtual);
            System.out.println("Descrição: " + statusAtual.getDescricao());

            //status entregue
            statusAtual = StatusPedido.ENTREGUE;
            System.out.println("Status atual " + statusAtual);
            System.out.println("Descrição: " + statusAtual.getDescricao());

        }

    }
}
