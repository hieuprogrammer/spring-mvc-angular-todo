package io.hieu.todo.repository;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.domain.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<Todo, UUID> {
    Todo save(final Todo todo);

    List<Todo> findAll();

    List<Todo> findAllByTodo(final String todo);

    List<Todo> findAllByTodoContains(final String todo);

    List<Todo> findAllByStatus(final Status status);

    List<Todo> findAllByStatusContains(final Status status);

    Todo findByUuid(final UUID uuid);

    List<Todo> findByTodoAndStatus(final String todo, final Status status);
}
