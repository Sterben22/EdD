class CuentaBAncaria{
    private int saldo;
    private String num_cuenta;
    CuentaBAncaria(String num_cuenta, int saldo){
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar (int monto) throws Exception{
        if(monto >0){
            this.saldo += monto;
        }else {
            throw new Exception("Monto a depositar no valido");
        }
    }

    public void retirar (int monto) throws Exception{
        if(monto > 0 && monto <= this.saldo){
            this.saldo -= monto;
        }else {
            throw new Exception("Monto a retirar no valido");
        }
    }
}

public class Encap_Const {
    public static void main(String[] args){
        CuentaBAncaria account = new CuentaBAncaria("12345",300);

        try {
            System.out.printf("Saldo actual es %d \n",account.getSaldo());
            account.depositar(-30);
            System.out.printf("Saldo actual es %d \n",account.getSaldo());
            account.retirar(35);
            System.out.printf("Saldo actual es %d \n", account.getSaldo());
        }catch (Exception err){
            System.out.println(err.getMessage());
        }


    }
}
