/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class iax
extends ibj<idx, has> {
    private static final amo a = amo.b("invisible");
    private static final Map<cut, amo> b = Maps.newEnumMap(Map.of(cut.a, a, cut.b, amo.b("textures/entity/horse/horse_markings_white.png"), cut.c, amo.b("textures/entity/horse/horse_markings_whitefield.png"), cut.d, amo.b("textures/entity/horse/horse_markings_whitedots.png"), cut.e, amo.b("textures/entity/horse/horse_markings_blackdots.png")));

    public iax(hyq<idx, has> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, idx $$3, float $$4, float $$5) {
        amo $$6 = b.get((Object)$$3.i);
        if ($$6 == a || $$3.Q) {
            return;
        }
        $$1.a(1).a(this.d(), $$3, $$0, ijt.j($$6), $$2, hxs.a($$3, 0.0f), -1, (ilp)null, $$3.U, (igi.a)null);
    }
}

