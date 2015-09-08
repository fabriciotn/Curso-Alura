package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	@WebMethod(operationName="todosOsItens")
	@WebResult(name="itens")
	public List<Item> getItens() {
		System.out.println("Chamando todosItens()");
		return dao.todosItens();
	}
}
