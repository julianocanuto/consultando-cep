package br.com.julianocanuto.viacep.consumers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.julianocanuto.viacep.entities.Cep;

@FeignClient(value = "viacep-consumer", url = "https://viacep.com.br/")
public interface viaCepConsumer {

	@GetMapping(value = "/ws/{cep}/json")
	Cep getCep(@PathVariable("cep") String cep);

}
