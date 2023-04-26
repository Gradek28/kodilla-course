package com.kodilla.mockito.homework;


import java.util.*;


public class WeatherNotificationService {
    Map<Location, Set<Client>> clients = new HashMap<>();
    public void addSubscriber(Client client, Location location) {
        Set<Client> subscribers = clients.getOrDefault(location, new HashSet<>());
        subscribers.add(client);
        clients.put(location, subscribers);
    }

    public void sendNotification(Notification notification, Location location) {
        Set<Client> subscribers = clients.getOrDefault(location, new HashSet<>());
        subscribers.forEach(client -> client.receive(notification));
    }

    public void removeSubscriber(Client client, Location location) {
        Set<Client> subscribers = clients.getOrDefault(location, new HashSet<>());
        subscribers.remove(client);
        clients.put(location, subscribers);
    }

    public void deleteLocation(Location location) {
        clients.remove(location);
    }
}
