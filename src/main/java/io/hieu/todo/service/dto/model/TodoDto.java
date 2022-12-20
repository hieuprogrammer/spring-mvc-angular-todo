package io.hieu.todo.service.dto.model;

import io.hieu.todo.domain.enums.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class TodoDto {
    private String todo;
    private Status status;
}
