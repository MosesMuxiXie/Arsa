/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSortedSets
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.SequencedSet;

public final class dpd
extends Record {
    private final boolean d;
    private final SequencedSet<kh<?>> e;
    private static final Codec<SequencedSet<kh<?>>> f = kh.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
    public static final Codec<dpd> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("hide_tooltip", (Object)false).forGetter(dpd::a), (App)f.optionalFieldOf("hidden_components", (Object)ReferenceSortedSets.emptySet()).forGetter(dpd::b)).apply((Applicative)$$0, dpd::new));
    public static final aao<xq, dpd> b = aao.a(aam.b, dpd::a, kh.b.a(aam.a(ReferenceLinkedOpenHashSet::new)), dpd::b, dpd::new);
    public static final dpd c = new dpd(false, (SequencedSet<kh<?>>)ReferenceSortedSets.emptySet());

    public dpd(boolean $$0, SequencedSet<kh<?>> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public dpd a(kh<?> $$0, boolean $$1) {
        if (this.e.contains($$0) == $$1) {
            return this;
        }
        ReferenceLinkedOpenHashSet $$2 = new ReferenceLinkedOpenHashSet(this.e);
        if ($$1) {
            $$2.add($$0);
        } else {
            $$2.remove($$0);
        }
        return new dpd(this.d, (SequencedSet<kh<?>>)$$2);
    }

    public boolean a(kh<?> $$0) {
        return !this.d && !this.e.contains($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpd.class, "hideTooltip;hiddenComponents", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpd.class, "hideTooltip;hiddenComponents", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpd.class, "hideTooltip;hiddenComponents", "d", "e"}, this, $$0);
    }

    public boolean a() {
        return this.d;
    }

    public SequencedSet<kh<?>> b() {
        return this.e;
    }
}

