package spring.jdbs_template.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractEmployee {
    private Integer id; //почему мы тут использовали класс обертку, а не приметивный int?
}
