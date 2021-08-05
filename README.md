### Configuration requise
* JDK 1.8
* Maven 3 ou supérieur

### Démarrer l'application

* `cd demo`    
* `mvn clean install`
* `cd package`    
* `mvn spring-boot:run`   

L'application démarre sur le port 8081. 

>Pour tester le bon fonctionnement, effectuer une requête `GET` sur l'url suivante : `localhost:8081/demo/hello`

>Une fois l'application springboot démarrée, le front se déploie sur l'url suivante : `http://localhost:8081/demo/`

## Présentation
Le projet est découpé en plusieurs sous projets :

* core : couche data, gestion de la persistence en base de données
* rest : couche traitement, gestion de la données
* package : couche présentation, gestion de la présentation des données avec déploiement d'un front AngularJS

## Travail à effetuer
### Impact backend

>**Overview** : L'objectif de ce test est de modifier une application **Java/Springboot** exposant des services **RESTful** et permettant d'exploiter des données dans une base **H2**.

* Changer le port de démarrage de l'application en `8080`
* Le service `SampleService.java` contient des incohérences ce qui ne le rend pas **RESTful**. Appliquer les modifications nécessaires.
* Exploiter le fichier `demo\68224_fresques_mulhouse.csv` à la racine du projet :
  * Créer un repository `FrescoesRepository` et une entité `Frescoes` respectant les noms et types de colonnes représentées dans le fichier  
  * Insérer les données présentes dans ce fichier dans la base de données en adaptant le script `demo\package\src\main\resources\data.sql`
  * Créer un service **RESTful** nommé `FrescoesService` ayant pour path principal `'/frescoes'`
    * Créer un endpoint renvoyant une fresque par son id
    * Créer un endpoint renvoyant toutes les fresques
    * Créer un endpoint renvoyant une liste de fresques via un filtre acsendant ou descendant sur la colonne `ANNEE_CREATION`
    * Créer un endpoint supprimant une fresque par son id
  
* Les commentaires et tests JUnit sur les différentes couches de l'application seront appréciés

### Impact frontend
Il est nécessaire d'avoir effectué tous les impacts backend avant de commencer ceux du front.

>**Overview** : L'objectif de ce test est de créer une application **AngularJS** capable d'appeler des services **RESTful** et d'exploiter les données récupérées.

* Modifier l'application angularJS présente dans le projet `demo\package\src\main\resources\static`
* Créer une resource afin d'exploiter les données exposées par le service FrescoesService
* Modifier ou créer une page html :
  * Cette page devra afficher une liste de fresques
    * Format imposé `ID` `PROPRIETAIRE` `MNEMO` 
    * Lors du click sur un des éléments de la liste, un panel dédié (dans la même page, une autre, un modal... libre choix de l'implémentation) devra afficher des données plus précices : 
      * Format imposé `ID`,`PROPRIETAIRE`,`MNEMO`,`GEO_POINT`,`NOM_RUE`,`COMMENTAIRE` 
      * Afficher la photo dont l'url est stockée dans la colonne `PHOTO`
    * Un bouton permettra de supprimer la fresque courante de la liste des fresques (appel du service **RESTful**)  
  * Le click sur un autre élément de la liste devra rafraichir les détails de la fresque
  * Il sera possible de trier côté front la liste des fresques par `ANNEE_CREATION`

* Les commentaires et tests, sur les différentes couches de l'application seront appréciés


#### Bonus :
Intégrer [angular-ui.bootstrap](https://angular-ui.github.io/bootstrap/)
* Faire défiler les photos des fresques dans un Carousel (ui.bootstrap.carousel)
* Afficher les données de fresques détaillées dans une Modal (ui.bootstrap.modal)
* Ajouter un filtre sur l'année pour remonter les fresques comprises entre l'année X et Y en utilisant le composant Datepicker (ui.bootstrap.datepicker)
* Afficher dans le panel de détails, la position en se basant sur les coordonnées `GEO_POINT`. Utiliser https://ngmap.github.io/


Pour visionner correctement le markdown : https://markdownlivepreview.com/   