package pl.cezarysanecki.gitapp._2.branch;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.cezarysanecki.gitapp.common.Result;
import pl.cezarysanecki.gitapp.shared.EventPublisher;
import pl.cezarysanecki.gitapp.shared.Head;
import pl.cezarysanecki.gitapp.shared.UserId;

@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;
    private final EventPublisher eventPublisher;

    @Transactional
    public Result createNewBranch(Head head) {
        Branch branch = new Branch(head);
        branchRepository.save(branch);
        return new Result.Success();
    }

    @Transactional
    public Result updateHead(BranchId branchId, Head head) {
        Branch branch = branchRepository.getByBranchId(branchId);
        if (branch.getHead().equals(head)) {
            return new Result.Failure("head is the same");
        }
        branch.setHead(head);
        eventPublisher.publish(new BranchUpdated(branch.getBranchId(), head));

        return new Result.Success();
    }

    @Transactional
    public Result createPullRequest(
            UserId owner,
            BranchId sourceBranchId,
            BranchId targetBranchId
    ) {
        Branch sourceBranch = branchRepository.getByBranchId(sourceBranchId);
        Branch targetBranch = branchRepository.getByBranchId(targetBranchId);

        eventPublisher.publish(new PullRequestCreated(owner, sourceBranch.getBranchId(), targetBranch.getBranchId()));

        return new Result.Success();
    }

}
