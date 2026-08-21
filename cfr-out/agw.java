/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class agw
implements aay<adb> {
    public static final aao<xq, agw> a = aay.a(agw::a, agw::new);
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private final String e;
    private final yh f;
    private final fuu.a g;
    private final Optional<aag> h;
    private final int i;

    public agw(fuj $$0, int $$1) {
        this.e = $$0.c();
        this.f = $$0.e();
        this.g = $$0.i();
        this.h = Optional.ofNullable($$0.g());
        this.i = $$1;
    }

    private agw(xq $$0) {
        this.e = $$0.p();
        this.i = $$0.readByte();
        if (this.i == 0 || this.i == 2) {
            this.f = (yh)yj.d.decode($$0);
            this.g = $$0.b(fuu.a.class);
            this.h = (Optional)aai.d.decode($$0);
        } else {
            this.f = yg.a;
            this.g = fuu.a.a;
            this.h = Optional.empty();
        }
    }

    @Override
    private void a(xq $$0) {
        $$0.a(this.e);
        $$0.l(this.i);
        if (this.i == 0 || this.i == 2) {
            yj.d.encode($$0, this.f);
            $$0.a(this.g);
            aai.d.encode($$0, this.h);
        }
    }

    @Override
    public aba<agw> a() {
        return ahz.aR;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public String b() {
        return this.e;
    }

    public yh e() {
        return this.f;
    }

    public int f() {
        return this.i;
    }

    public fuu.a g() {
        return this.g;
    }

    public Optional<aag> h() {
        return this.h;
    }
}

