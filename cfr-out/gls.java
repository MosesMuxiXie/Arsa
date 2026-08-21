/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class gls
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$12, @Nullable eqq $$2, @Nullable eqq $$3) {
        axf $$6;
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        axf axf2 = $$6 = $$12 instanceof axf ? (axf)$$12 : null;
        if ($$5 == null || $$6 == null) {
            return;
        }
        axc $$7 = $$6.p();
        dwz.d $$8 = $$7.p();
        if ($$8 != null) {
            Object2IntMap<cho> $$9 = $$8.b();
            int $$10 = $$8.a();
            $$0.b("SC: " + $$10 + ", " + Stream.of(cho.values()).map($$1 -> Character.toUpperCase($$1.a().charAt(0)) + ": " + $$9.getInt($$1)).collect(Collectors.joining(", ")));
        }
    }
}

