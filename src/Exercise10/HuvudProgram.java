package Exercise10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HuvudProgram {

    public HuvudProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange en stad där du vill veta tiden just nu, tex Toronto");
        String city = scan.nextLine().trim();

        try {
            LocalTime tiden = LocalTime.parse(getLocalTimeOfCity(city));
            System.out.println(tiden);
        } catch (DateTimeException e) {
            System.out.println("Staden stöds inte just nu, prova Toronto tex.");
        }
    }

    public String getLocalTimeOfCity(String cityName) {
        Instant i = Instant.now();
        ZoneId currentZone = getZoneId(cityName);
        ZonedDateTime currentCity = i.atZone(currentZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return currentCity.format(formatter);
    }


    public ZoneId getZoneId(String cityName) {
        cityName = cityName.toLowerCase(); // kontrollerar format, gör allt till lowercase
        String zoneId = "";
        switch (cityName) {
            case "toronto" -> zoneId = "America/Toronto";
            case "stockholm" -> zoneId = "Europe/Stockholm";
            case "shanghai" -> zoneId = "Asia/Shanghai";
        }
        return ZoneId.of(zoneId);
    }

    public static void main(String[] args) {
       /*
        Skriv ett program som tar en stad och skriver ut vad klockan är i den staden just nu
        på formatet HH:mm:ss. Implementera detta för åtminstone Toronto, Stockholm och
        Shanghai (fler städer om du vill). Googla för att hitta namnen på tidszonerna eller
        deras id:n.
                Programmet ska funka både då användaren skriver stadsnamnet med stora, små,
                eller blandade bokstäver. Det ska funka även om användaren lägger in blankslag
        efter stadens namn.
                Om en användare skriver in en stad som ditt program inte kan visa tid för, visa upp
        ett lämpligt felmeddelande.
        */
        new HuvudProgram();

    }
}
