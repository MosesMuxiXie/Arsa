/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ahj
implements aay<adb> {
    public static final aao<wx, ahj> a = aay.a(ahj::a, ahj::new);
    private static final int b = 1;
    private static final int c = 2;
    private final @Nullable amo d;
    private final @Nullable bdb e;

    public ahj(@Nullable amo $$0, @Nullable bdb $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    private ahj(wx $$0) {
        byte $$1 = $$0.readByte();
        this.e = ($$1 & 1) > 0 ? $$0.b(bdb.class) : null;
        this.d = ($$1 & 2) > 0 ? $$0.q() : null;
    }

    @Override
    private void a(wx $$0) {
        if (this.e != null) {
            if (this.d != null) {
                $$0.l(3);
                $$0.a(this.e);
                $$0.a(this.d);
            } else {
                $$0.l(1);
                $$0.a(this.e);
            }
        } else if (this.d != null) {
            $$0.l(2);
            $$0.a(this.d);
        } else {
            $$0.l(0);
        }
    }

    @Override
    public aba<ahj> a() {
        return ahz.bd;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public @Nullable amo b() {
        return this.d;
    }

    public @Nullable bdb e() {
        return this.e;
    }
}

