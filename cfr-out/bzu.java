/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import jdk.jfr.FlightRecorder;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public interface bzu {
    public static final bzu f = Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() && FlightRecorder.isAvailable() ? bzt.a() : new a();

    public boolean a(bzs var1);

    public Path b();

    public boolean c();

    public boolean d();

    public void a(float var1);

    public void a(int var1);

    public void a(wv var1, aba<?> var2, SocketAddress var3, int var4);

    public void b(wv var1, aba<?> var2, SocketAddress var3, int var4);

    public void a(esa var1, dvu var2, erz var3, int var4);

    public void b(esa var1, dvu var2, erz var3, int var4);

    public @Nullable bzx e();

    public @Nullable bzx a(dvu var1, amt<dwo> var2, String var3);

    public @Nullable bzx a(dvu var1, amt<dwo> var2, jd<ffo> var3);

    public static class a
    implements bzu {
        private static final Logger b = LogUtils.getLogger();
        static final bzx a = $$0 -> {};

        @Override
        public boolean a(bzs $$0) {
            b.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
            return false;
        }

        @Override
        public Path b() {
            throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public boolean d() {
            return false;
        }

        @Override
        public void a(wv $$0, aba<?> $$1, SocketAddress $$2, int $$3) {
        }

        @Override
        public void b(wv $$0, aba<?> $$1, SocketAddress $$2, int $$3) {
        }

        @Override
        public void a(esa $$0, dvu $$1, erz $$2, int $$3) {
        }

        @Override
        public void b(esa $$0, dvu $$1, erz $$2, int $$3) {
        }

        @Override
        public void a(float $$0) {
        }

        @Override
        public void a(int $$0) {
        }

        @Override
        public bzx e() {
            return a;
        }

        @Override
        public @Nullable bzx a(dvu $$0, amt<dwo> $$1, String $$2) {
            return null;
        }

        @Override
        public bzx a(dvu $$0, amt<dwo> $$1, jd<ffo> $$2) {
            return a;
        }
    }
}

