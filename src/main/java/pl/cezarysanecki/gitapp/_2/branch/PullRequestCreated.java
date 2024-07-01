package pl.cezarysanecki.gitapp._2.branch;

import pl.cezarysanecki.gitapp.shared.DomainEvent;
import pl.cezarysanecki.gitapp.shared.UserId;

public record PullRequestCreated(
        UserId owner,
        BranchId sourceBranch,
        BranchId targetBranch) implements DomainEvent {
}
