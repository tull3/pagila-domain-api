package dev.thinke.domain.api;

public class Field {

    private final String name;
    private final Object value;

    public Field(final String name, final Object value) {
        this.name = name;
        this.value = value;
    }

    public <T> T getValue(final FieldMeta<T> meta) {
        return meta.type().cast(this.value);
    }
}
