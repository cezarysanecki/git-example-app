package pl.cezarysanecki.gitapp._2.pullrequest.model;

import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.gitapp._2.branch.BranchId;
import pl.cezarysanecki.gitapp.shared.UserId;

import java.util.Collection;
import java.util.Optional;

@RequiredArgsConstructor
public class PullRequest {

    public final PullRequestId pullRequestId;
    public final UserId owner;
    public final BranchId sourceBranch;
    public final BranchId targetBranch;
    public final boolean requiresChanges;
    public final Collection<UserId> acceptedBy;
    public final boolean isBuiltSuccessfully;

    private final Collection<PullRequestMergePolicy> mergePolicies;

    public Optional<PullRequestMerged> merge(UserId ownerId) {
        if (mergePolicies.stream().allMatch(policy -> policy.validate(this, ownerId))) {
            return Optional.of(new PullRequestMerged(pullRequestId));
        }
        return Optional.empty();
    }

}
