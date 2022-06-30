package dev.thinke.domain.pagila;

import dev.thinke.domain.api.RecordMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ActorDao {

    private final EntityManager entityManager;
    private final JdbcTemplate jdbcTemplate;

    public ActorDao(final EntityManager entityManager, final JdbcTemplate jdbcTemplate) {
        this.entityManager = entityManager;
        this.jdbcTemplate = jdbcTemplate;
    }

    public void getActors() {
        final ActorField id = new ActorField("actor_id", Integer.class);
        final ActorField firstName = new ActorField("first_name", String.class);
        final ActorField lastName = new ActorField("last_name", String.class);

        jdbcTemplate.query("select a.actor_id, a.first_name, a.last_name from actor a", new RecordMapper());
//        final Query query = entityManager.createQuery("select a.actor_id, a.first_name, a.last_name from actor a");
//        query.getResultList().forEach(System.out::println);
    }
}
