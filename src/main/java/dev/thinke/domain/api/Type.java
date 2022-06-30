package dev.thinke.domain.api;

import com.google.common.base.MoreObjects;

public enum Type {
    NUMBER("Number", "java.lang.Integer"),
    TEXT("Text", "java.lang.String");

    private String commonName;
    private String fullName;

    Type(final String commonName, final String fullName) {
        this.commonName = commonName;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("commonName", commonName)
                .add("fullName", fullName)
                .toString();
    }

    public String getCommonName() {
        return commonName;
    }

    public String getFullName() {
        return fullName;
    }
}
