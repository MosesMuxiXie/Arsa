/*
 * Decompiled with CFR 0.152.
 */
public class lk
extends lf {
    private final dmn c;
    private final dmn.a d;

    /*
     * WARNING - void declaration
     */
    public lk(dlp $$0) {
        void $$2;
        if (!($$0 instanceof dmn)) {
            throw new IllegalArgumentException(String.valueOf($$0) + " not instance of " + dmn.class.getSimpleName());
        }
        dmn $$1 = (dmn)((Object)$$0);
        this.c = $$2;
        this.d = $$2.a();
    }

    @Override
    public dlt a(ld $$0, dlt $$1) {
        axf $$2 = $$0.b();
        iz $$3 = $$0.d().c(eby.b);
        jn $$4 = this.d.b().getDispensePosition($$0, $$3);
        dec.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, $$3.j(), $$3.k(), $$3.l(), this.d.d(), this.d.c());
        $$1.h(1);
        return $$1;
    }

    @Override
    protected void a(ld $$0) {
        $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
    }
}

