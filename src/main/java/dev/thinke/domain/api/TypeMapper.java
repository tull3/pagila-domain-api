package dev.thinke.domain.api;

public class TypeMapper {
    public Class<?> mapTypeFromName(final String name) throws ClassNotFoundException {
        return Class.forName(Type.valueOf(name).getFullName());
    }
}
