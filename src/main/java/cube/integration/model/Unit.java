package cube.integration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Unit {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
