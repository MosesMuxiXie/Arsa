/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public interface fnt {
    public static final int d = 19133;
    public static final int e = 19132;

    public dxm C();

    public void a(dxm var1);

    public boolean E();

    public Set<String> F();

    public Set<String> G();

    public void a(String var1, boolean var2);

    default public void a(n $$0) {
        $$0.a("Known server brands", () -> String.join((CharSequence)", ", this.F()));
        $$0.a("Removed feature flags", () -> String.join((CharSequence)", ", this.G()));
        $$0.a("Level was modded", () -> Boolean.toString(this.E()));
        $$0.a("Level storage version", () -> {
            int $$0 = this.w();
            return String.format(Locale.ROOT, "0x%05X - %s", $$0, this.f($$0));
        });
    }

    default public String f(int $$0) {
        switch ($$0) {
            case 19133: {
                return "Anvil";
            }
            case 19132: {
                return "McRegion";
            }
        }
        return "Unknown?";
    }

    public @Nullable uz D();

    public void a(@Nullable uz var1);

    public fnn H();

    public dws I();

    public uz a(jr var1, @Nullable uz var2);

    public boolean k();

    public int w();

    public String d();

    public dwl j();

    public void a(dwl var1);

    public boolean l();

    public ccz p();

    public void a(ccz var1);

    public boolean q();

    public void d(boolean var1);

    public eua n();

    public @Nullable uz v();

    public esk.a B();

    public void a(esk.a var1);

    public evo x();

    public boolean y();

    public boolean z();

    public Lifecycle A();

    default public dgz J() {
        return this.C().b();
    }
}

