/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glr
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        if ($$4.s == null) {
            return;
        }
        $$0.b($$4.ap().h() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round($$4.s.n() * 100.0f)));
    }
}

