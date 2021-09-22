package dev.thinke.domain.api.model;

import java.util.Collections;
import java.util.Set;

public final class EmptyModel implements Model {

    private final static EmptyModel EMPTY_MODEL = new EmptyModel();

    private EmptyModel() {}

    public static synchronized EmptyModel getInstance() {
        return EMPTY_MODEL;
    }

    @Override
    public Boolean isEmpty() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean isValid() {
        return Boolean.TRUE;
    }

    @Override
    public Set<Field<?>> getFields() {
        return Collections.emptySet();
    }
}
