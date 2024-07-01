package pl.cezarysanecki.gitapp._1.pullrequest.web;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cezarysanecki.gitapp._1.pullrequest.PullRequestFacade;
import pl.cezarysanecki.gitapp._1.pullrequest.api.PullRequestId;
import pl.cezarysanecki.gitapp.pullrequest.common.Result;

import java.util.UUID;

@RestController
@RequestMapping("/pull-request")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class PullRequestController {

    private final PullRequestFacade pullRequestFacade;

    @PostMapping("/merge/{pullRequestId}")
    ResponseEntity mergePullRequest(@PathVariable String pullRequestId) {
        Result result = pullRequestFacade.merge(new PullRequestId(UUID.fromString(pullRequestId)));

        if (result instanceof Result.Failure failure) {
            return ResponseEntity.badRequest().body(failure.reason());
        }
        return ResponseEntity.ok().build();
    }

}
