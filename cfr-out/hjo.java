/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.minecraft.report.ReportedEntity
 *  com.mojang.datafixers.util.Either
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class hjo
extends hjj {
    final Supplier<ddq> g;

    hjo(UUID $$0, Instant $$1, UUID $$2, Supplier<ddq> $$3) {
        super($$0, $$1, $$2);
        this.g = $$3;
    }

    public Supplier<ddq> a() {
        return this.g;
    }

    public hjo c() {
        hjo $$0 = new hjo(this.a, this.b, this.c, this.g);
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        return $$0;
    }

    @Override
    public gsb a(gsb $$0, hjn $$1) {
        return new gxl($$0, $$1, this);
    }

    @Override
    public /* synthetic */ hjj b() {
        return this.c();
    }

    public static class a
    extends hjj.a<hjo> {
        public a(hjo $$0, AbuseReportLimits $$1) {
            super($$0, $$1);
        }

        public a(UUID $$0, Supplier<ddq> $$1, AbuseReportLimits $$2) {
            super(new hjo(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
        }

        @Override
        public boolean b() {
            return StringUtils.isNotEmpty((CharSequence)this.g()) || this.i() != null;
        }

        @Override
        public @Nullable hjj.b c() {
            if (((hjo)this.a).e == null) {
                return hjj.b.a;
            }
            if (((hjo)this.a).d.length() > this.b.maxOpinionCommentsLength()) {
                return hjj.b.d;
            }
            return super.c();
        }

        @Override
        public Either<hjj.c, hjj.b> a(hjn $$0) {
            String string;
            hjj.b $$1 = this.c();
            if ($$1 != null) {
                return Either.right((Object)$$1);
            }
            String $$2 = Objects.requireNonNull(((hjo)this.a).e).a();
            ReportedEntity $$3 = new ReportedEntity(((hjo)this.a).c);
            ddq $$4 = ((hjo)this.a).g.get();
            iu.c c2 = $$4.a();
            if (c2 instanceof iu.a) {
                iu.a $$5 = (iu.a)c2;
                string = $$5.c();
            } else {
                string = null;
            }
            String $$6 = string;
            AbuseReport $$7 = AbuseReport.skin((String)((hjo)this.a).d, (String)$$2, (String)$$6, (ReportedEntity)$$3, (Instant)((hjo)this.a).b);
            return Either.left((Object)new hjj.c(((hjo)this.a).a, hjm.b, $$7));
        }
    }
}

