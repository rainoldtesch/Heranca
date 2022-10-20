public class TestaConta {

    public static void main(String[] args) {

        System.out.println();

        Conta contas[] = new Conta[3];
        ContaCorrente cc = new ContaCorrente(22, 1, "Banco AA", 100.00, 500.00);
        ContaPoupanca cp = new ContaPoupanca(33, 1, "Banco AA", 10.00, 20, 0.01);
        ContaSalario cs = new ContaSalario(44, 1, "Banco AA", 8000.00, 2);

        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;

        cc.sacar(3000);
        cp.sacar(500);
        cs.sacar(100);
        cs.sacar(50);
        cs.sacar(100);

        cc.depositar(252);
        cp.depositar(200);
        cs.depositar(21);

        System.out.println(" Obtendo o saldo das contas: ");

        for (Conta conta:contas) {
            System.out.println(conta);
            System.out.println("O saldo da conta é: R$ " + conta.getSaldo());
            System.out.println(" ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        }
    }
}
