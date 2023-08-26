public class Conta {
    
    int numeroConta;
    String agencia;
    String nomeCliente;
    Double saldo;

    void atribuiNumero(int numero){

        numeroConta = numero;
    }

    void atribuiAgencia(String age){

        agencia = age;
    }

    void atribuiNome(String nome){

        nomeCliente = nome;
    }

    void atribuiSaldo(Double valor){

        saldo = valor;
    }
}
