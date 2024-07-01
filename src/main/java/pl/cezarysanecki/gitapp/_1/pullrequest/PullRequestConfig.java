package pl.cezarysanecki.gitapp._1.pullrequest;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class PullRequestConfig {

    private final PullRequestRepository pullRequestRepository;

    @Bean
    PullRequestFacade pullRequestFacade() {
        return new PullRequestFacade(pullRequestRepository);
    }

}
