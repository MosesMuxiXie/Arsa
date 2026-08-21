/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public class gnh
implements gnf {
    private static final amo e = amo.b("hud/jump_bar_background");
    private static final amo f = amo.b("hud/jump_bar_cooldown");
    private static final amo g = amo.b("hud/jump_bar_progress");
    private final gfj h;
    private final chv i;

    public gnh(gfj $$0) {
        this.h = $$0;
        this.i = Objects.requireNonNull(Objects.requireNonNull($$0.s).C());
    }

    @Override
    public void a(gir $$0, gez $$1) {
        int $$2 = this.a(this.h.aR());
        int $$3 = this.b(this.h.aR());
        $$0.a(hpa.at, e, $$2, $$3, 182, 5);
        if (this.i.c() > 0) {
            $$0.a(hpa.at, f, $$2, $$3, 182, 5);
            return;
        }
        int $$4 = bgj.b(this.h.s.D(), 0, 182);
        if ($$4 > 0) {
            $$0.a(hpa.at, g, 182, 5, 0, 0, $$2, $$3, $$4, 5);
        }
    }

    @Override
    public void b(gir $$0, gez $$1) {
    }
}

