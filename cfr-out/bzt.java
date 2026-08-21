/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jdk.jfr.Configuration;
import jdk.jfr.Event;
import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent;
import net.minecraft.util.profiling.jfr.event.ChunkRegionReadEvent;
import net.minecraft.util.profiling.jfr.event.ChunkRegionWriteEvent;
import net.minecraft.util.profiling.jfr.event.ClientFpsEvent;
import net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent;
import net.minecraft.util.profiling.jfr.event.PacketReceivedEvent;
import net.minecraft.util.profiling.jfr.event.PacketSentEvent;
import net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent;
import net.minecraft.util.profiling.jfr.event.StructureGenerationEvent;
import net.minecraft.util.profiling.jfr.event.WorldLoadFinishedEvent;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bzt
implements bzu {
    private static final Logger g = LogUtils.getLogger();
    public static final String a = "Minecraft";
    public static final String b = "World Generation";
    public static final String c = "Ticking";
    public static final String d = "Network";
    public static final String e = "Storage";
    private static final List<Class<? extends Event>> h = List.of(ChunkGenerationEvent.class, ChunkRegionReadEvent.class, ChunkRegionWriteEvent.class, PacketReceivedEvent.class, PacketSentEvent.class, NetworkSummaryEvent.class, ServerTickTimeEvent.class, ClientFpsEvent.class, StructureGenerationEvent.class, WorldLoadFinishedEvent.class);
    private static final String i = "/flightrecorder-config.jfc";
    private static final DateTimeFormatter j = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd-HHmmss").toFormatter(Locale.ROOT).withZone(ZoneId.systemDefault());
    private static final bzt k = new bzt();
    @Nullable Recording l;
    private int m;
    private float n;
    private final Map<String, NetworkSummaryEvent.b> o = new ConcurrentHashMap<String, NetworkSummaryEvent.b>();
    private final Runnable p = () -> new ClientFpsEvent(this.m).commit();
    private final Runnable q = () -> new ServerTickTimeEvent(this.n).commit();
    private final Runnable r = () -> {
        Iterator<NetworkSummaryEvent.b> $$0 = this.o.values().iterator();
        while ($$0.hasNext()) {
            $$0.next().a();
            $$0.remove();
        }
    };

    private bzt() {
        h.forEach(FlightRecorder::register);
        this.f();
        FlightRecorder.addListener(new FlightRecorderListener(){

            @Override
            public void recordingStateChanged(Recording $$0) {
                switch ($$0.getState()) {
                    case STOPPED: {
                        bzt.this.f();
                        break;
                    }
                }
            }
        });
    }

    void f() {
        bzt.a(ClientFpsEvent.class, this.p);
        bzt.a(ServerTickTimeEvent.class, this.q);
        bzt.a(NetworkSummaryEvent.class, this.r);
    }

    private static void a(Class<? extends Event> $$0, Runnable $$1) {
        FlightRecorder.removePeriodicEvent($$1);
        FlightRecorder.addPeriodicEvent($$0, $$1);
    }

    public static bzt a() {
        return k;
    }

    @Override
    public boolean a(bzs $$0) {
        boolean bl2;
        URL $$1 = bzt.class.getResource(i);
        if ($$1 == null) {
            g.warn("Could not find default flight recorder config at {}", (Object)i);
            return false;
        }
        BufferedReader $$2 = new BufferedReader(new InputStreamReader($$1.openStream(), StandardCharsets.UTF_8));
        try {
            bl2 = this.a($$2, $$0);
        }
        catch (Throwable throwable) {
            try {
                try {
                    $$2.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException $$3) {
                g.warn("Failed to start flight recorder using configuration at {}", (Object)$$1, (Object)$$3);
                return false;
            }
        }
        $$2.close();
        return bl2;
    }

    @Override
    public Path b() {
        if (this.l == null) {
            throw new IllegalStateException("Not currently profiling");
        }
        this.o.clear();
        Path $$0 = this.l.getDestination();
        this.l.stop();
        return $$0;
    }

    @Override
    public boolean c() {
        return this.l != null;
    }

    @Override
    public boolean d() {
        return FlightRecorder.isAvailable();
    }

    private boolean a(Reader $$0, bzs $$1) {
        if (this.c()) {
            g.warn("Profiling already in progress");
            return false;
        }
        try {
            Configuration $$22 = Configuration.create($$0);
            String $$3 = j.format(Instant.now());
            this.l = bhs.a(new Recording($$22), (? super T $$2) -> {
                h.forEach($$2::enable);
                $$2.setDumpOnExit(true);
                $$2.setToDisk(true);
                $$2.setName(String.format(Locale.ROOT, "%s-%s-%s", $$1.a(), w.b().c(), $$3));
            });
            Path $$4 = Paths.get(String.format(Locale.ROOT, "debug/%s-%s.jfr", $$1.a(), $$3), new String[0]);
            bfp.c($$4.getParent());
            this.l.setDestination($$4);
            this.l.start();
            this.g();
        }
        catch (IOException | ParseException $$5) {
            g.warn("Failed to start jfr profiling", (Throwable)$$5);
            return false;
        }
        g.info("Started flight recorder profiling id({}):name({}) - will dump to {} on exit or stop command", new Object[]{this.l.getId(), this.l.getName(), this.l.getDestination()});
        return true;
    }

    private void g() {
        FlightRecorder.addListener(new FlightRecorderListener(){
            final bzw a = new bzw(() -> {
                bzt.this.l = null;
            });

            @Override
            public void recordingStateChanged(Recording $$0) {
                if ($$0 != bzt.this.l) {
                    return;
                }
                switch ($$0.getState()) {
                    case STOPPED: {
                        this.a.a($$0.getDestination());
                        FlightRecorder.removeListener(this);
                        break;
                    }
                }
            }
        });
    }

    @Override
    public void a(int $$0) {
        if (ClientFpsEvent.TYPE.isEnabled()) {
            this.m = $$0;
        }
    }

    @Override
    public void a(float $$0) {
        if (ServerTickTimeEvent.TYPE.isEnabled()) {
            this.n = $$0;
        }
    }

    @Override
    public void a(wv $$0, aba<?> $$1, SocketAddress $$2, int $$3) {
        if (PacketReceivedEvent.TYPE.isEnabled()) {
            new PacketReceivedEvent($$0.a(), $$1.a().b(), $$1.b().toString(), $$2, $$3).commit();
        }
        if (NetworkSummaryEvent.TYPE.isEnabled()) {
            this.a($$2).b($$3);
        }
    }

    @Override
    public void b(wv $$0, aba<?> $$1, SocketAddress $$2, int $$3) {
        if (PacketSentEvent.TYPE.isEnabled()) {
            new PacketSentEvent($$0.a(), $$1.a().b(), $$1.b().toString(), $$2, $$3).commit();
        }
        if (NetworkSummaryEvent.TYPE.isEnabled()) {
            this.a($$2).a($$3);
        }
    }

    private NetworkSummaryEvent.b a(SocketAddress $$0) {
        return this.o.computeIfAbsent($$0.toString(), NetworkSummaryEvent.b::new);
    }

    @Override
    public void a(esa $$0, dvu $$1, erz $$2, int $$3) {
        if (ChunkRegionReadEvent.TYPE.isEnabled()) {
            new ChunkRegionReadEvent($$0, $$1, $$2, $$3).commit();
        }
    }

    @Override
    public void b(esa $$0, dvu $$1, erz $$2, int $$3) {
        if (ChunkRegionWriteEvent.TYPE.isEnabled()) {
            new ChunkRegionWriteEvent($$0, $$1, $$2, $$3).commit();
        }
    }

    @Override
    public @Nullable bzx e() {
        if (!WorldLoadFinishedEvent.TYPE.isEnabled()) {
            return null;
        }
        WorldLoadFinishedEvent $$0 = new WorldLoadFinishedEvent();
        $$0.begin();
        return $$1 -> $$0.commit();
    }

    @Override
    public @Nullable bzx a(dvu $$0, amt<dwo> $$12, String $$2) {
        if (!ChunkGenerationEvent.TYPE.isEnabled()) {
            return null;
        }
        ChunkGenerationEvent $$3 = new ChunkGenerationEvent($$0, $$12, $$2);
        $$3.begin();
        return $$1 -> $$3.commit();
    }

    @Override
    public @Nullable bzx a(dvu $$0, amt<dwo> $$12, jd<ffo> $$2) {
        if (!StructureGenerationEvent.TYPE.isEnabled()) {
            return null;
        }
        StructureGenerationEvent $$3 = new StructureGenerationEvent($$0, $$2, $$12);
        $$3.begin();
        return $$1 -> {
            $$0.success = $$1;
            $$3.commit();
        };
    }
}

