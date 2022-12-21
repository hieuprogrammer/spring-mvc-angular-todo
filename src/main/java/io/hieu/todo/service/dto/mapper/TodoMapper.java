package io.hieu.todo.service.dto.mapper;

import io.hieu.todo.domain.Todo;
import io.hieu.todo.service.dto.model.TodoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

    Todo toTodo(final TodoDto todoDto);

    TodoDto toTodoDto(final Todo todo);
}
