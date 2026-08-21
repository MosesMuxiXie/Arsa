/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class gos
extends gop {
    private final List<a> c = new ArrayList<a>();
    private int d;
    private int e;
    private final gox f = gox.i().a(0.5f, 0.5f);

    public gos() {
        this(0, 0, 0, 0);
    }

    public gos(int $$0, int $$1) {
        this(0, 0, $$0, $$1);
    }

    public gos(int $$0, int $$1, int $$2, int $$3) {
        super($$0, $$1, $$2, $$3);
        this.a($$2, $$3);
    }

    public gos a(int $$0, int $$1) {
        return this.b($$0).a($$1);
    }

    public gos a(int $$0) {
        this.e = $$0;
        return this;
    }

    public gos b(int $$0) {
        this.d = $$0;
        return this;
    }

    public gox b() {
        return this.f.g();
    }

    public gox c() {
        return this.f;
    }

    @Override
    public void a() {
        super.a();
        int $$0 = this.d;
        int $$1 = this.e;
        for (a $$2 : this.c) {
            $$0 = Math.max($$0, $$2.b());
            $$1 = Math.max($$1, $$2.a());
        }
        for (a $$3 : this.c) {
            $$3.a(this.aT_(), $$0);
            $$3.b(this.aU_(), $$1);
        }
        this.a = $$0;
        this.b = $$1;
    }

    public <T extends gow> T a(T $$0) {
        return this.a($$0, this.b());
    }

    public <T extends gow> T a(T $$0, gox $$1) {
        this.c.add(new a($$0, $$1));
        return $$0;
    }

    public <T extends gow> T a(T $$0, Consumer<gox> $$1) {
        return this.a($$0, bhs.a(this.b(), $$1));
    }

    @Override
    public void b(Consumer<gow> $$0) {
        this.c.forEach($$1 -> $$0.accept($$1.a));
    }

    public static void a(gow $$0, int $$1, int $$2, int $$3, int $$4) {
        gos.a($$0, $$1, $$2, $$3, $$4, 0.5f, 0.5f);
    }

    public static void a(gow $$0, gpm $$1) {
        gos.a($$0, $$1.f().a(), $$1.f().b(), $$1.g(), $$1.h());
    }

    public static void a(gow $$0, gpm $$1, float $$2, float $$3) {
        gos.a($$0, $$1.d(), $$1.b(), $$1.g(), $$1.h(), $$2, $$3);
    }

    public static void a(gow $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6) {
        gos.a($$1, $$3, $$0.aS_(), $$0::f, $$5);
        gos.a($$2, $$4, $$0.aR_(), $$0::g, $$6);
    }

    public static void a(int $$0, int $$1, int $$2, Consumer<Integer> $$3, float $$4) {
        int $$5 = (int)bgj.h($$4, 0.0f, $$1 - $$2);
        $$3.accept($$0 + $$5);
    }

    static class a
    extends gop.a {
        protected a(gow $$0, gox $$1) {
            super($$0, $$1);
        }
    }
}

