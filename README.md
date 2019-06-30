# project2D
Progetto 2D di Architetture dei Sistemi Software
# project2D
Per eseguire il progetto bisogna prima aver scaricato e settato l'ambiente virtuale 'workstation' presente sul repository del professore. Va copiato il progetto nella cartella asw/projcts, e a quel punto può essere fatta partire la macchina virtuale con vagrant up da asw/enviroments/workstation

Una volta partita la macchina virtuale vanno eseuiti i seguenti comandi:
  1. source set-docker-host-ip.sh
  2. bash start-kafka.sh
  3. bash build-docker-images.sh
  4. bash run-all-containers.sh (o altro script per lanciare i containers)
  
  Per stoppare le appllicazioni:
    1. bash stop-all-containers.sh (o altro script per stoppare i containers)
    2. bash stop-kafka.sh
