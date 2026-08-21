/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class bd {
    private final bgp a;
    private final je.a b;

    public bd(bgp $$0, je.a $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public void a(Optional<bc> $$0, String $$12) {
        $$0.ifPresent($$1 -> this.a((bc)$$1, $$12));
    }

    public void a(List<bc> $$0, String $$1) {
        this.a($$0, fqw.n, $$1);
    }

    public void a(bc $$0, String $$1) {
        this.a($$0, fqw.n, $$1);
    }

    public void a(bc $$0, bhw $$1, String $$2) {
        $$0.a(new fog(this.a.a(new bgp.c($$2)), $$1, this.b));
    }

    public void a(List<bc> $$0, bhw $$1, String $$2) {
        for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
            bc $$4 = $$0.get($$3);
            $$4.a(new fog(this.a.a(new bgp.d($$2, $$3)), $$1, this.b));
        }
    }
}

