# User workload monitoring example

### Demo script

- Compiler et deployer l'application monitoring-demo-app sur 2 sites
- Explorer les metriques personnalisées nommées: app_metric_perso1_total et app_metric_perso2_total  (URL: /q/metrics)
- Démontrer la collecte centralisée via le Grafana de ACM
- Définir une alerte à un certain threshold et envoyer un message slack. 
- Appeler le service /metric1 et/ou /metric2 pour faire déclencher l'alerte. 
