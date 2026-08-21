/*
 * Decompiled with CFR 0.152.
 */
public class aym
implements alr {
    private static final yh b = yh.c("multiplayer.status.request_handled");
    private final alq c;
    private final wu d;
    private boolean e;

    public aym(alq $$0, wu $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(ww $$0) {
    }

    @Override
    public boolean c() {
        return this.d.i();
    }

    @Override
    public void a(als $$0) {
        if (this.e) {
            this.d.a(b);
            return;
        }
        this.e = true;
        this.d.a(new alp(this.c));
    }

    @Override
    public void a(alm $$0) {
        this.d.a(new alj($$0.b()));
        this.d.a(b);
    }
}

