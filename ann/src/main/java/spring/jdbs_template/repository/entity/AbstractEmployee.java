package spring.jdbs_template.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public abstract class AbstractEmployee {
    protected Integer id; //почему мы тут использовали класс обертку, а не приметивный int?

    protected AbstractEmployee(Integer id) {
        this.id = id;
    }

    protected AbstractEmployee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
