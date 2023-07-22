package com.store.marketbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.marketbackend.entity.Cidade;
import com.store.marketbackend.service.CidadeService;

@RestController
@RequestMapping("/api/cidade")

public class CidadeController {
    @Autowired
    private CidadeService cidadeService;

    public List<Cidade> buscarTodos(){
        return cidadeService.buscarTodos();
    }
    
    public Cidade inserir(@RequestBody Cidade cidade){
        return cidadeService.inserir(cidade);
    }

    public Cidade alterar(@RequestBody Cidade cidade){
        return cidadeService.alterar(cidade);
    }

    public ResponseEntity<Void> excluir(@PathVariable("id")Long id){
        cidadeService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
