/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;
import org.jspecify.annotations.Nullable;

public class cad {
    private Instant a = Instant.EPOCH;
    private Instant b = Instant.EPOCH;
    private final List<cai> c = new ArrayList<cai>();
    private final List<caq> d = new ArrayList<caq>();
    private final List<cak> e = new ArrayList<cak>();
    private final Map<cap, a> f = new HashMap<cap, a>();
    private final Map<cap, a> g = new HashMap<cap, a>();
    private final Map<caj, a> h = new HashMap<caj, a>();
    private final Map<caj, a> i = new HashMap<caj, a>();
    private final List<cal> j = new ArrayList<cal>();
    private final List<cal> k = new ArrayList<cal>();
    private int l;
    private Duration m = Duration.ZERO;
    private final List<can> n = new ArrayList<can>();
    private final List<car> o = new ArrayList<car>();
    private final List<cam> p = new ArrayList<cam>();
    private final List<cas> q = new ArrayList<cas>();
    private @Nullable Duration r = null;

    private cad(Stream<RecordedEvent> $$0) {
        this.a($$0);
    }

    public static cae a(Path $$0) {
        cae cae2;
        final RecordingFile $$1 = new RecordingFile($$0);
        try {
            Iterator<RecordedEvent> $$2 = new Iterator<RecordedEvent>(){

                @Override
                public boolean hasNext() {
                    return $$1.hasMoreEvents();
                }

                public RecordedEvent a() {
                    if (!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    try {
                        return $$1.readEvent();
                    }
                    catch (IOException $$0) {
                        throw new UncheckedIOException($$0);
                    }
                }

                @Override
                public /* synthetic */ Object next() {
                    return this.a();
                }
            };
            Stream<RecordedEvent> $$3 = StreamSupport.stream(Spliterators.spliteratorUnknownSize($$2, 1297), false);
            cae2 = new cad($$3).a();
        }
        catch (Throwable throwable) {
            try {
                try {
                    $$1.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException $$4) {
                throw new UncheckedIOException($$4);
            }
        }
        $$1.close();
        return cae2;
    }

    private cae a() {
        Duration $$0 = Duration.between(this.a, this.b);
        return new cae(this.a, this.b, $$0, this.r, this.p, this.q, this.e, can.a($$0, this.n, this.m, this.l), car.a(this.o), cad.a($$0, this.f), cad.a($$0, this.g), cad.a($$0, this.i), cad.a($$0, this.h), cal.a($$0, this.j), cal.a($$0, this.k), this.c, this.d);
    }

    private void a(Stream<RecordedEvent> $$02) {
        $$02.forEach($$0 -> {
            if ($$0.getEndTime().isAfter(this.b) || this.b.equals(Instant.EPOCH)) {
                this.b = $$0.getEndTime();
            }
            if ($$0.getStartTime().isBefore(this.a) || this.a.equals(Instant.EPOCH)) {
                this.a = $$0.getStartTime();
            }
            switch ($$0.getEventType().getName()) {
                case "minecraft.ChunkGeneration": {
                    this.c.add(cai.a($$0));
                    break;
                }
                case "minecraft.StructureGeneration": {
                    this.d.add(caq.a($$0));
                    break;
                }
                case "minecraft.LoadWorld": {
                    this.r = $$0.getDuration();
                    break;
                }
                case "minecraft.ClientFps": {
                    this.p.add(cam.a($$0, "fps"));
                    break;
                }
                case "minecraft.ServerTickTime": {
                    this.q.add(cas.a($$0));
                    break;
                }
                case "minecraft.PacketReceived": {
                    this.a((RecordedEvent)$$0, $$0.getInt("bytes"), this.f);
                    break;
                }
                case "minecraft.PacketSent": {
                    this.a((RecordedEvent)$$0, $$0.getInt("bytes"), this.g);
                    break;
                }
                case "minecraft.ChunkRegionRead": {
                    this.b((RecordedEvent)$$0, $$0.getInt("bytes"), this.h);
                    break;
                }
                case "minecraft.ChunkRegionWrite": {
                    this.b((RecordedEvent)$$0, $$0.getInt("bytes"), this.i);
                    break;
                }
                case "jdk.ThreadAllocationStatistics": {
                    this.o.add(car.a($$0));
                    break;
                }
                case "jdk.GCHeapSummary": {
                    this.n.add(can.a($$0));
                    break;
                }
                case "jdk.CPULoad": {
                    this.e.add(cak.a($$0));
                    break;
                }
                case "jdk.FileWrite": {
                    this.a((RecordedEvent)$$0, this.j, "bytesWritten");
                    break;
                }
                case "jdk.FileRead": {
                    this.a((RecordedEvent)$$0, this.k, "bytesRead");
                    break;
                }
                case "jdk.GarbageCollection": {
                    ++this.l;
                    this.m = this.m.plus($$0.getDuration());
                    break;
                }
            }
        });
    }

    private void a(RecordedEvent $$02, int $$1, Map<cap, a> $$2) {
        $$2.computeIfAbsent(cap.a($$02), $$0 -> new a()).a($$1);
    }

    private void b(RecordedEvent $$02, int $$1, Map<caj, a> $$2) {
        $$2.computeIfAbsent(caj.a($$02), $$0 -> new a()).a($$1);
    }

    private void a(RecordedEvent $$0, List<cal> $$1, String $$2) {
        $$1.add(new cal($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
    }

    private static <T> cao<T> a(Duration $$02, Map<T, a> $$1) {
        List $$2 = $$1.entrySet().stream().map($$0 -> Pair.of($$0.getKey(), (Object)((a)$$0.getValue()).a())).toList();
        return new cao($$02, $$2);
    }

    public static final class a {
        private long a;
        private long b;

        public void a(int $$0) {
            this.b += (long)$$0;
            ++this.a;
        }

        public cao.a a() {
            return new cao.a(this.a, this.b);
        }
    }
}

