/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class gli
implements gly {
    private static final amo a = amo.b("looking_at_entity");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.t;
        ArrayList<String> $$6 = new ArrayList<String>();
        if ($$5 != null) {
            $$6.add(String.valueOf(l.t) + "Targeted Entity");
            $$6.add(String.valueOf(mi.g.b($$5.ay())));
        }
        $$0.a(a, $$6);
    }
}

