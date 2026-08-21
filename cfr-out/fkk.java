/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class fkk
extends fkp<a> {
    protected fkk(eqt $$0) {
        super(dww.b, $$0, new a((Long2ObjectOpenHashMap<eql>)new Long2ObjectOpenHashMap()));
    }

    @Override
    protected int a(long $$0) {
        long $$1 = jw.e($$0);
        eql $$2 = this.a($$1, false);
        if ($$2 == null) {
            return 0;
        }
        return $$2.a(jw.b(is.a($$0)), jw.b(is.b($$0)), jw.b(is.c($$0)));
    }

    protected static final class a
    extends fkm<a> {
        public a(Long2ObjectOpenHashMap<eql> $$0) {
            super($$0);
        }

        public a a() {
            return new a((Long2ObjectOpenHashMap<eql>)this.a.clone());
        }

        @Override
        public /* synthetic */ fkm b() {
            return this.a();
        }
    }
}

