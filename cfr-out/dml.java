/*
 * Decompiled with CFR 0.152.
 */
public class dml
extends dne {
    public dml(dzq $$0, dzq $$1, dlp.a $$2) {
        super($$0, $$1, iz.a, $$2);
    }

    @Override
    public yh a(dlt $$0) {
        doy $$1 = $$0.a(ki.ar);
        if ($$1 != null && $$1.d().isPresent()) {
            return yh.a(this.n + ".named", new Object[]{$$1.d().get()});
        }
        return super.a($$0);
    }
}

