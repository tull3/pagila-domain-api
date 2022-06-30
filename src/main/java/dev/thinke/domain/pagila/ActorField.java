package dev.thinke.domain.pagila;

import dev.thinke.domain.api.FieldMeta;

public record ActorField(String name, Class<?> type) implements FieldMeta {
}
