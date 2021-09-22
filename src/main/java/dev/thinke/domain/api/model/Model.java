package dev.thinke.domain.api.model;

import java.util.Set;

public interface Model {

    Boolean isEmpty();

    Boolean isValid();

    Set<Field<?>> getFields();
}
