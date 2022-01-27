Para rodar


Instalar o KIND -> https://kind.sigs.k8s.io/
Criar um cluster k8s
setar o cluster

Criar o discovery server do spring no k8s com isso -> https://docs.spring.io/spring-cloud-kubernetes/docs/current/reference/html/#deployment-yaml-3

Criar o cluster Kafka seguinto esse tutorial -> https://docs.confluent.io/operator/current/co-quickstart.html?_ga=2.161233151.313567174.1643312967-1751334013.1643312967&_gac=1.57695576.1643317859.Cj0KCQiAosmPBhCPARIsAHOen-MXzgTMdcukI31BXXG7nSo7QQydmQHlgHwGw7cXIxOwQWTlUtdnC2saAkKTEALw_wcB

Não esquecer de retornar o namespace padrão para o default depois de seguir esse tutorial

Entrar na gui da confluente e criar um topico chamado teste no Kafka

Ir nas pastas democonsumer e demoproducer, e rodar o comando comando_push.sh