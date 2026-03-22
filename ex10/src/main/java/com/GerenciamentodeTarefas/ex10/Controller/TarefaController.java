package com.GerenciamentodeTarefas.ex10.Controller;


import com.GerenciamentodeTarefas.ex10.Model.TarefaModel;
import com.GerenciamentodeTarefas.ex10.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
    @Autowired
    private TarefaService service;

    @PostMapping
    public TarefaModel salvar(@RequestBody TarefaModel tarefaModel){
        return service.salvar(tarefaModel);
    }

    @GetMapping
    public List<TarefaModel> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TarefaModel> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


}
