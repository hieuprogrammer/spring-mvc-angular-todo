package io.hieu.todo.repository;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.domain.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<Todo, UUID> {
    Todo save(final Todo todo);

    Page<Todo> findAll(final Pageable pageable);

    List<Todo> findAll();

    List<Todo> findAllByTask(final String task);

    List<Todo> findAllByTaskContains(final String task);

    List<Todo> findAllByStatus(final Status status);

    List<Todo> findAllByStatusContains(final Status status);

    Todo findByUuid(final UUID uuid);

    List<Todo> findByTaskAndStatus(final String task, final Status status);
}
