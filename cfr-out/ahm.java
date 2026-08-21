/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ahm
implements aay<adb> {
    public static final aao<wx, ahm> a = aay.a(ahm::a, ahm::new);
    private final int b;
    private final @Nullable uz c;

    public ahm(int $$0, @Nullable uz $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private ahm(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.o();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<ahm> a() {
        return ahz.bg;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public @Nullable uz e() {
        return this.c;
    }

    @Override
    public boolean c() {
        return true;
    }
}

