package com.interview.demo.entity;

import com.interview.demo.common.EntityColumnConstants;

import javax.persistence.*;


/**
 * The type Sample entity.
 */
@Entity
public class SampleEntity {

    @Id
    @Column(name = EntityColumnConstants.ID_COLUMN_NAME)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sampleName;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public SampleEntity setId(final Long id) {
        this.id = id;
        return this;
    }

    /**
     * Gets sampleName.
     *
     * @return the sampleName
     */
    public String getSampleName() {
        return this.sampleName;
    }

    /**
     * Sets sampleName.
     *
     * @param sampleName the sampleName
     * @return the sampleName
     */
    public SampleEntity setSampleName(final String sampleName) {
        this.sampleName = sampleName;
        return this;
    }

}
