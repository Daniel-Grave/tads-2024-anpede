package br.com.anpede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anpede.dto.EquipamentoDTO;
import br.com.anpede.services.EquipamentoService;

@RestController
@RequestMapping(value = "/equipamentos")
public class EquipamentoResource {
	
	@Autowired
	private EquipamentoService service;
	
	@GetMapping
	public ResponseEntity<List<EquipamentoDTO>> findAll(){
		List<EquipamentoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EquipamentoDTO> findById(@PathVariable Long id){		
		EquipamentoDTO dto = service.findById(id);		
		return ResponseEntity.ok().body(dto);		
	}

}




