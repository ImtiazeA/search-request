package com.imtiazea.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.util.Arrays;
import java.util.List;

@Data
public final class SearchCriteria {

    private final String field;

    @NonNull
    private final List<Object> values;

    private final SearchOperation operation;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public SearchCriteria(@NonNull @JsonProperty("field") String field,
                          @NonNull @JsonProperty("values") Object values,
                          @NonNull @JsonProperty("operation") SearchOperation operation) {
        this.field = field;
        this.operation = operation;

        if (values instanceof List) {
            this.values = (List) values;
        } else {
            this.values = Arrays.asList(values);
        }
    }

}

