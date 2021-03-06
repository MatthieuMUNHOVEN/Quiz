package fr.esigelec.quiz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.esigelec.quiz.model.Quiz;

@Repository("QuizDAO") 
public class QuizDAOImpl implements QuizDAO {
	
	 @Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void ajouterQuiz(Quiz quiz) {
		   sessionFactory.getCurrentSession().save(quiz);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)

	public List<Quiz> getListeQuizzes() {
		
		/*Session session = this.sessionFactory.getCurrentSession();
		List<Quiz> quizzesList = session.createQuery("from quiz").list();
		
		return quizzesList;*/
		
		return (List<Quiz>) sessionFactory.getCurrentSession().createCriteria(Quiz.class).list();

	}

	@Override
	@Transactional(readOnly=true)
	public Quiz getQuiz(int id) {
		
				  return (Quiz) sessionFactory.getCurrentSession().get(Quiz.class, id);
	}

	@Override
	public void supprimerQuiz(int id) {
		
		Session session = this.sessionFactory.getCurrentSession();
		Quiz p = (Quiz) session.load(Quiz.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		
	}

}
