/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bcd {
    private int a;
    private int b;

    public boolean a(int $$0) {
        return this.b >= this.b($$0);
    }

    public boolean a(int $$0, List<axg> $$1) {
        int $$2 = (int)$$1.stream().filter(ddm::gP).count();
        return $$2 >= this.b($$0);
    }

    public int b(int $$0) {
        return Math.max(1, bgj.d((float)(this.a * $$0) / 100.0f));
    }

    public void a() {
        this.b = 0;
    }

    public int b() {
        return this.b;
    }

    public boolean a(List<axg> $$0) {
        int $$1 = this.a;
        int $$2 = this.b;
        this.a = 0;
        this.b = 0;
        for (axg $$3 : $$0) {
            if ($$3.au()) continue;
            ++this.a;
            if (!$$3.gr()) continue;
            ++this.b;
        }
        return !($$2 <= 0 && this.b <= 0 || $$1 == this.a && $$2 == this.b);
    }
}

