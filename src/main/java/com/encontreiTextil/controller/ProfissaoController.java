package com.encontreiTextil.controller;

import com.encontreiTextil.model.ProfissaoModel;
import com.encontreiTextil.repository.ProfissaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/profissao")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ProfissaoController {

    @Autowired
    private ProfissaoRepository profissaoRepository;

    @GetMapping
    public ResponseEntity<List<ProfissaoModel>> getAll() {

        return ResponseEntity.ok(profissaoRepository.findAll());
    }
    @GetMapping ("/{id}")
    public ResponseEntity<ProfissaoModel> getById(@PathVariable Long id) {
        return profissaoRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProfissaoModel> post (@Valid @RequestBody ProfissaoModel profissaoModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(profissaoRepository.save(profissaoModel));
    }

    @PutMapping
    public ResponseEntity<ProfissaoModel> put (@Valid RequestBody ProfissaoModel profissaoModel){
        return profissaoRepository.findById(profissaoModel.getId()).map(resposta -> )
    }


}
