/*
 * Decompiled with CFR 0.152.
 */
public class afh
implements aay<adb> {
    public static final aao<wx, afh> a = aay.a(afh::a, afh::new);
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 8;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final float j;
    private final float k;

    public afh(ddi $$0) {
        this.f = $$0.a;
        this.g = $$0.b;
        this.h = $$0.c;
        this.i = $$0.d;
        this.j = $$0.a();
        this.k = $$0.b();
    }

    private afh(wx $$0) {
        byte $$1 = $$0.readByte();
        this.f = ($$1 & 1) != 0;
        this.g = ($$1 & 2) != 0;
        this.h = ($$1 & 4) != 0;
        this.i = ($$1 & 8) != 0;
        this.j = $$0.readFloat();
        this.k = $$0.readFloat();
    }

    @Override
    private void a(wx $$0) {
        byte $$1 = 0;
        if (this.f) {
            $$1 = (byte)($$1 | 1);
        }
        if (this.g) {
            $$1 = (byte)($$1 | 2);
        }
        if (this.h) {
            $$1 = (byte)($$1 | 4);
        }
        if (this.i) {
            $$1 = (byte)($$1 | 8);
        }
        $$0.l($$1);
        $$0.a(this.j);
        $$0.a(this.k);
    }

    @Override
    public aba<afh> a() {
        return ahz.af;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public boolean b() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.i;
    }

    public float h() {
        return this.j;
    }

    public float i() {
        return this.k;
    }
}

