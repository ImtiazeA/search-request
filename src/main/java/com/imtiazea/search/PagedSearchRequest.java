package com.imtiazea.search;

import lombok.Data;

@Data
public class PagedSearchRequest extends SearchRequest {
    private Integer page;
    private Integer size;
}
