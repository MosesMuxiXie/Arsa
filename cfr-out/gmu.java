/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gmu {
    private final Consumer<gjc> a;
    private final Consumer<gjc> b;
    private final Consumer<gmt> c;
    private final Consumer<gmt> d;
    private @Nullable gmt e;
    private @Nullable gpm f;

    public gmu(Consumer<gjc> $$02, Consumer<gjc> $$1) {
        this($$02, $$1, $$0 -> {}, $$0 -> {});
    }

    public gmu(Consumer<gjc> $$0, Consumer<gjc> $$1, Consumer<gmt> $$2, Consumer<gmt> $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public void a(gpm $$0) {
        this.f = $$0;
        gmt $$1 = this.a();
        if ($$1 != null) {
            $$1.a($$0);
        }
    }

    public void a(gmt $$0, boolean $$1) {
        if (!Objects.equals(this.e, $$0)) {
            if (this.e != null) {
                this.e.a(this.b);
            }
            gmt $$2 = this.e;
            this.e = $$0;
            $$0.a(this.a);
            if (this.f != null) {
                $$0.a(this.f);
            }
            if ($$1) {
                gfj.V().ap().a(iph.a(bda.DJ, 1.0f));
            }
            this.d.accept($$2);
            this.c.accept(this.e);
        }
    }

    public @Nullable gmt a() {
        return this.e;
    }
}

