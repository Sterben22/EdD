class CuentaBAncaria{
    int saldo;
    String num_cuenta;
    CuentaBAncaria(String num_cuenta, int saldo){
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }
    public void depositar (int depos){
        this.saldo += depos;
    }

    public void retirar (int retir){
        this.saldo -= retir;

    }
}

public class Encap_Const {
    public static void main(String[] args){
        CuentaBAncaria person = new CuentaBAncaria("12345",300);

        System.out.printf("Saldo actual es %d \n",person.saldo);
        person.depositar(30);
        System.out.printf("SAldo actual es %d \n",person.saldo);
        person.retirar(15);
        System.out.printf("SAldo actual es %d \n", person.saldo);

    }
}
