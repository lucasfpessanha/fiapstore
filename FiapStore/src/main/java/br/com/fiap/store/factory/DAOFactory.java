package br.com.fiap.store.factory;
import br.com.fiap.store.dao.ProdutoDao;
import br.com.fiap.store.dao.impl.OracleProdutoDAO;


public class DAOFactory {
	public static ProdutoDao getProdutoDao () {
		return new OracleProdutoDAO();
	}
}
