/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ffr
extends fmn {
    private final LongSet b;
    private final LongSet c;
    private static final Codec<LongSet> d = Codec.LONG_STREAM.xmap(LongOpenHashSet::toSet, LongCollection::longStream);
    public static final Codec<ffr> a = RecordCodecBuilder.create($$02 -> $$02.group((App)d.fieldOf("All").forGetter($$0 -> $$0.b), (App)d.fieldOf("Remaining").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, ffr::new));

    public static fmo<ffr> a(String $$0) {
        return new fmo<ffr>($$0, ffr::new, a, bhz.q);
    }

    private ffr(LongSet $$0, LongSet $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public ffr() {
        this((LongSet)new LongOpenHashSet(), (LongSet)new LongOpenHashSet());
    }

    public void a(long $$0) {
        this.b.add($$0);
        this.c.add($$0);
        this.u();
    }

    public boolean b(long $$0) {
        return this.b.contains($$0);
    }

    public boolean c(long $$0) {
        return this.c.contains($$0);
    }

    public void d(long $$0) {
        if (this.c.remove($$0)) {
            this.u();
        }
    }

    public LongSet b() {
        return this.b;
    }
}

