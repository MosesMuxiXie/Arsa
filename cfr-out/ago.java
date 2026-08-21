/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class ago
implements aay<adb> {
    public static final aao<wx, ago> a = aay.a(ago::a, ago::new);
    private final fui b;
    private final String c;

    public ago(fui $$0, @Nullable fuj $$1) {
        this.b = $$0;
        this.c = $$1 == null ? "" : $$1.c();
    }

    private ago(wx $$0) {
        this.b = $$0.a(fui.u);
        this.c = $$0.p();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(fui::a, this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<ago> a() {
        return ahz.aJ;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public fui b() {
        return this.b;
    }

    public @Nullable String e() {
        return Objects.equals(this.c, "") ? null : this.c;
    }
}

