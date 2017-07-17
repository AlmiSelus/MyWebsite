package com.almi.page.projects;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.vavr.API;
import io.vavr.Predicates;
import io.vavr.control.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

/**
 * Created by Almi on 7/16/2017.
 */
@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        return (List<Project>) projectRepository.findAll();
    }

    public void addProject(ProjectRequest projectRequest) {
        Option<Project> option = Option.of(projectRepository.findByName(projectRequest.getName()));
//        Match(option).of(
//                Case($(Predicates.isNull()), e->projectRepository.save(e))
//        );
    }
}
