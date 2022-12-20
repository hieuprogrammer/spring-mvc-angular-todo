package io.hieu.todo.service;

import io.hieu.todo.domain.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    Optional<Todo> add(final Todo todo);

    Optional<List<Todo>> findAll();
}
