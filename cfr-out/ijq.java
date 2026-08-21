/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class ijq {
    private final String e;
    private final Supplier<@Nullable fxt> f;
    public static final ijq a = new ijq("main_target", () -> gfj.V().l());
    public static final ijq b = new ijq("outline_target", () -> gfj.V().e.q());
    public static final ijq c = new ijq("weather_target", () -> gfj.V().e.u());
    public static final ijq d = new ijq("item_entity_target", () -> gfj.V().e.s());

    public ijq(String $$0, Supplier<@Nullable fxt> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public fxt a() {
        fxt $$0 = this.f.get();
        return $$0 != null ? $$0 : gfj.V().l();
    }

    public String toString() {
        return "OutputTarget[" + this.e + "]";
    }
}

