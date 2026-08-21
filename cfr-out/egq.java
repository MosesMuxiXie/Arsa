/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public interface egq {
    public static final egq w_ = new egq(){

        @Override
        public boolean a(dwp $$0, is $$1, eoh $$2, @Nullable Collection<iz> $$3, boolean $$4) {
            if ($$3 == null) {
                return ((egw)dzs.rT).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
            }
            if (!$$3.isEmpty()) {
                if ($$2.l() || $$2.y().b(flc.c)) {
                    return egw.a($$0, $$1, $$2, $$3);
                }
                return false;
            }
            return egq.super.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public int a(egv.a $$0, dwp $$1, is $$2, bgr $$3, egv $$4, boolean $$5) {
            return $$0.c() > 0 ? $$0.b() : 0;
        }

        @Override
        public int j_(int $$0) {
            return Math.max($$0 - 1, 0);
        }
    };

    default public byte b() {
        return 1;
    }

    default public void a(dwp $$0, eoh $$1, is $$2, bgr $$3) {
    }

    default public boolean a(dwp $$0, is $$1, bgr $$2) {
        return false;
    }

    default public boolean a(dwp $$0, is $$1, eoh $$2, @Nullable Collection<iz> $$3, boolean $$4) {
        return ((eez)dzs.rT).c().a($$2, $$0, $$1, $$4) > 0L;
    }

    default public boolean d() {
        return true;
    }

    default public int j_(int $$0) {
        return 1;
    }

    public int a(egv.a var1, dwp var2, is var3, bgr var4, egv var5, boolean var6);
}

