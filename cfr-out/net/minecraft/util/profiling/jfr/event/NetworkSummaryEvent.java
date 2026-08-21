/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util.profiling.jfr.event;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;
import net.minecraft.obfuscate.DontObfuscate;

@Name(value="minecraft.NetworkSummary")
@Label(value="Network Summary")
@Category(value={"Minecraft", "Network"})
@StackTrace(value=false)
@Period(value="10 s")
@DontObfuscate
public class NetworkSummaryEvent
extends Event {
    public static final String EVENT_NAME = "minecraft.NetworkSummary";
    public static final EventType TYPE = EventType.getEventType(NetworkSummaryEvent.class);
    @Name(value="remoteAddress")
    @Label(value="Remote Address")
    public final String remoteAddress;
    @Name(value="sentBytes")
    @Label(value="Sent Bytes")
    @DataAmount
    public long sentBytes;
    @Name(value="sentPackets")
    @Label(value="Sent Packets")
    public int sentPackets;
    @Name(value="receivedBytes")
    @Label(value="Received Bytes")
    @DataAmount
    public long receivedBytes;
    @Name(value="receivedPackets")
    @Label(value="Received Packets")
    public int receivedPackets;

    public NetworkSummaryEvent(String $$0) {
        this.remoteAddress = $$0;
    }

    public static final class b {
        private final AtomicLong a = new AtomicLong();
        private final AtomicInteger b = new AtomicInteger();
        private final AtomicLong c = new AtomicLong();
        private final AtomicInteger d = new AtomicInteger();
        private final NetworkSummaryEvent e;

        public b(String $$0) {
            this.e = new NetworkSummaryEvent($$0);
            this.e.begin();
        }

        public void a(int $$0) {
            this.b.incrementAndGet();
            this.a.addAndGet($$0);
        }

        public void b(int $$0) {
            this.d.incrementAndGet();
            this.c.addAndGet($$0);
        }

        public void a() {
            this.e.sentBytes = this.a.get();
            this.e.sentPackets = this.b.get();
            this.e.receivedBytes = this.c.get();
            this.e.receivedPackets = this.d.get();
            this.e.commit();
        }
    }

    public static final class a {
        public static final String a = "remoteAddress";
        public static final String b = "sentBytes";
        private static final String d = "sentPackets";
        public static final String c = "receivedBytes";
        private static final String e = "receivedPackets";

        private a() {
        }
    }
}

