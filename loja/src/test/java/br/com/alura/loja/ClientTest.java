package br.com.alura.loja;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Produto;

public class ClientTest {

	private HttpServer server;
	private Client client;
	private WebTarget target;

	@Before
	public void startaServidor(){
		server = Servidor.startaServidor();
        ClientConfig config = new ClientConfig();
        config.register(new LoggingFilter());
        this.client = ClientBuilder.newClient(config);
        target = client.target("http://localhost:8080");
	}
	
	@After
	public void paraServidor(){
		server.stop();
	}
	
	@Test
	public void testaQueBuscarUmCarrinhoTrazOCarrinhoEsperado() {
		client = ClientBuilder.newClient();
		Carrinho carrinho = target.path("/carrinhos/1").request().get(Carrinho.class);
		assertEquals("Rua Vergueiro 3185, 8 andar", carrinho.getRua());
	}
	
	@Test
	public void testaOEnvioDeUmCarrinhoViaPost(){
		Client client = ClientBuilder.newClient();
		
		Carrinho carrinho = new Carrinho();
        carrinho.adiciona(new Produto(314L, "Tablet", 999, 1));
        carrinho.setRua("Rua Vergueiro");
        carrinho.setCidade("Sao Paulo");
        Entity<Carrinho> entity = Entity.entity(carrinho, MediaType.APPLICATION_XML);
        Response response = target.path("/carrinhos").request().post(entity);
        Assert.assertEquals(201, response.getStatus());
	}
	
}
