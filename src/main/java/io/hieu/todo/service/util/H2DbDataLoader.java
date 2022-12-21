package io.hieu.todo.service.util;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.domain.enums.Status;
import io.hieu.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class H2DbDataLoader implements CommandLineRunner {
    private final TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        this.todoRepository.save(
                Todo.builder()
                        .task("Build Todo App").
                        status(Status.IN_PROGRESS)
                        .build()
        );
        this.todoRepository.save(
                Todo.builder()
                        .task("Implement CRUD").
                        status(Status.IN_PROGRESS)
                        .build()
        );
        this.todoRepository.save(
                Todo.builder()
                        .task("Implement Pagination").
                        status(Status.DONE)
                        .build()
        );
        this.todoRepository.save(
                Todo.builder()
                        .task("Implement Sorting").
                        status(Status.TO_DO)
                        .build()
        );
        this.todoRepository.save(
                Todo.builder()
                        .task("Implement Basic Authentication & Authorization").
                        status(Status.IN_PROGRESS)
                        .build()
        );
        this.todoRepository.save(
                Todo.builder()
                        .task("Customize Whitelabel Error Page").
                        status(Status.DONE)
                        .build()
        );
        this.todoRepository.save(
                Todo.builder()
                        .task("Implement Exceptions Handling").
                        status(Status.IN_PROGRESS)
                        .build()
        );

        log.info("Data loaded.\n" + this.todoRepository.findAll().toString());
    }
}
