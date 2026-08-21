/*
 * Decompiled with CFR 0.152.
 */
public class ajh
implements aay<aib> {
    public static final aao<wx, ajh> a = aay.a(ajh::a, ajh::new);
    private static final int b = 2;
    private final boolean c;

    public ajh(ddi $$0) {
        this.c = $$0.b;
    }

    private ajh(wx $$0) {
        byte $$1 = $$0.readByte();
        this.c = ($$1 & 2) != 0;
    }

    @Override
    private void a(wx $$0) {
        int $$1 = 0;
        if (this.c) {
            $$1 = (byte)($$1 | 2);
        }
        $$0.l($$1);
    }

    @Override
    public aba<ajh> a() {
        return ahz.bY;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public boolean b() {
        return this.c;
    }
}

