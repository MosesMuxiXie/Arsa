/*
 * Decompiled with CFR 0.152.
 */
public class hlz
extends hlt<hmg> {
    private final hlv d;
    final iku c = new iku();

    public hlz(hls $$0, hlv $$1) {
        super($$0);
        this.d = $$1;
    }

    @Override
    public iks a(htx $$0, ger $$1, float $$2) {
        for (hmg $$3 : this.b) {
            if (!$$0.b($$3.n, $$3.o, $$3.p)) continue;
            try {
                $$3.a(this.c, $$1, $$2);
            }
            catch (Throwable $$4) {
                m $$5 = m.a($$4, "Rendering Particle");
                n $$6 = $$5.a("Particle being rendered");
                $$6.a("Particle", $$3::toString);
                $$6.a("Particle Type", this.d::toString);
                throw new v($$5);
            }
        }
        return this.c;
    }
}

