package oslomet.data1700.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.security.SecureRandom;

@RestController
public class LottoController {
    private List<Lotto> lottoRekker = new ArrayList<>();

    @PostMapping("/tilServer")
    public void mottattRekke(Lotto lottorekke) {
        lottoRekker.add(lottorekke);
    }

    @GetMapping("/tilKlient")
    public List<Lotto> sendRekker() {
        return lottoRekker;
    }

    @GetMapping("/slettSiste")
    public List<Lotto> slettSiste() {
        int sisteTall = lottoRekker.size();
        lottoRekker.remove(sisteTall-1);
        return lottoRekker;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        lottoRekker.clear();
    }

    @GetMapping("/tilfeldigTall")
    public List<Integer> tilfeldigTall() {
        SecureRandom secureRandom = new SecureRandom();
        List<Integer> tallRekke = new ArrayList<>();
        while (tallRekke.size() < 7) {
            int tilfeldigTall = secureRandom.nextInt(1,35); // Legger til 1 for å få tall mellom 1 og 34
            if (!tallRekke.contains(tilfeldigTall)) {
                tallRekke.add(tilfeldigTall);
            }
        }
        Collections.sort(tallRekke);
        return tallRekke;
    }
}
