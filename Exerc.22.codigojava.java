public class Cliente {

	private String nome;

	private String telefone;

	private String email;

	private String endereco;

	private static int totalClientes;

	public static int obterTotalClientes() {
		return 0;
	}

}
public class Consulta {

	private String donoAnimal;

	private String veterinario;

	private String animal;

	private Date data;

	private Time horario;

	private static int totalConsultasDiarias;

	private static int totalConsultasMarcadas;

	public static int obterTotalConsultasDiarias() {
		return 0;
	}

	public static int obterTotalConsultasTotais() {
		return 0;
	}

}
