package oslomet.data1700.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LottoRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreRekke(Lotto rekke) {
        String sql = "INSERT INTO lottorekker (tall0, tall1, tall2, tall3, tall4, tall5, tall6) VALUES(?,?,?,?,?,?,?)";
        db.update(sql, rekke.gettall0(), rekke.gettall1(), rekke.gettall2(), rekke.gettall3(), rekke.gettall4(), rekke.gettall5(), rekke.gettall6());
    }

    public List<Lotto> hentRekker() {
        String sql = "SELECT * FROM lottorekker";
        List<Lotto> alleRekker = db.query(sql, new BeanPropertyRowMapper<>(Lotto.class));
        return alleRekker;
    }

    public List<Lotto> slettSiste() {
        String fjern = "DELETE FROM lottorekker WHERE rekkeId = (SELECT MAX(rekkeId) FROM lottorekker)";
        db.update(fjern);
        String sql = "SELECT * FROM lottorekker";
        List<Lotto> fjernetRekke = db.query(sql, new BeanPropertyRowMapper<>(Lotto.class));
        return fjernetRekke;
    }

    public void slettRekker() {
        String sql = "DELETE FROM lottorekker";
        db.update(sql);
    }

    public void lagreVinnerTall(LottoVinnertall vinnertall) {
        String sql = "INSERT INTO vinnertall (vinnertall0, vinnertall1, vinnertall2, vinnertall3, vinnertall4, vinnertall5, vinnertall6) VALUES(?,?,?,?,?,?,?)";
        db.update(sql, vinnertall.getvinnertall0(), vinnertall.getvinnertall1(), vinnertall.getvinnertall2(), vinnertall.getvinnertall3(), vinnertall.getvinnertall4(), vinnertall.getvinnertall5(), vinnertall.getvinnertall6());
    }
}
