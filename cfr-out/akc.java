/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class akc
implements aay<aib> {
    public static final aao<wx, akc> a = aay.a(akc::a, akc::new);
    private final UUID b;

    public akc(UUID $$0) {
        this.b = $$0;
    }

    private akc(wx $$0) {
        this.b = $$0.n();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<akc> a() {
        return ahz.ct;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public @Nullable cgk a(axf $$0) {
        return $$0.d(this.b);
    }
}

