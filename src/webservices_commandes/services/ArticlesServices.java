package webservices_commandes.services;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import webservices_commandes.dao.ArticleDAO;
import webservices_commandes.entites.Articles;


@Singleton
public class ArticlesServices {
	@EJB private ArticleDAO dao;
	
	
	public Articles getArticle(long id) {
		return dao.getArticlesById(id);
	}
	
	
	public void saveArticle(Articles a ) {
		dao.saveArticle(a);
	}
		
	
}
