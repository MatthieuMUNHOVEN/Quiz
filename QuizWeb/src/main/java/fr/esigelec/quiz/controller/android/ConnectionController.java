package fr.esigelec.quiz.controller.android;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnectionController {

	@RequestMapping(value = "/android/connection", method = RequestMethod.POST)
	public String connection(@RequestParam("mail") String mail, @RequestParam("mdp") String mdp) {
		String retourJson = "";
			
		//On test si l'utilisateur poss�de un compte dans la base de donn�es
		if(true){
			
		} else {
			
		}
		
		return retourJson;
	}

}
