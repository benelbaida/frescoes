package com.interview.demo.rest.service;

import com.interview.demo.entity.FrescoesEntity;
import com.interview.demo.repository.FrescoesRepository;
import exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.List;

@Service
public class FrescoesServiceImpl implements  FrescoesService{

    private static final Logger LOGGER = LoggerFactory.getLogger(FrescoesServiceImpl.class);


    /**
     * The Frescoes repository.
     */
    @Autowired
    FrescoesRepository frescoesRepository;


    /**
     * Gets All frescoes.
     *
     * @return list of frescoes
     */
    public List<FrescoesEntity> getAllFrescoes() {
        LOGGER.warn("getAllFrescoes called");
        return this.frescoesRepository.findAll();
    }

    /**
     * getAll and Sort by anneeCreation asc/desc
     * @param asc true or false
     * @return list of frescoes sorted by ASC or DESC
     */
    public List<FrescoesEntity> getAllSortedByDateAscDesc(boolean asc) {
        LOGGER.error("getAllSortedByDate: anneeCreation called");
        if(asc)
            return this.frescoesRepository.findAll(Sort.by(Sort.Direction.ASC, "anneeCreation"));
        else
            return this.frescoesRepository.findAll(Sort.by(Sort.Direction.DESC, "anneeCreation"));
    }

    /**
     * Get frescoe by ID
     * @param frescoesId
     * @return frescoeEntity
     * @throws ResourceNotFoundException
     */
    public FrescoesEntity getFrescoesById(Long frescoesId)
            throws ResourceNotFoundException {
        FrescoesEntity frescoes = frescoesRepository.findById(frescoesId)
                .orElseThrow(() -> new ResourceNotFoundException("Frescoes not found for this id :: " + frescoesId));
        return frescoes;
    }

    /**
     * Delete frescoe.
     *
     * @param id the id
     * @return the response
     */
    public Response delete(Long id) {
        this.frescoesRepository.deleteById(id);
        return Response.ok().build();
    }
}
