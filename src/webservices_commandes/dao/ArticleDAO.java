package webservices_commandes.dao;

import java.util.logging.Logger;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import webservices_commandes.entites.Articles;

@Singleton
public class ArticleDAO {
	private static final Logger LOG= Logger.getLogger("ArticleDAO");
	@PersistenceContext(name = "commandes") private EntityManager em;
	
	public void saveArticle(Articles a) {
		em.persist(a);
	}
	
	public Articles getArticlesById(long id) {
		LOG.info("id: "+id);
		return em.find(Articles.class, id);
	}
	
}
