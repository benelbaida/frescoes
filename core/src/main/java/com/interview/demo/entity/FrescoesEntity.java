package com.interview.demo.entity;

import com.interview.demo.common.EntityColumnConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FrescoesEntity {

    @Id
    @Column(name = EntityColumnConstants.ID_COLUMN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Integer codeInsee;
    private String categorie;
    private String etatOeuvre;
    private String photo;
    private String etatSupport;
    private String commentaire;
    private String support;
    private Integer anneeCreation;
    private String artiste;
    private String maitreOeuvre;
    private String proprietaire;
    private String mnemo;
    private String numPostal;
    private String section;
    private Integer parcelle;
    private String geoPoint;
    private String geoShape;
    private String nomRue;

    public FrescoesEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodeInsee() {
        return codeInsee;
    }

    public void setCodeInsee(Integer codeInsee) {
        this.codeInsee = codeInsee;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getEtatOeuvre() {
        return etatOeuvre;
    }

    public void setEtatOeuvre(String etatOeuvre) {
        this.etatOeuvre = etatOeuvre;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEtatSupport() {
        return etatSupport;
    }

    public void setEtatSupport(String etatSupport) {
        this.etatSupport = etatSupport;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public Integer getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(Integer anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getMaitreOeuvre() {
        return maitreOeuvre;
    }

    public void setMaitreOeuvre(String maitreOeuvre) {
        this.maitreOeuvre = maitreOeuvre;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getMnemo() {
        return mnemo;
    }

    public void setMnemo(String mnemo) {
        this.mnemo = mnemo;
    }

    public String getNumPostal() {
        return numPostal;
    }

    public void setNumPostal(String numPostal) {
        this.numPostal = numPostal;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getParcelle() {
        return parcelle;
    }

    public void setParcelle(Integer parcelle) {
        this.parcelle = parcelle;
    }

    public String getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(String geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getGeoShape() {
        return geoShape;
    }

    public void setGeoShape(String geoShape) {
        this.geoShape = geoShape;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    @Override
    public String toString() {
        return "FrescoesEntity{" +
                "id=" + id +
                ", codeInsee=" + codeInsee +
                ", categorie='" + categorie + '\'' +
                ", etatOeuvre='" + etatOeuvre + '\'' +
                ", photo='" + photo + '\'' +
                ", etatSupport='" + etatSupport + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", support='" + support + '\'' +
                ", anneeCreation=" + anneeCreation +
                ", artiste='" + artiste + '\'' +
                ", maitreOeuvre='" + maitreOeuvre + '\'' +
                ", proprietaire='" + proprietaire + '\'' +
                ", mnemo='" + mnemo + '\'' +
                ", numPostal='" + numPostal + '\'' +
                ", section='" + section + '\'' +
                ", parcelle=" + parcelle +
                ", geoPoint='" + geoPoint + '\'' +
                ", geoShape='" + geoShape + '\'' +
                ", nomRue='" + nomRue + '\'' +
                '}';
    }
}
