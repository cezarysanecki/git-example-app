package pl.cezarysanecki.gitapp._2.branch;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

interface BranchRepository extends CrudRepository<Branch, Long> {

    Optional<Branch> findByBranchId(BranchId branchId);

    default Branch getByBranchId(BranchId branchId) {
        return findByBranchId(branchId)
                .orElseThrow(() -> new IllegalStateException("cannot find branch with id " + branchId));
    }

}
