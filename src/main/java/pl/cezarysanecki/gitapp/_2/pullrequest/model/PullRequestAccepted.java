package pl.cezarysanecki.gitapp._2.pullrequest.model;

import pl.cezarysanecki.gitapp.shared.UserId;

public record PullRequestAccepted(PullRequestId pullRequestId, UserId userId) {
}
