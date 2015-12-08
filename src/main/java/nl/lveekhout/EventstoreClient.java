package nl.lveekhout;

import nl.lveekhout.eventstore.Stream;
import nl.lveekhout.geteventstore.rest.AdresStreamGES;

/**
 * Created by eekhout.l on 08-12-2015.
 * class EventstoreClient
 */
public class EventstoreClient {
    public static void main(String args[]) {
        System.out.printf("Aantal argumanten: [%s]\n", args.length);
        for (String s : args) {
            System.out.printf("\t[%s]\n", s);
        }

        Stream stream = new AdresStreamGES(args[0]).zoekAdressen();
        System.out.printf("%s\n", stream.getTitle());
    }
}
