package fr.esigelec.quiz.controller.android;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscriptionController {

	@RequestMapping(value = "/android/inscription", method = RequestMethod.POST)
	public String inscription(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom,
			@RequestParam("mail") String mail, @RequestParam("mdp") String mdp) {
		
		String retourJson = "";
		
		//Test si l'utilisateur n'est pas d�j� enregistr� dans la base de donn�e
		if(true){
			
		} else {
	
		}
		
		return retourJson;
	}
	
}
