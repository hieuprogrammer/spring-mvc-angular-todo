package io.hieu.todo.domain.enums;

import lombok.Getter;

public enum Status {
    DONE("DONE"),
    IN_PROGRESS("IN PROGRESS"),
    TO_DO("TO DO");

    @Getter
    private final String status;

    private Status(final String status) {
        this.status = status;
    }
}
