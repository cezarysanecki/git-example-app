package pl.cezarysanecki.gitapp._2.pullrequest.model;

import pl.cezarysanecki.gitapp._1.pullrequest.api.PullRequestId;

public interface PullRequests {

    PullRequest findBy(PullRequestId pullRequestId);

}
