package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void ShouldClientSignInAndReceiveNotification() {
//Osoba zainteresowana może zostać zapisana do danej lokalizacji, i zacznie otrzymywać powiadomienia.

        weatherNotificationService.addSubscriber(client);
        weatherNotificationService.addLocation(location);
        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void ShouldClientDeleteLocationSubscription() {
//Można wycofać subskrypcję z danej lokalizacji.

        weatherNotificationService.sendNotification(notification);
        weatherNotificationService.addLocation(location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void ShouldClientStopReceivingNotifications() {
//Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
        weatherNotificationService.deleteAllLocations(location);
        weatherNotificationService.removeSubscriber(client);

        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void ShouldSpecificGroupOfClientsGetNotification() {
//Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.

        weatherNotificationService.addSubscriber(client);
        weatherNotificationService.addLocation(location);
        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void ShouldAllSubscribersGetNotification() {
//Możliwość wysyłki powiadomienia do wszystkich.
        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        weatherNotificationService.addSubscriber(firstClient);
        weatherNotificationService.addSubscriber(secondClient);
        weatherNotificationService.addSubscriber(thirdClient);

        weatherNotificationService.sendNotification(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void ShouldBeAbleToDeleteCurrentLocation() {
        //Możliwość skasowania danej lokalizacji.

        weatherNotificationService.deleteLocation(location);
        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}


