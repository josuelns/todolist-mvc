package josue.todolistMVC.service;

import josue.todolistMVC.model.Todo;
import josue.todolistMVC.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

	private final TodoRepository repository;

	public TodoService(TodoRepository repository) {
		this.repository = repository;
	}

	public List<Todo> listarTodos() {
		return repository.findAll();
	}

	public Optional<Todo> buscarPorId(Long id) {
		return repository.findById(id);
	}

	public Todo criar(Todo todo) {
		return repository.save(todo);
	}

	public Optional<Todo> atualizar(Long id, Todo dados) {
		return repository.findById(id).map(todo -> {
			todo.setTitulo(dados.getTitulo());
			todo.setConcluido(dados.isConcluido());
			return repository.save(todo);
		});
	}

	public boolean deletar(Long id) {
		if (!repository.existsById(id)) {
			return false;
		}
		repository.deleteById(id);
		return true;
	}

}
