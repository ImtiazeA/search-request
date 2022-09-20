package com.imtiazea.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {
    private List<SearchCriteria> searchCriteria = new ArrayList<>();
    private List<OrderCriteria> orderCriteria = new ArrayList<>();
}