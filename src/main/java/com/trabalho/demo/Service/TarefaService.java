package com.trabalho.demo.Service;
import com.trabalho.demo.Main.Tarefa;
import com.trabalho.demo.Repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repo;

    public TarefaService(TarefaRepository repo) {
        this.repo = repo;
    }

    public Tarefa save(Tarefa t) {
        return repo.save(t);
    }

    public List<Tarefa> findAll() {
        return repo.findAll();
    }

    public Optional<Tarefa> findById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}