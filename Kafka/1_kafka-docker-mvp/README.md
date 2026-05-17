# Kafka Bare Bones 

## What does the program do?
- This project will create a kafka queue.
- The README has instructions on how to create a topic,
and then commands to send and receive messages using 
those topics.
- The producer and consumer are both terminal commands.


## Current status of project 
**COMPLETED** 


## Goals of this project?
- To provide a bare bones kafka queue in adocker container.
- To show how messages are sent and recieved using the 
kafka queue.


## Focus of the project?
- Create a kafka queue.
- See how messages are sent. 
- Experiment with haveing consumer switched on before or 
after the producer.
- Experiment with what happens when the consumer is shut down
and then restarted.


## Running the program  

These are the instructions to run the kafka queue in the docker container 

1. Navigate to the directory 
2. Make sure docker desktop for windows is running 
3. Run docker compose up -d
4. Create a topic with =

```
docker exec -it kafka kafka-topics --create \
  --topic test-topic \
  --bootstrap-server localhost:9092 \
  --partitions 3 \
  --replication-factor 1
```

(You have to paste it in a single line)

`docker exec -it kafka kafka-topics --create \  --topic test-topic \   --bootstrap-server localhost:9092 \ --partitions 3 \ --replication-factor 1`

5. Produce a test message with = 

`docker exec -it kafka kafka-console-producer --topic test-topic --bootstrap-server localhost:9092`

Breakdown of the command = 
- docker exec → run a command inside a container
- -it → interactive terminal
- kafka → container name
- kafka-console-producer → the Kafka CLI tool inside the container

6. Consume the test message with =

`docker exec -it kafka kafka-console-consumer --topic test-topic --bootstrap-server localhost:9092 --from-beginning`


++++++ Tips Tricks and Understanding this +++++++

- Create the topic. 
- After that you can have the consumer and producer open in different terminals and see the messages being sent and recieved live. 
- You can also start the consumer first and then the publisher and see all the messages come in.
- Or you can start the producer, send messages, close the producer, and then start the consumer to see it receieve all the messages. 