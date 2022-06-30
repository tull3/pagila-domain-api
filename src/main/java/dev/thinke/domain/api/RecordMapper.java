package dev.thinke.domain.api;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public record RecordMapper(RecordMeta recordMeta) implements RowMapper<Row> {

    @Override
    public Row mapRow(ResultSet resultSet, int i) throws SQLException, ClassNotFoundException {
        final Set<FieldMeta> fieldMeta = recordMeta.fields();
        final var fields = new HashSet<>(fieldMeta.size());
        final Field id = new Field(recordMeta.name(), resultSet.getObject("test"));
        final Row row = new Row(new HashSet<>());
        return row;
    }
}
