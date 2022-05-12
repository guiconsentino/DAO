package Jdbc;

public class DAOteste {

	public static void main(String[] args) {

		
		//DAO É O OBJETO QUE TEM COMO OBJETIVO ENCAPSULAR TODA COMPLEXIDADE DE INFRAESTRUTURA
		//DE ACESSAR O BANCO DE DADOS.
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome,codigo) VALUE (?, ?)";
		
		System.out.println(dao.incluir(sql, "Guilherme",109));
		System.out.println(dao.incluir(sql, "Karina",110));
		System.out.println(dao.incluir(sql, "Caio",111));
		
		
		
	}
}
