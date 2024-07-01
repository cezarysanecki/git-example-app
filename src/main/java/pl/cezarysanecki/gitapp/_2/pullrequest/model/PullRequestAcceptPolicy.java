package pl.cezarysanecki.gitapp._2.pullrequest.model;

import pl.cezarysanecki.gitapp.shared.UserId;

public interface PullRequestAcceptPolicy {

    boolean validate(PullRequest pullRequest, UserId ownerId);

}
