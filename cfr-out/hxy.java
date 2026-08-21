/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class hxy
extends hvh<cuk, iem, hak> {
    private static final Map<cuk.a, amo> a = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put(cuk.a.b, amo.b("textures/entity/cow/brown_mooshroom.png"));
        $$0.put(cuk.a.a, amo.b("textures/entity/cow/red_mooshroom.png"));
    });

    public hxy(hwq.a $$0) {
        super($$0, new hak($$0.a(hdf.bV)), new hak($$0.a(hdf.bW)), 0.7f);
        this.a(new ibe(this, $$0.d()));
    }

    public amo a(iem $$0) {
        return a.get($$0.a);
    }

    public iem b() {
        return new iem();
    }

    @Override
    public void a(cuk $$0, iem $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gP();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iem)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

