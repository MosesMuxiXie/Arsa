/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gyv
implements gyq,
gyr {
    private static final amo a = amo.b("spectator/teleport_to_team");
    private static final yh b = yh.c("spectatorMenu.team_teleport");
    private static final yh c = yh.c("spectatorMenu.team_teleport.prompt");
    private final List<gyr> d;

    public gyv() {
        gfj $$0 = gfj.V();
        this.d = gyv.a($$0, $$0.r.ab());
    }

    private static List<gyr> a(gfj $$0, fur $$12) {
        return $$12.f().stream().flatMap($$1 -> gyv$a.a($$0, $$1).stream()).toList();
    }

    @Override
    public List<gyr> a() {
        return this.d;
    }

    @Override
    public yh b() {
        return c;
    }

    @Override
    public void a(gyp $$0) {
        $$0.a(this);
    }

    @Override
    public yh bh_() {
        return b;
    }

    @Override
    public void a(gir $$0, float $$1, float $$2) {
        $$0.a(hpa.at, a, 0, 0, 16, 16, bel.a($$2, $$1, $$1, $$1));
    }

    @Override
    public boolean bi_() {
        return !this.d.isEmpty();
    }

    static class a
    implements gyr {
        private final fum a;
        private final Supplier<ddq> b;
        private final List<hiq> c;

        private a(fum $$0, List<hiq> $$1, Supplier<ddq> $$2) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
        }

        public static Optional<gyr> a(gfj $$0, fum $$1) {
            ArrayList<hiq> $$2 = new ArrayList<hiq>();
            for (String $$3 : $$1.h()) {
                hiq $$4 = $$0.R().a($$3);
                if ($$4 == null || $$4.e() == dwl.d) continue;
                $$2.add($$4);
            }
            if ($$2.isEmpty()) {
                return Optional.empty();
            }
            hiq $$5 = (hiq)$$2.get(bgr.a().a($$2.size()));
            return Optional.of(new a($$1, $$2, $$5::g));
        }

        @Override
        public void a(gyp $$0) {
            $$0.a(new gyu(this.c));
        }

        @Override
        public yh bh_() {
            return this.a.d();
        }

        @Override
        public void a(gir $$0, float $$1, float $$2) {
            Integer $$3 = this.a.o().f();
            if ($$3 != null) {
                float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0f;
                float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0f;
                float $$6 = (float)($$3 & 0xFF) / 255.0f;
                $$0.a(1, 1, 15, 15, bel.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
            }
            gke.a($$0, this.b.get(), 2, 2, 12, bel.a($$2, $$1, $$1, $$1));
        }

        @Override
        public boolean bi_() {
            return true;
        }
    }
}

