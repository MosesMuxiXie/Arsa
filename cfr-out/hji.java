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
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class hji
extends hjj {
    private final String g;

    hji(UUID $$0, Instant $$1, UUID $$2, String $$3) {
        super($$0, $$1, $$2);
        this.g = $$3;
    }

    public String a() {
        return this.g;
    }

    public hji c() {
        hji $$0 = new hji(this.a, this.b, this.c, this.g);
        $$0.d = this.d;
        $$0.f = this.f;
        return $$0;
    }

    @Override
    public gsb a(gsb $$0, hjn $$1) {
        return new gxi($$0, $$1, this);
    }

    @Override
    public /* synthetic */ hjj b() {
        return this.c();
    }

    public static class a
    extends hjj.a<hji> {
        public a(hji $$0, AbuseReportLimits $$1) {
            super($$0, $$1);
        }

        public a(UUID $$0, String $$1, AbuseReportLimits $$2) {
            super(new hji(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
        }

        @Override
        public boolean b() {
            return StringUtils.isNotEmpty((CharSequence)this.g());
        }

        @Override
        public @Nullable hjj.b c() {
            if (((hji)this.a).d.length() > this.b.maxOpinionCommentsLength()) {
                return hjj.b.d;
            }
            return super.c();
        }

        @Override
        public Either<hjj.c, hjj.b> a(hjn $$0) {
            hjj.b $$1 = this.c();
            if ($$1 != null) {
                return Either.right((Object)$$1);
            }
            ReportedEntity $$2 = new ReportedEntity(((hji)this.a).c);
            AbuseReport $$3 = AbuseReport.name((String)((hji)this.a).d, (ReportedEntity)$$2, (Instant)((hji)this.a).b);
            return Either.left((Object)new hjj.c(((hji)this.a).a, hjm.c, $$3));
        }
    }
}

