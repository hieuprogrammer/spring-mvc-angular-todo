package io.hieu.todo.service;

import io.hieu.todo.domain.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    Optional<Todo> save(final Todo todo);

    Optional<Page<Todo>> findAll(final Pageable pageable);

    Optional<List<Todo>> findAll();
}
