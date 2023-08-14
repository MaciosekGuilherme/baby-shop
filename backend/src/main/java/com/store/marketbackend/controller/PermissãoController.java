package com.store.marketbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.marketbackend.entity.Permissão;
import com.store.marketbackend.service.PermissãoService;

@RestController
@RequestMapping("/api/permissão")
public class PermissãoController {
    @Autowired

    private PermissãoService permissãoService;    

    @GetMapping("/")
    public List <Permissão> buscarTodos() {
        return permissãoService.buscarTodos();
    }

    @PutMapping("/")
    public Permissão inserir(@RequestBody Permissão permissão) {
        return permissãoService.inserir(permissão);
    }

    @PostMapping("/")
    public Permissão alterar(@RequestBody Permissão permissão) {
        return permissãoService.alterar(permissão);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable ("id") Long id) {
        permissãoService.excluir(id);
        return ResponseEntity.ok().build()
;    }

}
