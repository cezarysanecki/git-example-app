package pl.cezarysanecki.gitapp._2.pullrequest.model;

import pl.cezarysanecki.gitapp.shared.UserId;

public interface PullRequestMergePolicy {

    boolean validate(PullRequest pullRequest, UserId ownerId);

    PullRequestMergePolicy ONLY_OWNER_CAN_MERGE = (pullRequest, ownerId) -> pullRequest.owner.equals(ownerId);

    PullRequestAcceptPolicy REQUIRED_ENOUGH_NUMBER_OF_ACCEPTS = (pullRequest, ownerId) -> pullRequest.acceptedBy.size() >= 2;

    PullRequestAcceptPolicy CANNOT_HAVE_REQUIRED_CHANGES = (pullRequest, ownerId) -> !pullRequest.requiresChanges;

    PullRequestAcceptPolicy MUST_BE_BUILT_SUCCESSFULLY = (pullRequest, ownerId) -> pullRequest.isBuiltSuccessfully;

}
