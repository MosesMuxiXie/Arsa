/*
 * Decompiled with CFR 0.152.
 */
public class gee
extends geh {
    private static final yh b = yh.c("mco.connect.connecting");
    private final isa c;
    private final gbg d;
    private final gbc e;

    public gee(gsb $$0, gbg $$1, gbc $$2) {
        this.d = $$1;
        this.e = $$2;
        this.c = new isa($$0);
    }

    @Override
    public void run() {
        if (this.e.a() != null) {
            this.c.a(this.d, hjw.a(this.e.a()));
        } else {
            this.b();
        }
    }

    @Override
    public void b() {
        super.b();
        this.c.a();
        gfj.V().ak().i();
    }

    @Override
    public void c() {
        this.c.b();
    }

    @Override
    public yh a() {
        return b;
    }
}

