package fr.esigelec.quiz.dao;

import java.util.List;

import fr.esigelec.quiz.model.Question;
import fr.esigelec.quiz.model.Quiz;

/**
 * 
 * @author Sahobau
 * 
 * */

public interface QuestionDAO {
	
	public void ajouterQuestion(Question question);
	
	public List<Question> getListeQuestions();
	
	public Question getQuestion(int id);
	
	public void supprimerQuestion(int id);

}
