/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import org.joml.Quaternionfc;

public class iag<S extends idf, M extends gzm<S>>
extends ibj<S, M> {
    private final Function<S, Optional<eoh>> a;
    private final Consumer<fzm> b;

    public iag(hyq<S, M> $$0, Function<S, Optional<eoh>> $$1, Consumer<fzm> $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        Optional<eoh> $$6 = this.a.apply($$3);
        if ($$6.isEmpty()) {
            return;
        }
        eoh $$7 = $$6.get();
        dzq $$8 = $$7.b();
        boolean $$9 = $$8 instanceof ebh;
        $$0.a();
        this.b.accept($$0);
        if (!$$9) {
            $$0.a((Quaternionfc)a.f.rotationDegrees(180.0f));
        }
        if ($$9 || $$8 instanceof dym || $$8 instanceof dyh || $$8 instanceof dyk) {
            $$0.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        }
        if ($$8 instanceof ecx) {
            $$0.a(-0.25, -1.5, -0.25);
        } else if (!$$9) {
            $$0.a(-0.5, -1.5, -0.5);
        } else {
            $$0.a(-0.5, 0.0, -0.5);
        }
        $$1.a($$0, $$7, $$2, ilg.d, ((idf)$$3).U);
        $$0.b();
    }
}

