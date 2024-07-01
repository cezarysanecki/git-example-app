package pl.cezarysanecki.gitapp._2.branch;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record BranchId(UUID value) {
}
