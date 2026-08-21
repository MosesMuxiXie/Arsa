/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class hxh
extends hvd<cur, idx, has> {
    private static final Map<cuy, amo> a = Maps.newEnumMap(Map.of(cuy.a, amo.b("textures/entity/horse/horse_white.png"), cuy.b, amo.b("textures/entity/horse/horse_creamy.png"), cuy.c, amo.b("textures/entity/horse/horse_chestnut.png"), cuy.d, amo.b("textures/entity/horse/horse_brown.png"), cuy.e, amo.b("textures/entity/horse/horse_black.png"), cuy.f, amo.b("textures/entity/horse/horse_gray.png"), cuy.g, amo.b("textures/entity/horse/horse_darkbrown.png")));

    public hxh(hwq.a $$02) {
        super($$02, new has($$02.a(hdf.bx)), new has($$02.a(hdf.bA)));
        this.a(new iax(this));
        this.a(new ibn<idx, has, has>(this, $$02.h(), inr.d.e, $$0 -> $$0.c, new has($$02.a(hdf.by)), new has($$02.a(hdf.bB)), 2));
        this.a(new ibn<idx, has, har>(this, $$02.h(), inr.d.k, $$0 -> $$0.b, new har($$02.a(hdf.bz)), new har($$02.a(hdf.bC)), 2));
    }

    public amo a(idx $$0) {
        return a.get($$0.a);
    }

    public idx b() {
        return new idx();
    }

    @Override
    public void a(cur $$0, idx $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.p();
        $$1.i = $$0.gP();
        $$1.c = $$0.ak().v();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idx)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

