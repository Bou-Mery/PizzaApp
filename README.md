# Application de Recettes de Pizza 

## Description

Ce projet consiste à développer une application Android simple qui présente différentes recettes de pizza. L'application permet aux utilisateurs de parcourir une liste de pizzas, consulter les détails de chaque recette, et voir les ingrédients ainsi que les étapes de préparation.

## Fonctionnalités

- **Affichage de la liste des pizzas :** L'application affiche une liste de pizzas avec des images associées.
- **Détail des recettes :** En cliquant sur une pizza, l'utilisateur est redirigé vers une page de détails où sont présentés les ingrédients et les étapes de la recette.
- **Splash Screen :** Un écran de démarrage avec un logo animé apparaît lors du lancement de l'application.
- **Support d'animation :** Une animation est affichée au démarrage pour améliorer l'expérience utilisateur.

## Structure du projet

Le projet est organisé comme suit :

- `classes/`: Contient la classe `Produit` qui représente les pizzas.
- `dao/`: Interface générique `IDao` pour la gestion des données.
- `service/`: Classe `ProduitService` qui implémente l'interface `IDao` en stockant les données dans une `List`.
- `adapter/`: Contient l'adaptateur `PizzaAdapter` pour gérer l'affichage personnalisé des éléments de la liste.
- `/`: Contient les différentes activités comme `SplashActivity` et `ListPizzaActivity`.

# Technologies Utilisées

- **Langage de programmation :** Java
- **IDE :** Android Studio
- **Version Android :** API 24+ 

### Installation

Clone le dépôt du projet :
   ```bash
   git clone  https://github.com/Bou-Mery/Tp2_PizzaApp.git 
   ```


# Démonstration Vidéo

Voici une courte démonstration de l'application :

https://github.com/user-attachments/assets/8c9f217a-7285-436e-bab7-ad2662d532bd

---

### Auteur
Projet réalisé par **[BOUKHRAIS Meryem]** dans le cadre du TP d'Android.


