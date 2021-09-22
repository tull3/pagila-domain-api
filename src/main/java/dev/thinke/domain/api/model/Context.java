package dev.thinke.domain.api.model;

/**
 * Only place where {@link Model} instances are aware of their relationship to other models
 */
public interface Context {

    Model constructModel(Constructable constructable);
}
