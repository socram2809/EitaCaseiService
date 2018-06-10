package br.ufrn.ws.eitacasei.EitaCaseiService.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.ws.eitacasei.EitaCaseiService.dominio.Presente;
import br.ufrn.ws.eitacasei.EitaCaseiService.repository.PresenteRepository;

/**
 * Controlador REST que mapeia a URI /presente
 * @author Marcos
 *
 */
@RestController
@RequestMapping("/presente")
public class PresenteResource {

	@Autowired
	private PresenteRepository presenteRepository;
	
	/**
	 * Retorna uma lista de presentes utilizando GET
	 * @return
	 */
	@GetMapping(produces="application/json")
	public List<Presente> listaPresentes(){
		return presenteRepository.findAll();
	}
	
	/**
	 * Mantém um presente utilizando POST
	 * @param presente
	 * @return
	 */
	@PostMapping(consumes="application/json", produces= {"application/json"})
	public Presente cadastrarPresente(@RequestBody Presente presente) {
		return presenteRepository.save(presente);
	}
	
	/**
	 * Recupera um determinado presente
	 * @param idPresente
	 * @return
	 */
	@GetMapping("/{idPresente}")
	public Presente retornarPresente(@PathVariable Long idPresente) {
		return presenteRepository.findById(idPresente).get();
	}
	
	@DeleteMapping("/{idPresente}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void deletaPresente(@PathVariable Long idPresente) {
		presenteRepository.deleteById(idPresente);
	}
}
