package com.almi.page.projects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Almi on 7/16/2017.
 */
@Entity(name = "screenshot")
@Table(name = "screenshots")
@NoArgsConstructor
@Builder
public class Screenshot {

    @Id
    @GeneratedValue
    private long screenshotId;

    @ManyToOne
    private Project project;
}
