 # Activité Pratique N°2 : ORM, JPA, Hibernate Spring Data(Gestion de patients)

Ce projet vise à mettre en œuvre un système de gestion de patients en utilisant Spring Boot et JPA, en suivant les instructions de la vidéo suivante comme ressource principale : [Lien vers la vidéo](https://www.youtube.com/watch?v=cz3p4y7tUEs).

## Prérequis

Avant de commencer, assurez-vous d'avoir installé IntelliJ Ultimate.

## Instructions

1. **Installation d'IntelliJ Ultimate**: Assurez-vous d'avoir installé IntelliJ Ultimate sur votre système.

2. **Créer un projet Spring Initializer**:
   - Créez un nouveau projet à l'aide de Spring Initializer.
   - Ajoutez les dépendances suivantes : JPA, H2, Spring Web et Lombok.

3. **Création de l'entité JPA Patient**:
   - Créez une entité JPA Patient avec les attributs spécifiés :
     - id de type Long
     - nom de type String
     - dateNaissance de type Date
     - malade de type boolean
     - score de type int

4. **Configuration de l'unité de persistance**:
   - Configurez l'unité de persistance dans le fichier `application.properties`.

5. **Création de l'interface JPA Repository**:
   - Créez une interface JPA Repository basée sur Spring Data pour l'entité Patient.

6. **Tests des opérations de gestion de patients**:
   - Réalisez quelques opérations de gestion de patients, telles que l'ajout, la consultation, la recherche, la mise à jour et la suppression.

7. **Migration de H2 Database vers MySQL**:
   - Effectuez la migration de la base de données H2 vers MySQL.
     ![image](https://github.com/kawtar-collab/Activite-Pratique-N2-ORM-JPA-Hibernate-SpringData/assets/126341572/0b999a51-0e60-4f1c-b6b8-425ab74a7464)


8. **Reprise des exemples de la vidéo**:
   - Reprenez les exemples de gestion des entités Patient, Médecin, rendez-vous, consultation, utilisateurs et rôles à partir des vidéos suivantes :
     - [Lien vers la vidéo 1](https://www.youtube.com/watch?v=Kfv_7m8INlU)
     - [Lien vers la vidéo 2](https://www.youtube.com/watch?v=s6p2dE3qrsU)

---
Auteur: [KHALLOUQ Kawtar II-BDCC2]
