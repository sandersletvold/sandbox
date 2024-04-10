package oslomet.data1700.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public void slettSiste() {
        int sisteTall = lottoRekker.size();
        lottoRekker.remove(sisteTall-1);
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        lottoRekker.clear();
    }

    @GetMapping("/tilfeldigTall")
    public SecureRandom tilfeldigTall() {
        SecureRandom random = new SecureRandom();
        return random;
    }
}
