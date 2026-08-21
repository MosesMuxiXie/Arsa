/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class gms
implements gmt {
    private final yh b;
    private final yh c;
    protected final goy a = goy.d();

    public gms(gio $$02, yh $$1, yh $$2) {
        this.b = $$1;
        this.c = $$2;
        gju $$3 = new gju($$02, $$2);
        this.a.c().e().b();
        this.a.a($$3, $$0 -> $$0.e(30));
    }

    @Override
    public yh b() {
        return this.b;
    }

    @Override
    public yh bd_() {
        return this.c;
    }

    @Override
    public void a(Consumer<gjc> $$0) {
        this.a.a($$0);
    }

    @Override
    public void a(gpm $$0) {
        this.a.a();
        gos.a(this.a, $$0, 0.5f, 0.5f);
    }
}

