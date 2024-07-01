package pl.cezarysanecki.gitapp._1.pullrequest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
class PullRequest {

    @Id
    Long id;


}
