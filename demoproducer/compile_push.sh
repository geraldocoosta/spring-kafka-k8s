mvn clean package -DskipTests
docker build -t geraldocoosta/spring-k8s-kafka .
docker push geraldocoosta/spring-k8s-kafka:latest
kubectl create namespace spring-producer
kubectl delete deploy spring-producer -n spring-producer 
kubectl delete configmap teste-producer -n spring-producer
kubectl apply -f ./k8s
