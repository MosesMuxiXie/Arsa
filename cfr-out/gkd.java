/*
 * Decompiled with CFR 0.152.
 */
public class gkd
extends gje {
    private final gio a;
    private final yh b;
    private final yh c;

    public gkd(int $$0, int $$1, int $$2, int $$3, yh $$4, gje.c $$5, gio $$6) {
        super($$0, $$1, $$2, $$3, $$4, $$5, r);
        this.a = $$6;
        this.b = $$4;
        this.c = yk.a($$4, zf.a.c(true));
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        yh $$4 = this.D() ? this.c : this.b;
        $$0.b(this.a, $$4, this.aT_(), this.aU_(), 0xFFFFFF | bgj.d(this.m * 255.0f) << 24);
    }
}

