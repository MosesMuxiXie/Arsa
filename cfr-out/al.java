/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public class al {
    private @Nullable Instant a;

    public al() {
    }

    public al(Instant $$0) {
        this.a = $$0;
    }

    public boolean a() {
        return this.a != null;
    }

    public void b() {
        this.a = Instant.now();
    }

    public void c() {
        this.a = null;
    }

    public @Nullable Instant d() {
        return this.a;
    }

    public String toString() {
        return "CriterionProgress{obtained=" + String.valueOf(this.a == null ? "false" : this.a) + "}";
    }

    public void a(wx $$0) {
        $$0.a(this.a, wx::a);
    }

    public static al b(wx $$0) {
        al $$1 = new al();
        $$1.a = $$0.c(wx::s);
        return $$1;
    }
}

