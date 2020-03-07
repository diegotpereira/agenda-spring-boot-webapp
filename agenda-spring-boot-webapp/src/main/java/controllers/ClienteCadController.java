package controllers;


import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;




@Controller
public class ClienteCadController {

	
//    @Autowired 
//	private PessoaService pessoaService;
    
	@RequestMapping(value = "/CadClient")
	public ModelAndView cadPessoa(ModelAndView model) throws IOException {
//		List<Pessoa> listPessoa = pessoaService.getAllPessoas();
//		model.addObject("listPessoa", listPessoa);
		model.setViewName("CadClient");
		return model;
	}
//	
//	@RequestMapping(value = "/adicionaPessoa", method = RequestMethod.POST)
//	public ModelAndView salvarPessoa(@ModelAttribute Pessoa pessoa) {
//		if (pessoa.getId() == 0) { // if employee id is 0 then creating the
//			// employee other updating the employee
//			pessoaService.addPessoa(pessoa);
//		} else {
//			pessoaService.updatePessoa(pessoa);
//		}
//		return new ModelAndView("redirect:/");
//	}

	public void LimpaTeste() {
		
//		nome.setText("");
		
	}
	

}
