/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class aei
implements aay<adb> {
    public static final aao<wx, aei> a = aay.a(aei::a, aei::new);
    private final int b;
    private final byte c;

    public aei(cgk $$0, byte $$1) {
        this.b = $$0.aA();
        this.c = $$1;
    }

    private aei(wx $$0) {
        this.b = $$0.readInt();
        this.c = $$0.readByte();
    }

    @Override
    private void a(wx $$0) {
        $$0.q(this.b);
        $$0.l(this.c);
    }

    @Override
    public aba<aei> a() {
        return ahz.G;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public @Nullable cgk a(dwo $$0) {
        return $$0.a(this.b);
    }

    public byte b() {
        return this.c;
    }
}

