package pl.cezarysanecki.gitapp.shared;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record Head(UUID id) {
}
