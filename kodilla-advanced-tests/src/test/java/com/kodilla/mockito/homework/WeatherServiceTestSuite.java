package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void shouldClientSignInAndReceiveNotification() {
        // Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia

        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldClientDeleteLocationSubscription() {
        //Można wycofać subskrypcję z danej lokalizacji.

        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.removeSubscriber(client, location);
        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldClientStopReceivingNotifications() {
        // Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.

        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.removeSubscriber(client, location);
        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSpecificGroupOfClientsGetNotification() {
        //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.

        Client client1 = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.addSubscriber(client1, location1);
        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldAllSubscribersGetNotification() {
        //Możliwość wysyłki powiadomienia do wszystkich.

        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.addSubscriber(firstClient, location);
        weatherNotificationService.addSubscriber(secondClient, location1);
        weatherNotificationService.addSubscriber(thirdClient, location);
        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldBeAbleToDeleteCurrentLocation() {
        // Możliwość skasowania danej lokalizacji.

        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.deleteLocation(location);
        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}


