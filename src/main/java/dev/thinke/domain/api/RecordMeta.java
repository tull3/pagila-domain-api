package dev.thinke.domain.api;

import java.util.Set;

public interface RecordMeta {
    String name();
    Set<FieldMeta> fields();
}
