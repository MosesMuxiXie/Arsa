/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import jdk.jfr.consumer.RecordedEvent;

public record cap(String a, String b, String c) {
    public static cap a(RecordedEvent $$0) {
        return new cap($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cap.class, "direction;protocolId;packetId", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cap.class, "direction;protocolId;packetId", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cap.class, "direction;protocolId;packetId", "a", "b", "c"}, this, $$0);
    }
}

