package pl.cezarysanecki.gitapp._2.branch;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.cezarysanecki.gitapp.shared.Head;

import java.util.UUID;

@Table
@Entity
@Setter(AccessLevel.PACKAGE)
@Getter(AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Branch {

    @Id
    private Long id;

    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "branch_id"))
    private BranchId branchId;

    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "head"))
    private Head head;

    public Branch(Head head) {
        this.branchId = new BranchId(UUID.randomUUID());
        this.head = head;
    }

}
