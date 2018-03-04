package com.cbs.java.database_interaction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractEntity {
    protected Integer id;
}
