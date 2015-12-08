package nl.lveekhout;

import nl.lveekhout.eventstore.Adres;
import nl.lveekhout.eventstore.Stream;
import nl.lveekhout.geteventstore.rest.AdresStreamGES;

import java.util.UUID;

/**
 * Created by eekhout.l on 08-12-2015.
 * class EventstoreClient
 */
public class EventstoreClient {
    public static void main(String args[]) {
        if (args.length<3) {
            System.out.printf("Minimaal %s agrumenten nodig\n", 3);
            return;
        }

        if (args[2].equals("get")) {
            System.out.printf("Aantal argumanten: [%s]\n", args.length);
            for (String s : args) {
                System.out.printf("\t- %s\n", s);
            }
            System.out.printf("\n");

            AdresStreamGES ges = new AdresStreamGES(args[0], args[1]);
            System.out.printf("%s\n", ges.toString());
        } else if (args[2].equals("uuid")) {
            System.out.printf("UUID(): [%s]\n", UUID.randomUUID());
        } else {
            System.out.printf("Onbekend commando: [%s]\n", args[2]);
        }
    }
}
