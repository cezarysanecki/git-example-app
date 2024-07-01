package pl.cezarysanecki.gitapp._1.pullrequest;

import pl.cezarysanecki.gitapp._1.pullrequest.api.PullRequestId;

interface PullRequestRepository {

    PullRequest findBy(PullRequestId pullRequestId);

    class PullRequestRepositoryInMemory implements PullRequestRepository {

        @Override
        public PullRequest findBy(PullRequestId pullRequestId) {
            return null;
        }

    }

}
