package com.almi.page.projects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;

/**
 * Created by Almi on 7/16/2017.
 */
@JsonSerialize
public class ProjectRequest {

    @Getter
    private String name;

    @Getter
    private String description;
}
