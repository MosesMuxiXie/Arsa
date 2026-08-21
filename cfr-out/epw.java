/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.stream.Stream;

public final class epw
extends Record {
    private final String n;
    private final eow o;
    private final ehs p;
    private final ehs q;
    private final bcz r;
    private final bcz s;
    private static final Map<String, epw> t = new Object2ObjectArrayMap();
    public static final Codec<epw> a = Codec.stringResolver(epw::b, t::get);
    public static final epw b = epw.a(new epw("oak", eow.g));
    public static final epw c = epw.a(new epw("spruce", eow.h));
    public static final epw d = epw.a(new epw("birch", eow.i));
    public static final epw e = epw.a(new epw("acacia", eow.j));
    public static final epw f = epw.a(new epw("cherry", eow.k, ehs.aX, ehs.ba, bda.fn, bda.fo));
    public static final epw g = epw.a(new epw("jungle", eow.l));
    public static final epw h = epw.a(new epw("dark_oak", eow.m));
    public static final epw i = epw.a(new epw("pale_oak", eow.n));
    public static final epw j = epw.a(new epw("crimson", eow.o, ehs.aW, ehs.aT, bda.ty, bda.tz));
    public static final epw k = epw.a(new epw("warped", eow.p, ehs.aW, ehs.aT, bda.ty, bda.tz));
    public static final epw l = epw.a(new epw("mangrove", eow.q));
    public static final epw m = epw.a(new epw("bamboo", eow.r, ehs.aV, ehs.aU, bda.bI, bda.bJ));

    public epw(String $$0, eow $$1) {
        this($$0, $$1, ehs.b, ehs.aS, bda.kv, bda.kw);
    }

    public epw(String $$0, eow $$1, ehs $$2, ehs $$3, bcz $$4, bcz $$5) {
        this.n = $$0;
        this.o = $$1;
        this.p = $$2;
        this.q = $$3;
        this.r = $$4;
        this.s = $$5;
    }

    private static epw a(epw $$0) {
        t.put($$0.b(), $$0);
        return $$0;
    }

    public static Stream<epw> a() {
        return t.values().stream();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{epw.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "n", "o", "p", "q", "r", "s"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{epw.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "n", "o", "p", "q", "r", "s"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{epw.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "n", "o", "p", "q", "r", "s"}, this, $$0);
    }

    public String b() {
        return this.n;
    }

    public eow c() {
        return this.o;
    }

    public ehs d() {
        return this.p;
    }

    public ehs e() {
        return this.q;
    }

    public bcz f() {
        return this.r;
    }

    public bcz g() {
        return this.s;
    }
}

