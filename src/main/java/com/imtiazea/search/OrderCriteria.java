package com.imtiazea.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCriteria {

    @NonNull
    private String field;

    @NonNull
    private OrderDirection direction;
}