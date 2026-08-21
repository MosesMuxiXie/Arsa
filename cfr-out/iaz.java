/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class iaz
extends ibj<ieb, hbr> {
    private static final Map<cgg.a, amo> a = ImmutableMap.of((Object)((Object)cgg.a.b), (Object)amo.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"), (Object)((Object)cgg.a.c), (Object)amo.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"), (Object)((Object)cgg.a.d), (Object)amo.b("textures/entity/iron_golem/iron_golem_crackiness_high.png"));

    public iaz(hyq<ieb, hbr> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ieb $$3, float $$4, float $$5) {
        if ($$3.Q) {
            return;
        }
        cgg.a $$6 = $$3.c;
        if ($$6 == cgg.a.a) {
            return;
        }
        amo $$7 = a.get((Object)$$6);
        iaz.b(this.d(), $$7, $$0, $$1, $$2, $$3, -1, 1);
    }
}

