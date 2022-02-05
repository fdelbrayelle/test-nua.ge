# Test de l'offre IaaS de Nua.ge

<p align="center"><img src="https://github.com/fdelbrayelle/test-nua.ge/blob/master/nuage-logo.png" width="300px"/></p>

Lors du Twitch donné le 25 février 2022, nous avons présenté l'offre IaaS de Nua.ge en parcourant l'interface avec pour objectif de déployer une application monolithique générée sur [JHipster](https://github.com/jhipster/generator-jhipster) 7.6.0. L'idée était de tester cela en binôme avec un profil plutôt cloud engineer et un profil plutôt développeur / architecte.

1. Créer un nouveau compte crédité de 200 € sur [nua.ge](https://nua.ge). D'après la page des [tarifs de nua.ge](https://nua.ge/tarifs) cela reviendra à 21,90 € par mois sur la base de 730 heures d'utilisation. Autrement dit, on pourrait tenir près d'un an avec un tel crédit.
2. Créer un nouveau projet "JHipster apps" : un projet peut accueillir plusieurs instances.
3. Générer d'une clé publique sur son poste avec `ssh-keygen -t rsa -b 4096` (la longueur doit être supérieure à 2048 bits).
4. Créer une nouvelle instance (Ubuntu 20.04 LTS, 2 coeurs, 8 Go de RAM, 100 Go de stockage, IP publique et ouverture du port SSH 22) en spécifiant la clé publique qui démarre par `ssh-rsa`. L'instance a un nom sous la forme `instance-YYYY-MM-DD-HH-MM-SS`.
5. Se connecter en ssh à l'instance avec `ssh ubuntu@IP_PUBLIQUE -i /path/to/.ssh/id_rsa_private_key`.
6. Cloner ce dépôt avec `git clone https://github.com/fdelbrayelle/test-nua.ge.git` et se déplacer dans le projet généré avec JHipster avec `mkdir jhipster-sample-project`.
7. Installer les dépendances de sdkman avec `sudo apt install unzip zip`.
7. [Installer sdkman](https://sdkman.io/install) avec `curl -s "https://get.sdkman.io" | bash` puis `source "$HOME/.sdkman/bin/sdkman-init.sh"`.
8. Installer Java 17 avec `sdk install java 17.0.2-oracle`.
9. Définir le chemin vers Java avec `export JAVA_HOME=/home/ubuntu/.sdkman/candidates/java/17.0.2-oracle/`.
10. [Installer nvm](https://github.com/nvm-sh/nvm) avec `curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.1/install.sh | bash` et `source ~/.bashrc` puis Node LTS (v16.13.2 à l'heure de la rédaction) avec `nvm install --lts`.
11. Exposer le port 80 HTTP sur l'extérieur via l'interface d'administration en cliquant sur "Groupes de sécurité" puis "Services HTTP & HTTPs ouverts sur Internet" et "Appliquer" sur l'instance.
12. Lancer `./mvnw spring-boot:run` pour le back-end : pas besoin d'installer Maven grâce au wrapper `mvnw`.
13. Lancer `npm run start` pour le front-end.


`npm run build` pour générer les fichiers statiques dans `~/target/classes/static`
Installer Docker avec `sudo snap install docker`
Lancer nginx avec `sudo docker-compose -f src/main/docker/nginx.yml up`
Préparer un package prêt pour la production avec `./mvnw -Pprod` ?
