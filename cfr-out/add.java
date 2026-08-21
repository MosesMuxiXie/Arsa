/*
 * Decompiled with CFR 0.152.
 */
public class add
implements aay<adb> {
    public static final aao<wx, add> a = aay.a(add::a, add::new);
    public static final int b = 0;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private final int g;
    private final int h;

    public add(cgk $$0, int $$1) {
        this.g = $$0.aA();
        this.h = $$1;
    }

    private add(wx $$0) {
        this.g = $$0.l();
        this.h = $$0.readUnsignedByte();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.g);
        $$0.l(this.h);
    }

    @Override
    public aba<add> a() {
        return ahz.d;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.g;
    }

    public int e() {
        return this.h;
    }
}

