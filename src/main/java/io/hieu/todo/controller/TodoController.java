package io.hieu.todo.controller;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.service.TodoService;
import io.hieu.todo.service.dto.mapper.TodoMapper;
import io.hieu.todo.service.dto.model.TodoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/tasks", "/tasks.*", "/tasks/", "/todo", "/todo.*", "/todo/", "/todos", "/todos.*", "/todos/", "/to-do", "/to-do.*", "/to-do/", "/to-dos", "/to-dos.*", "/to-dos/"})
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;
    private static TodoMapper TODO_MAPPER = TodoMapper.INSTANCE;

    @PostMapping
    public ResponseEntity<TodoDto> createTask(final @RequestBody TodoDto todoDto) {
        final TodoDto createdTodo = this.TODO_MAPPER.toTodoDto(
                this.todoService.save(this.TODO_MAPPER.toTodo(todoDto)).get());
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    @GetMapping("paged")
    public ResponseEntity<List<TodoDto>> todosPaged(final @RequestParam int page, final @RequestParam int size) {
        final Page<Todo> todosPage = this.todoService.findAll(PageRequest.of(page, size)).get();
        final List<Todo> todos = todosPage.toList();
        final List<TodoDto> todoDtos = new ArrayList<>();
        for (final Todo todo : todos) {
            todoDtos.add(this.TODO_MAPPER.toTodoDto(todo));
        }

        return ResponseEntity.ok(todoDtos);
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> todos() {
        final List<Todo> todos = this.todoService.findAll().get();
        final List<TodoDto> todoDtos = new ArrayList<>();
        for (final Todo todo : todos) {
            todoDtos.add(this.TODO_MAPPER.toTodoDto(todo));
        }

        return ResponseEntity.ok(todoDtos);
    }
}
