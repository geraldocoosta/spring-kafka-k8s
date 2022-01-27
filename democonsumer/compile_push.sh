mvn clean package -DskipTests
docker build -t geraldocoosta/spring-k8s-kafka-consumer .
docker push geraldocoosta/spring-k8s-kafka-consumer:latest
kubectl create namespace spring-consumer
kubectl delete deploy spring-consumer -n spring-consumer 
kubectl delete configmap teste-consumer -n spring-consumer
kubectl apply -f ./k8s
