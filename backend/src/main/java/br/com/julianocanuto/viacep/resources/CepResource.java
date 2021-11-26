package br.com.julianocanuto.viacep.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.julianocanuto.viacep.consumers.viaCepConsumer;
import br.com.julianocanuto.viacep.entities.Cep;

@RestController
@RequestMapping(value = "/cep")
public class CepResource {

	@Autowired
	private viaCepConsumer viaCepConsumer;

	@GetMapping(value = "/{cepNumber}")
	public ResponseEntity<Cep> getCep(@PathVariable String cepNumber) {

		Cep result = viaCepConsumer.getCep(cepNumber);
		return ResponseEntity.ok().body(result);
	}

}
