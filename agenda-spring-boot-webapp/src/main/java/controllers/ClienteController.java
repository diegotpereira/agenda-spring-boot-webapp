package controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import br.com.java.models.Pessoa;
//import br.com.java.service.PessoaService;

@Controller
public class ClienteController {
	
	@Autowired
//	private PessoaService pessoaService;
	
	
	@RequestMapping(value = "/ListaCliente")
	public ModelAndView listPessoa(ModelAndView model) throws IOException {
//		List<Pessoa> listPessoa = pessoaService.getAllPessoas();
//		model.addObject("listPessoa", listPessoa);
		model.setViewName("ListaCliente");
		return model;
	}

}
