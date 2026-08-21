/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class cgm {
    private final Map<cgl, List<ftm>> a;

    cgm(Map<cgl, List<ftm>> $$0) {
        this.a = $$0;
    }

    public static cgm a(float $$0, float $$1) {
        return cgm.a().a($$0, $$1);
    }

    public static a a() {
        return new a();
    }

    public cgm a(float $$0, float $$1, float $$2) {
        return new cgm(bhs.a(cgl.class, $$3 -> {
            ArrayList<ftm> $$4 = new ArrayList<ftm>();
            for (ftm $$5 : this.a.get($$3)) {
                $$4.add($$5.d($$0, $$1, $$2));
            }
            return $$4;
        }));
    }

    public @Nullable ftm a(cgl $$0, int $$1, float $$2) {
        List<ftm> $$3 = this.a.get((Object)$$0);
        if ($$1 < 0 || $$1 >= $$3.size()) {
            return null;
        }
        return cgm.a($$3.get($$1), $$2);
    }

    public ftm b(cgl $$0, int $$1, float $$2) {
        ftm $$3 = this.a($$0, $$1, $$2);
        if ($$3 == null) {
            throw new IllegalStateException("Had no attachment point of type: " + String.valueOf((Object)$$0) + " for index: " + $$1);
        }
        return $$3;
    }

    public ftm a(cgl $$0) {
        List<ftm> $$1 = this.a.get((Object)$$0);
        if ($$1 == null || $$1.isEmpty()) {
            throw new IllegalStateException("No attachment points of type: PASSENGER");
        }
        ftm $$2 = ftm.c;
        for (ftm $$3 : $$1) {
            $$2 = $$2.e($$3);
        }
        return $$2.c((double)(1.0f / (float)$$1.size()));
    }

    public ftm c(cgl $$0, int $$1, float $$2) {
        List<ftm> $$3 = this.a.get((Object)$$0);
        if ($$3.isEmpty()) {
            throw new IllegalStateException("Had no attachment points of type: " + String.valueOf((Object)$$0));
        }
        ftm $$4 = $$3.get(bgj.a($$1, 0, $$3.size() - 1));
        return cgm.a($$4, $$2);
    }

    private static ftm a(ftm $$0, float $$1) {
        return $$0.b(-$$1 * ((float)Math.PI / 180));
    }

    public static class a {
        private final Map<cgl, List<ftm>> a = new EnumMap<cgl, List<ftm>>(cgl.class);

        a() {
        }

        public a a(cgl $$0, float $$1, float $$2, float $$3) {
            return this.a($$0, new ftm($$1, $$2, $$3));
        }

        public a a(cgl $$02, ftm $$1) {
            this.a.computeIfAbsent($$02, $$0 -> new ArrayList(1)).add($$1);
            return this;
        }

        public cgm a(float $$0, float $$1) {
            Map<cgl, List<ftm>> $$22 = bhs.a(cgl.class, $$2 -> {
                List<ftm> $$3 = this.a.get($$2);
                return $$3 == null ? $$2.a($$0, $$1) : List.copyOf($$3);
            });
            return new cgm($$22);
        }
    }
}

