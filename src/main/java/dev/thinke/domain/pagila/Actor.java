package dev.thinke.domain.pagila;

import dev.thinke.domain.api.RecordMeta;

import java.util.Set;

public record Actor(String name, Set<ActorField> fields) implements RecordMeta {
}
