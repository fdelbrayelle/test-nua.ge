# Test de l'offre IaaS de Nua.ge

Lors du Twitch donné le 25 février 2022 nous avons présenté l'offre IaaS de Nua.ge en parcourant l'interface avec pour objectif de déployer une application monolithique générée sur [JHipster](https://github.com/jhipster/generator-jhipster) 7.6.0. L'idée était de tester cela en binôme avec un profil plutôt cloud engineer et un profil plutôt développeur / architecte.

1. Créer un nouveau compte crédité de 200 € sur [nua.ge](https://nua.ge).
2. Créer un nouveau projet.
3. Générer d'une clé publique sur son poste avec `ssh-keygen -t rsa -b 4096` (la longueur doit être supérieure à 2048 bits).
4. Créer une nouvelle instance (Ubuntu 20.04 LTS, 2 coeurs, 8 Go de RAM, 100 Go de stockage, IP publique et ouverture du port SSH 22) en spécifiant la clé publique qui démarre par `ssh-rsa`. L'instance a un nom sous la forme `instance-YYYY-MM-DD-HH-MM-SS`.
5. Se connecter en ssh à l'instance avec `ssh ubuntu@IP_PUBLIQUE -i /path/to/.ssh/id_rsa_private_key`.
6. 
