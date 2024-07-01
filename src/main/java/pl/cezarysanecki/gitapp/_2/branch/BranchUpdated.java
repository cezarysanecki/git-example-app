package pl.cezarysanecki.gitapp._2.branch;

import pl.cezarysanecki.gitapp.shared.DomainEvent;
import pl.cezarysanecki.gitapp.shared.Head;

public record BranchUpdated(
        BranchId branch,
        Head newHead) implements DomainEvent {
}
