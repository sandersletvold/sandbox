package oslomet.data1700.sandbox;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vinnertall")
public class LottoVinnertall {
    @Id
    @GeneratedValue
    private int vinnertall0;
    private int vinnertall1;
    private int vinnertall2;
    private int vinnertall3;
    private int vinnertall4;
    private int vinnertall5;
    private int vinnertall6;

    public LottoVinnertall(int vinnertall0, int vinnertall1, int vinnertall2, int vinnertall3, int vinnertall4, int vinnertall5, int vinnertall6) {
        this.vinnertall0 = vinnertall0;
        this.vinnertall1 = vinnertall1;
        this.vinnertall2 = vinnertall2;
        this.vinnertall3 = vinnertall3;
        this.vinnertall4 = vinnertall4;
        this.vinnertall5 = vinnertall5;
        this.vinnertall6 = vinnertall6;
    }

    public LottoVinnertall() {

    }

    public int getvinnertall0() {
        return vinnertall0;
    }
    public void setvinnertall0(int vinnertall0) {
        this.vinnertall0 = vinnertall0;
    }
    public int getvinnertall1() {
        return vinnertall1;
    }
    public void setvinnertall1(int vinnertall1) {
        this.vinnertall1 = vinnertall1;
    }
    public int getvinnertall2() {
        return vinnertall2;
    }
    public void setvinnertall2(int vinnertall2) {
        this.vinnertall2 = vinnertall2;
    }
    public int getvinnertall3() {
        return vinnertall3;
    }
    public void setvinnertall3(int vinnertall3) {
        this.vinnertall3 = vinnertall3;
    }
    public int getvinnertall4() {
        return vinnertall4;
    }
    public void setvinnertall4(int vinnertall4) {
        this.vinnertall4 = vinnertall4;
    }
    public int getvinnertall5() {
        return vinnertall5;
    }
    public void setvinnertall5(int vinnertall5) {
        this.vinnertall5 = vinnertall5;
    }
    public int getvinnertall6() {
        return vinnertall6;
    }
    public void setvinnertall6(int vinnertall6) {
        this.vinnertall6 = vinnertall6;
    }
}
