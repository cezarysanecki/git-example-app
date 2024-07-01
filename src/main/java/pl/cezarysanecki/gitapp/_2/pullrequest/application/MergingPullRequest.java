package pl.cezarysanecki.gitapp._2.pullrequest.application;

import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.gitapp._1.pullrequest.api.PullRequestId;
import pl.cezarysanecki.gitapp._2.pullrequest.model.PullRequest;
import pl.cezarysanecki.gitapp._2.pullrequest.model.PullRequests;
import pl.cezarysanecki.gitapp.shared.UserId;

@RequiredArgsConstructor
public class MergingPullRequest {

    private final PullRequests pullRequests;

    public Result merge(UserId ownerId, PullRequestId pullRequestId) {
        PullRequest pullRequest = pullRequests.findBy(pullRequestId);
        pullRequest.merge(ownerId);
    }

    public static class Result

}
