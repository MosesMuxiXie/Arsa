/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record cae(Instant a, Instant b, Duration c, @Nullable Duration d, List<cam> e, List<cas> f, List<cak> g, can.a h, car.a i, cao<cap> j, cao<cap> k, cao<caj> l, cao<caj> m, cal.a n, cal.a o, List<cai> p, List<caq> q) {
    private final Instant a;
    private final Instant b;
    private final Duration c;
    private final @Nullable Duration d;
    private final List<cam> e;
    private final List<cas> f;
    private final List<cak> g;
    private final can.a h;
    private final car.a i;
    private final cao<cap> j;
    private final cao<cap> k;
    private final cao<caj> l;
    private final cao<caj> m;
    private final cal.a n;
    private final cal.a o;
    private final List<cai> p;
    private final List<caq> q;

    public List<Pair<erj, cau<cai>>> a() {
        Map<erj, List<cai>> $$02 = this.p.stream().collect(Collectors.groupingBy(cai::d));
        return $$02.entrySet().stream().map($$0 -> Pair.of((Object)((erj)$$0.getKey()), cau.a((List)$$0.getValue()))).filter($$0 -> ((Optional)$$0.getSecond()).isPresent()).map($$0 -> Pair.of((Object)((erj)$$0.getFirst()), (Object)((cau)((Optional)$$0.getSecond()).get()))).sorted(Comparator.comparing($$0 -> ((cau)$$0.getSecond()).f()).reversed()).toList();
    }

    public String b() {
        return new cag().a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cae.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;fps;serverTickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;writtenChunks;readChunks;fileWrites;fileReads;chunkGenStats;structureGenStats", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cae.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;fps;serverTickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;writtenChunks;readChunks;fileWrites;fileReads;chunkGenStats;structureGenStats", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cae.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;fps;serverTickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;writtenChunks;readChunks;fileWrites;fileReads;chunkGenStats;structureGenStats", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"}, this, $$0);
    }

    public Instant c() {
        return this.a;
    }

    public Instant d() {
        return this.b;
    }

    public Duration e() {
        return this.c;
    }

    public @Nullable Duration f() {
        return this.d;
    }

    public List<cam> g() {
        return this.e;
    }

    public List<cas> h() {
        return this.f;
    }

    public List<cak> i() {
        return this.g;
    }

    public can.a j() {
        return this.h;
    }

    public car.a k() {
        return this.i;
    }

    public cao<cap> l() {
        return this.j;
    }

    public cao<cap> m() {
        return this.k;
    }

    public cao<caj> n() {
        return this.l;
    }

    public cao<caj> o() {
        return this.m;
    }

    public cal.a p() {
        return this.n;
    }

    public cal.a q() {
        return this.o;
    }

    public List<cai> r() {
        return this.p;
    }

    public List<caq> s() {
        return this.q;
    }
}

