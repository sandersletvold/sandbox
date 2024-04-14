package oslomet.data1700.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.security.SecureRandom;

@RestController
public class LottoController {
    @Autowired
    private LottoRepository repository;

    @PostMapping("/tilServer")
    public void mottattRekke(Lotto lottorekke) {
        repository.lagreRekke(lottorekke);
    }

    @GetMapping("/tilKlient")
    public List<Lotto> sendRekker() {
        return repository.hentRekker();
    }

    @GetMapping("/slettSiste")
    public List<Lotto> slettSiste() {
        return repository.slettSiste();
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        repository.slettRekker();
    }

    @GetMapping("/tilfeldigTall")
    public List<Integer> tilfeldigTall() {
        List<Integer> tallRekke = new ArrayList<>();
        SecureRandom secureRandom = new SecureRandom();
        while (tallRekke.size() < 7) {
            int tilfeldigTall = secureRandom.nextInt(1,35);
            if (!tallRekke.contains(tilfeldigTall)) {
                tallRekke.add(tilfeldigTall);
            }
        }
        Collections.sort(tallRekke);
        return tallRekke;
    }

    List<Integer> vinnerTallrekke = new ArrayList<>();
    @GetMapping("/hentVinnerTall")
    public List<Integer> vinnerTall() {
        vinnerTallrekke.clear();
        SecureRandom secureRandom = new SecureRandom();
        while (vinnerTallrekke.size() < 7) {
            int tilfeldigTall = secureRandom.nextInt(1,35);
            if (!vinnerTallrekke.contains(tilfeldigTall)) {
                vinnerTallrekke.add(tilfeldigTall);
            }
        }
        Collections.sort(vinnerTallrekke);
        return vinnerTallrekke;
    }

    @PostMapping("/sendVinnertall")
    public void vinnerRekke(LottoVinnertall vinnertall) {
        repository.lagreVinnerTall(vinnertall);
    }
}
