import java.util.*;

public class EvidencijaPolaznika {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Polaznik> mapaPolaznika = new HashMap<>();
        List<Polaznik> listaPolaznika = new ArrayList<>();

        System.out.println("Unesite polaznika (sa '0' završite unos):");

        while (true) {
            System.out.print("Upišite ime polaznika: ");
            String ime = scanner.nextLine();
            if (ime.equalsIgnoreCase("0")) {
                break;
            }

            System.out.print("Upišite prezime polaznika: ");
            String prezime = scanner.nextLine();

            System.out.print("Upišite e-mail polaznika: ");
            String email = scanner.nextLine();

            if (mapaPolaznika.containsKey(email)) {
                System.out.println("Polaznik s tom e-mail sdresom već postoji!");
            } else {
                Polaznik polaznik = new Polaznik(ime, prezime, email);
                mapaPolaznika.put(email, polaznik);
                listaPolaznika.add(polaznik);
                System.out.println("Polaznika je dodan!");
            }
        }

        // izmiješaj redoslijed polaznika
        Collections.shuffle(listaPolaznika);

        // ispis polaznika u nasumičnom redoslijedu
        System.out.println("\nIspis polaznika tečaja u nasumičnom redoslijedu:");
        for (Polaznik polaznik : listaPolaznika) {
            System.out.println(polaznik);
        }
    }
}
