package io.hieu.todo.service.impl;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.repository.TodoRepository;
import io.hieu.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    @Override
    public Optional<Todo> add(final Todo todo) {
        return Optional.of(this.todoRepository.save(todo));
    }

    @Override
    public Optional<List<Todo>> findAll() {
        return Optional.of(this.todoRepository.findAll());
    }
}
