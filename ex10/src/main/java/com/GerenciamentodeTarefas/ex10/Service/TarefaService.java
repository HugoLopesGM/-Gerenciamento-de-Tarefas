package com.GerenciamentodeTarefas.ex10.Service;

import com.GerenciamentodeTarefas.ex10.Model.TarefaModel;
import com.GerenciamentodeTarefas.ex10.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public TarefaModel salvar(TarefaModel tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<TarefaModel> findAll() {
        return tarefaRepository.findAll();
    }

    public Optional<TarefaModel> findById(Long id) {
        return tarefaRepository.findById(id);
    }

    public void delete(Long id) {
        tarefaRepository.deleteById(id);
    }
}