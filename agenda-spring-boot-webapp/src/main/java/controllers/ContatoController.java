package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatoController {
	
	@RequestMapping("/Contato")
	  public ModelAndView MeusContatos(){
			
	        ModelAndView modelAndView = new ModelAndView("Contato");
	        
	        return modelAndView;
	    }


}
