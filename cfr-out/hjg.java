/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.minecraft.report.ReportChatMessage
 *  com.mojang.authlib.minecraft.report.ReportEvidence
 *  com.mojang.authlib.minecraft.report.ReportedEntity
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class hjg
extends hjj {
    final IntSet g = new IntOpenHashSet();

    hjg(UUID $$0, Instant $$1, UUID $$2) {
        super($$0, $$1, $$2);
    }

    public void a(int $$0, AbuseReportLimits $$1) {
        if (this.g.contains($$0)) {
            this.g.remove($$0);
        } else if (this.g.size() < $$1.maxReportedMessageCount()) {
            this.g.add($$0);
        }
    }

    public hjg a() {
        hjg $$0 = new hjg(this.a, this.b, this.c);
        $$0.g.addAll((IntCollection)this.g);
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        return $$0;
    }

    @Override
    public gsb a(gsb $$0, hjn $$1) {
        return new gxf($$0, $$1, this);
    }

    @Override
    public /* synthetic */ hjj b() {
        return this.a();
    }

    public static class a
    extends hjj.a<hjg> {
        public a(hjg $$0, AbuseReportLimits $$1) {
            super($$0, $$1);
        }

        public a(UUID $$0, AbuseReportLimits $$1) {
            super(new hjg(UUID.randomUUID(), Instant.now(), $$0), $$1);
        }

        public IntSet a() {
            return ((hjg)this.a).g;
        }

        public void a(int $$0) {
            ((hjg)this.a).a($$0, this.b);
        }

        public boolean b(int $$0) {
            return ((hjg)this.a).g.contains($$0);
        }

        @Override
        public boolean b() {
            return StringUtils.isNotEmpty((CharSequence)this.g()) || !this.a().isEmpty() || this.i() != null;
        }

        @Override
        public @Nullable hjj.b c() {
            if (((hjg)this.a).g.isEmpty()) {
                return hjj.b.b;
            }
            if (((hjg)this.a).g.size() > this.b.maxReportedMessageCount()) {
                return hjj.b.c;
            }
            if (((hjg)this.a).e == null) {
                return hjj.b.a;
            }
            if (((hjg)this.a).d.length() > this.b.maxOpinionCommentsLength()) {
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
            String $$2 = Objects.requireNonNull(((hjg)this.a).e).a();
            ReportEvidence $$3 = this.b($$0);
            ReportedEntity $$4 = new ReportedEntity(((hjg)this.a).c);
            AbuseReport $$5 = AbuseReport.chat((String)((hjg)this.a).d, (String)$$2, (ReportEvidence)$$3, (ReportedEntity)$$4, (Instant)((hjg)this.a).b);
            return Either.left((Object)new hjj.c(((hjg)this.a).a, hjm.a, $$5));
        }

        private ReportEvidence b(hjn $$0) {
            ArrayList $$12 = new ArrayList();
            hjh $$22 = new hjh(this.b.leadingContextMessageCount());
            $$22.a($$0.b(), (IntCollection)((hjg)this.a).g, (int $$1, hjc.a $$2) -> $$12.add(this.a($$2, this.b($$1))));
            return new ReportEvidence(Lists.reverse($$12));
        }

        private ReportChatMessage a(hjc.a $$0, boolean $$1) {
            zd $$2 = $$0.g().k();
            zb $$3 = $$0.g().m();
            List<ByteBuffer> $$4 = $$3.d().b().stream().map(yu::a).toList();
            ByteBuffer $$5 = t.a($$0.g().l(), yu::a);
            return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
        }

        public a d() {
            return new a(((hjg)this.a).a(), this.b);
        }
    }
}

