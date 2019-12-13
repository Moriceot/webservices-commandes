package webservices_commandes.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import webservices_commandes.entites.Articles;
import webservices_commandes.services.ArticlesServices;

@Path("/articles")

public class ArticlesRest {
	@EJB private ArticlesServices serv;
	
	@GET
	@Path("/byid/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Articles getArticle(@PathParam("id")long id) {
		return serv.getArticle(id);
	}
	
	@POST
	@Path("/new_article")
	@Consumes(MediaType.APPLICATION_JSON)
	public void saveArticle(String nom, double prix, int stock ) {
		Articles a= new Articles(nom, stock, prix);
		serv.saveArticle(a);
	}
}
