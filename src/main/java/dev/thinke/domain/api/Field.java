package dev.thinke.domain.api;

public class Field<T> {

    private final String name;
    private final Class<T> type;
    private final Object value;

    public Field(String name, Class<T> type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
    

}
