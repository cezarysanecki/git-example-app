package pl.cezarysanecki.gitapp._1.pullrequest;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.gitapp._1.pullrequest.api.PullRequestId;
import pl.cezarysanecki.gitapp.pullrequest.common.Result;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class PullRequestFacade {

    private final PullRequestRepository pullRequestRepository;

    public Result merge(PullRequestId pullRequestId) {

    }

}
