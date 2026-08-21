/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class gou
implements gov {
    public static final int a = 13;
    public static final int b = 33;
    private static final int c = 30;
    private final gos d = new gos();
    private final gos e = new gos();
    private final gos f = new gos();
    private final gsb g;
    private int h;
    private int i;

    public gou(gsb $$0) {
        this($$0, 33);
    }

    public gou(gsb $$0, int $$1) {
        this($$0, $$1, $$1);
    }

    public gou(gsb $$0, int $$1, int $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.d.c().a(0.5f, 0.5f);
        this.e.c().a(0.5f, 0.5f);
    }

    @Override
    public void f(int $$0) {
    }

    @Override
    public void g(int $$0) {
    }

    @Override
    public int aT_() {
        return 0;
    }

    @Override
    public int aU_() {
        return 0;
    }

    @Override
    public int aS_() {
        return this.g.o;
    }

    @Override
    public int aR_() {
        return this.g.p;
    }

    public int b() {
        return this.i;
    }

    public void a(int $$0) {
        this.i = $$0;
    }

    public void b(int $$0) {
        this.h = $$0;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.g.p - this.c() - this.b();
    }

    @Override
    public void b(Consumer<gow> $$0) {
        this.d.b($$0);
        this.f.b($$0);
        this.e.b($$0);
    }

    @Override
    public void a() {
        int $$0 = this.c();
        int $$1 = this.b();
        this.d.b(this.g.o);
        this.d.a($$0);
        this.d.c(0, 0);
        this.d.a();
        this.e.b(this.g.o);
        this.e.a($$1);
        this.e.a();
        this.e.g(this.g.p - $$1);
        this.f.b(this.g.o);
        this.f.a();
        int $$2 = $$0 + 30;
        int $$3 = this.g.p - $$1 - this.f.aR_();
        this.f.c(0, Math.min($$2, $$3));
    }

    public <T extends gow> T a(T $$0) {
        return this.d.a($$0);
    }

    public <T extends gow> T a(T $$0, Consumer<gox> $$1) {
        return this.d.a($$0, $$1);
    }

    public void a(yh $$0, gio $$1) {
        this.d.a(new gko($$0, $$1));
    }

    public <T extends gow> T b(T $$0) {
        return this.e.a($$0);
    }

    public <T extends gow> T b(T $$0, Consumer<gox> $$1) {
        return this.e.a($$0, $$1);
    }

    public <T extends gow> T c(T $$0) {
        return this.f.a($$0);
    }

    public <T extends gow> T c(T $$0, Consumer<gox> $$1) {
        return this.f.a($$0, $$1);
    }
}

