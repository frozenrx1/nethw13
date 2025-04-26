import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientsQueue = new LinkedList<>(firstClients);

        while(!clientsQueue.isEmpty()){
            String client = clientsQueue.poll();
            System.out.println("Клиент: " + client + " сделал/а маникюр.");

            if (Math.random() < 0.5){
                String friend = "a friend of " + client;
                clientsQueue.add(friend);
                System.out.println(friend + " записался!");

            }
        }
        System.out.println("Все клиенты обработаны!");
    }
}