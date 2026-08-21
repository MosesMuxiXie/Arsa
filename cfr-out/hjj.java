/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public abstract class hjj {
    protected final UUID a;
    protected final Instant b;
    protected final UUID c;
    protected String d = "";
    protected @Nullable hjl e;
    protected boolean f;

    public hjj(UUID $$0, Instant $$1, UUID $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public boolean a(UUID $$0) {
        return $$0.equals(this.c);
    }

    public abstract hjj b();

    public abstract gsb a(gsb var1, hjn var2);

    public static final class b
    extends Record {
        private final yh f;
        public static final b a = new b(yh.c("gui.abuseReport.send.no_reason"));
        public static final b b = new b(yh.c("gui.chatReport.send.no_reported_messages"));
        public static final b c = new b(yh.c("gui.chatReport.send.too_many_messages"));
        public static final b d = new b(yh.c("gui.abuseReport.send.comment_too_long"));
        public static final b e = new b(yh.c("gui.abuseReport.send.not_attested"));

        public b(yh $$0) {
            this.f = $$0;
        }

        public gks a() {
            return gks.a(this.f);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message", "f"}, this, $$0);
        }

        public yh b() {
            return this.f;
        }
    }

    public record c(UUID a, hjm b, AbuseReport c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id;reportType;report", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id;reportType;report", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id;reportType;report", "a", "b", "c"}, this, $$0);
        }
    }

    public static abstract class a<R extends hjj> {
        protected final R a;
        protected final AbuseReportLimits b;

        protected a(R $$0, AbuseReportLimits $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public R e() {
            return this.a;
        }

        public UUID f() {
            return ((hjj)this.a).c;
        }

        public String g() {
            return ((hjj)this.a).d;
        }

        public boolean h() {
            return ((hjj)this.e()).f;
        }

        public void a(String $$0) {
            ((hjj)this.a).d = $$0;
        }

        public @Nullable hjl i() {
            return ((hjj)this.a).e;
        }

        public void a(hjl $$0) {
            ((hjj)this.a).e = $$0;
        }

        public void a(boolean $$0) {
            ((hjj)this.a).f = $$0;
        }

        public abstract boolean b();

        public @Nullable b c() {
            if (!((hjj)this.e()).f) {
                return hjj$b.e;
            }
            return null;
        }

        public abstract Either<c, b> a(hjn var1);
    }
}

