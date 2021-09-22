package dev.thinke.domain.api.jpa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Entity;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// @Entity
public @interface DomainRoot {
    
}
