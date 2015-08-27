package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.modelo.Projeto;

public class ProjetoTest {

	private HttpServer server;

	@Before
	public void startaServidor(){
		server = Servidor.startaServidor();
	}
	
	@After
	public void paraServidor(){
		server.stop();
	}
	
	@Test
	public void testaQueBuscarUmProjetoTrazOProjetoEsperado(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Projeto projeto = target.path("/projetos/1").request().get(Projeto.class);
		Assert.assertEquals("Minha loja", projeto.getNome());
	}
	
	@Test
	public void testaOEnvioDeUmProjetoViaPost(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Projeto projeto = new Projeto(1, "Projeto de Teste", 2015);
        Entity<Projeto> entity = Entity.entity(projeto, MediaType.APPLICATION_XML);

        Response response = target.path("/projetos").request().post(entity);
        Assert.assertEquals(201, response.getStatus());
	}
	
}
