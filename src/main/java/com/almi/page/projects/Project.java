package com.almi.page.projects;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Almi on 7/16/2017.
 */
@Entity(name = "project")
@Table(name = "projects")
@NoArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue
    private long projectId;

    @Column
    @Getter
    private String projectName;

    @Column
    private String projectDescription;

    @OneToMany(mappedBy = "project")
    private List<Screenshot> screenshots = new ArrayList<>();
}
