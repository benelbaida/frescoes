package com.interview.demo.rest.service;

import com.interview.demo.entity.FrescoesEntity;
import exception.ResourceNotFoundException;

import javax.ws.rs.core.Response;
import java.util.List;


public interface FrescoesService {

    /**
     * Gets All frescoes.
     *
     * @return list of frescoes
     */
    List<FrescoesEntity> getAllFrescoes();

    /**
     * getAll and Sort by anneeCreation asc/desc
     * @param asc true or false
     * @return list of frescoes sorted by ASC or DESC
     */
    List<FrescoesEntity> getAllSortedByDateAscDesc(boolean asc);

    /**
     * Get frescoe by ID
     * @param frescoesId
     * @return frescoeEntity
     * @throws ResourceNotFoundException
     */
    FrescoesEntity getFrescoesById(Long frescoesId) throws ResourceNotFoundException;

    /**
     * Delete frescoe.
     *
     * @param id the id
     * @return the response
     */
    Response delete(Long id);

}
