package io.hieu.todo.controller;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> todos() throws Exception {
        return ResponseEntity.of(Optional.ofNullable(todoService.findAll().orElseThrow(Exception::new)));
    }
}
