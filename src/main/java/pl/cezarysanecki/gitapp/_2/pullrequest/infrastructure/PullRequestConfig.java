package pl.cezarysanecki.gitapp.pullrequest._2.pullrequest.infrastructure;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.cezarysanecki.gitapp.pullrequest._2.pullrequest.application.MergingPullRequest;
import pl.cezarysanecki.gitapp.pullrequest._2.pullrequest.model.PullRequests;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class PullRequestConfig {

    private final PullRequests pullRequests;

    @Bean
    MergingPullRequest mergingPullRequest() {
        return new MergingPullRequest(pullRequests);
    }

}
