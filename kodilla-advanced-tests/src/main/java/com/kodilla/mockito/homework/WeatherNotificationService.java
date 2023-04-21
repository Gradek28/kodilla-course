package com.kodilla.mockito.homework;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WeatherNotificationService {
    private Client client;

    public void addSubscriber(Client client) {
        this.clients.add(client);

    }

    private List<Client> clients = new ArrayList<>();


    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void addLocation(Location location) {
    }

    public void deleteAllLocations(Location location) {
        this.clients.remove(location);
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }

    public void deleteLocation(Location location) {
        this.clients.remove(location);

    }
}
