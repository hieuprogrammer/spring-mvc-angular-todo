package io.hieu.todo.service.dto.model;

import io.hieu.todo.domain.enums.Status;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class TodoDto {
    private UUID uuid;
    private String task;
    private Status status;
}
