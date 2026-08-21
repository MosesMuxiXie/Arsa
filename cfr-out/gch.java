/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class gch {
    public final gds a = new gds(bhs.i(), TimeUnit.MILLISECONDS, bhs.c);
    private final List<gds.e<?>> i;
    public final gds.e<List<gbe>> b;
    public final gds.e<a> c;
    public final gds.e<Integer> d;
    public final gds.e<Boolean> e;
    public final gds.e<gbd> f;
    public final gds.e<gbi> g;
    public final gci h = new gci(new gdx());

    public gch(fzz $$0) {
        this.c = this.a.a("server list", () -> {
            gbh $$1 = $$0.c();
            if (fzu.b()) {
                return new a($$1.a(), $$0.d());
            }
            return new a($$1.a(), List.of());
        }, Duration.ofSeconds(60L), gdt.a);
        this.d = this.a.a("pending invite count", $$0::j, Duration.ofSeconds(10L), gdt.a(360));
        this.e = this.a.a("trial availablity", $$0::n, Duration.ofSeconds(60L), gdt.a(60));
        this.f = this.a.a("unread news", $$0::m, Duration.ofMinutes(5L), gdt.a);
        this.b = this.a.a("notifications", $$0::e, Duration.ofMinutes(5L), gdt.a);
        this.g = this.a.a("online players", $$0::g, Duration.ofSeconds(10L), gdt.a);
        this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public List<gds.e<?>> a() {
        return this.i;
    }

    public record a(List<gbg> a, List<gbg> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "serverList;availableSnapshotServers", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "serverList;availableSnapshotServers", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "serverList;availableSnapshotServers", "a", "b"}, this, $$0);
        }
    }
}

