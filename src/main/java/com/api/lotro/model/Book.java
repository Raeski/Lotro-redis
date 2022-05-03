package com.api.lotro.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    @JsonProperty("docs")
    private List<Books> docs;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("offset")
    private Integer offSet;

    @JsonProperty("page")
    private Integer page;

    @JsonProperty("pages")
    private Integer pages;

}
