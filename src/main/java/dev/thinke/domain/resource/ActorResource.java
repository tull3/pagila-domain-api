package dev.thinke.domain.resource;

import dev.thinke.domain.pagila.ActorDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorResource {

    private final ActorDao actorDao;

    public ActorResource(final ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @GetMapping(path = "/actor")
    public void actorTest() {
        actorDao.getActors();
    }
}
