/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.MinecraftClientException
 *  com.mojang.authlib.exceptions.MinecraftClientException$ErrorType
 *  com.mojang.authlib.exceptions.MinecraftClientHttpException
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest
 *  com.mojang.datafixers.util.Unit
 */
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import com.mojang.datafixers.util.Unit;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public interface hje {
    public static hje a(hjk $$0, UserApiService $$1) {
        return new b($$0, $$1);
    }

    public CompletableFuture<Unit> a(UUID var1, hjm var2, AbuseReport var3);

    public boolean a();

    default public AbuseReportLimits b() {
        return AbuseReportLimits.DEFAULTS;
    }

    public record b(hjk a, UserApiService b) implements hje
    {
        private final hjk a;
        private final UserApiService b;
        private static final yh c = yh.c("gui.abuseReport.send.service_unavailable");
        private static final yh d = yh.c("gui.abuseReport.send.http_error");
        private static final yh e = yh.c("gui.abuseReport.send.json_error");

        @Override
        public CompletableFuture<Unit> a(UUID $$0, hjm $$1, AbuseReport $$2) {
            return CompletableFuture.supplyAsync(() -> {
                AbuseReportRequest $$3 = new AbuseReportRequest(1, $$0, $$2, this.a.b(), this.a.c(), this.a.d(), $$1.a());
                try {
                    this.b.reportAbuse($$3);
                    return Unit.INSTANCE;
                }
                catch (MinecraftClientHttpException $$4) {
                    yh $$5 = this.a($$4);
                    throw new CompletionException(new a($$5, (Throwable)$$4));
                }
                catch (MinecraftClientException $$6) {
                    yh $$7 = this.a($$6);
                    throw new CompletionException(new a($$7, (Throwable)$$6));
                }
            }, bhs.i());
        }

        @Override
        public boolean a() {
            return this.b.canSendReports();
        }

        private yh a(MinecraftClientHttpException $$0) {
            return yh.a("gui.abuseReport.send.error_message", new Object[]{$$0.getMessage()});
        }

        private yh a(MinecraftClientException $$0) {
            return switch ($$0.getType()) {
                default -> throw new MatchException(null, null);
                case MinecraftClientException.ErrorType.SERVICE_UNAVAILABLE -> c;
                case MinecraftClientException.ErrorType.HTTP_ERROR -> d;
                case MinecraftClientException.ErrorType.JSON_ERROR -> e;
            };
        }

        @Override
        public AbuseReportLimits b() {
            return this.b.getAbuseReportLimits();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "environment;userApiService", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "environment;userApiService", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "environment;userApiService", "a", "b"}, this, $$0);
        }

        public hjk c() {
            return this.a;
        }

        public UserApiService d() {
            return this.b;
        }
    }

    public static class a
    extends zi {
        public a(yh $$0, Throwable $$1) {
            super($$0, $$1);
        }
    }
}

