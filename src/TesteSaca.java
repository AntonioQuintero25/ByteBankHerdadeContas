
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(111,222);
		
		conta.deposita(200.0);
		System.out.println(conta.getSaldo());
		try {
			conta.saca(200.0);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("EX: "+ex.getMessage());
		}
		

		System.out.println(conta.getSaldo());
	}

}
