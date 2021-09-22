package dev.thinke.domain.api.model;

/**
 * Metadata for properties of {@link Model} objects
 * @param <T>
 */
public class Field<T> {

    private final String name;
    private final Class<T> type;

    public Field(final String name, final Class<T> type) {
        this.name = name;
        this.type = type;
    }
    

}
