# 🎾 Suivi du Score de Tennis (Approche TDD)

Ce projet implémente un système de calcul du score au tennis en Java en utilisant l'approche TDD (Test-Driven Development).  
Le programme prend en entrée une séquence de points gagnés par les joueurs (`A` et `B`) 
et affiche l'évolution du score en respectant les règles du tennis.

## Fonctionnalités

- Calcule et affiche le score après chaque point gagné.
- Gère les cas particuliers du **deuce** et de l'**avantage**.
- Déclare le **vainqueur** lorsque la partie est terminée.
- Utilise **TDD (Développement Dirigé par les Tests)** pour garantir la fiabilité du code.

---

## Approche TDD

Ce projet suit le cycle **TDD** :

1. **Écrire un test qui échoue** (Red)
    - Définition des cas de test avant toute implémentation.

2. **Écrire le minimum de code pour passer le test** (Green)
    - Implémentation progressive de la logique pour satisfaire chaque test.

3. **Refactoriser le code** (Refactor)
    - Amélioration du code sans modifier son comportement.


##  Implémentation

### **Logique de calcul du score**
- La méthode `trackScore(String points)` traite une chaîne de caractères (`A` et `B`) et met à jour le score en conséquence.
- Le score est stocké dans une **liste (`List<String>`)** pour faciliter les tests.


