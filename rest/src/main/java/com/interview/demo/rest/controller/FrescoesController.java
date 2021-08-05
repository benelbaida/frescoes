package com.interview.demo.rest.controller;

import com.interview.demo.entity.FrescoesEntity;
import com.interview.demo.repository.FrescoesRepository;
import com.interview.demo.rest.service.FrescoesService;
import exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * TODO : Correct this class
 *
 * The type Sample service.
 */
@RestController
@RequestMapping("/frescoes")
public class FrescoesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FrescoesController.class);


    /**
     * The Sample repository.
     */
    @Autowired
    FrescoesService frescoesService;


    /**
     * Gets All frescoes.
     *
     * @return list of frescoes
     */
    @GetMapping
    @Produces(MediaType.APPLICATION_JSON)
    public List<FrescoesEntity> getAllFrescoes() {
        LOGGER.warn("getAllFrescoes called");
        return frescoesService.getAllFrescoes();
    }

    /**
     * getAll and Sort by anneeCreation asc/desc
     * @param asc true or false
     * @return list of frescoes sorted by ASC or DESC
     */
    @GetMapping("/sort")
    @Produces(MediaType.APPLICATION_JSON)
    public List<FrescoesEntity> getAllSortedByDateAscDesc(@PathParam(value = "sort") boolean asc) {
        LOGGER.error("getAllSortedByDate: anneeCreation called");
        if(asc)
            return frescoesService.getAllSortedByDateAscDesc(asc);
        else
            return frescoesService.getAllSortedByDateAscDesc(asc);
    }

    /**
     * Get frescoe by ID
     * @param frescoesId
     * @return frescoeEntity
     * @throws ResourceNotFoundException
     */
    @GetMapping("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<FrescoesEntity> getFrescoesById(@PathVariable(value = "id") Long frescoesId)
            throws ResourceNotFoundException {
        FrescoesEntity frescoes = frescoesService.getFrescoesById(frescoesId);
        return ResponseEntity.ok().body(frescoes);
    }

    /**
     * Delete frescoe.
     *
     * @param id the id
     * @return the response
     */
    @DeleteMapping(value="/delete")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathVariable(value = "id") Long id) {
             frescoesService.delete(id);
        return Response.ok().build();
    }

}