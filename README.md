# InteroperabiliteElaticiteTP1

## <ins>Context</ins>

Vous trouverez ici les applications réalisées pour le cours d'intéropérabilité et élasticité des systèmes d'informations. <br> Il nous est demandé de faire un backend en _java et son jdk 8_ qui expose un service de calcul K-Means une partie du code a été fourni par le professeur pour ce qui concerne l'exposition du services WSDL. Nous avons construit un client en _python_ avec la librairie _flask_ pour monter rapidement un site web ainsi que la librairie _zeep_ pour la gestion de l'appel au service. Le dernier client sera réalisé en _Java et son jdk 8_ pour réaliser un client en mode console.

## <ins>Description : </ins>

- le dossier _SoapTP_ contient le fournisseur de service wsdl.
- Le dossier _client_ contient le client console java qui consume le client wsdl.
- Le dossier _pythonProject_ est le client web python qui consume le client wsdl.
- Le dossier _image_ contient les images pour le fichier _readme.md_.
- Le dossier _data_example_ contient un example de fichier csv.

## <ins>Mode d'emploi :</ins>

1. Lancer l'apllication java qui se trouve dans le dossier _SoapTP_
2. Installer le framework flak grâce au liens suivant : [URL](https://flask.palletsprojects.com/en/1.1.x/installation/)
3. Installer la librairie zeep grâce au liens suivant : [URL](https://docs.python-zeep.org/en/master/)
4. Lancer le programme python qui se trouve dans le dossier _pythonProject_ ou bien le programme java qui se trouve dans _client_.

## <ins>Présentation du client</ins>

Voici a quoi resemble le formulaire pour réaliser le calcule du K-means :<br>
![image](./image/vue_1.png)

Voici la vue de résultat du calcul :<br>
![image](./image/vue_2.png)

Voici la vue en mode console :<br>
![image](./image/vue_3.png)
