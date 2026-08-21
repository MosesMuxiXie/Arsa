/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSets
 *  it.unimi.dsi.fastutil.longs.LongSets$EmptySet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.LongSets;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class gln
implements gly {
    public static final amo a = amo.b("position");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        if ($$5 == null) {
            return;
        }
        is $$6 = $$4.au().dK();
        dvu $$7 = new dvu($$6);
        iz $$8 = $$5.dg();
        String $$9 = switch ($$8) {
            case iz.c -> "Towards negative Z";
            case iz.d -> "Towards positive Z";
            case iz.e -> "Towards negative X";
            case iz.f -> "Towards positive X";
            default -> "Invalid";
        };
        LongSets.EmptySet $$10 = $$1 instanceof axf ? ((axf)$$1).D() : LongSets.EMPTY_SET;
        $$0.a(a, List.of(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", $$4.au().dP(), $$4.au().dR(), $$4.au().dV()), String.format(Locale.ROOT, "Block: %d %d %d", $$6.u(), $$6.v(), $$6.w()), String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$7.h, jw.a($$6.v()), $$7.i, $$7.k(), $$7.l(), $$7.i(), $$7.j()), String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$8, $$9, Float.valueOf(bgj.f($$5.ec())), Float.valueOf(bgj.f($$5.ee()))), String.valueOf($$4.r.aq().a()) + " FC: " + $$10.size()));
    }
}

